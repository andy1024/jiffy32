package org.warheim.interfacing.jiffy32.demo;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.warheim.interfacing.jiffy32.FF32Factory;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.Pin;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import org.warheim.interfacing.jiffy32.bitmap.SysFontDrawer;
import org.warheim.interfacing.jiffy32.hl.I2C_SSD1306;
import org.warheim.interfacing.jiffy32.bitmap.VectorFontFactory;

/**
 *
 * @author andy
 */
public class I2C_SSD1306VectorFontDemo {

    public static final String DATE_FORMAT = "HH:mm:ss";
    static {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }

    public static void main(String... args) throws Exception {
        FF32c jiffy = FF32Factory.getInstance();
        I2C_SSD1306 oled = new I2C_SSD1306(jiffy, 0x3C, Pin.A5, Pin.A6, 64, 128, 64, 128);
        oled.begin(I2C_SSD1306.SWITCH_CAP_VCC);
        oled.clearDisplay();
        oled.display();
        oled.invertDisplay();
        Thread.sleep(500);
        oled.normalDisplay();
        Thread.sleep(500);
        int i = 0;
        float dx = 1.0f;
        float dy = 0.4f;
        float px = -1;
        float py = -1;
        float x = 60;
        float y = 40;
        List<Font> fonts = new ArrayList<>();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String testValue = "17:12:59";
        for (String s: ge.getAvailableFontFamilyNames()) {
            Font f = VectorFontFactory.getFont(s, Font.PLAIN, 20, true, true);
            if (f.canDisplayUpTo(testValue)==-1) {
                System.out.println(f.getName());
                fonts.add(f);
            }
        }

        
        int fc = 0;
        Font font = fonts.get(fc);
        while (true) {
            // retrieve current date 
            DateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
            String text = formatter.format(new Date());
            // wipe area and show date
            oled.clearBlock(0,0,159,35);
            SysFontDrawer.drawStringToBitmap(text, font, true, 0, 0, oled.getBitmap());
            
            System.out.println(String.format("[x,y]=%f,%f [px,py]=%f,%f [dx,dy]=%f,%f", x, y, px, py, dx, dy));
            oled.drawPixel((int)px, (int)py, false);
            oled.drawPixel((int)x, (int)y, true);
            oled.display();
            Thread.sleep(5);
            i++;
            if (i>5) {
                i=0;
                fc++;
                if (fc>=fonts.size()) {
                    fc=0;
                }
                font = fonts.get(fc);
            }
            px = x;
            py = y;
            x = x + dx;
            y = y + dy;
            if (x>(oled.getCols()-1)||x<0) {
                dx = -1 * dx;
                x = x + dx;
            }
            if (y>(oled.getRows()-1)||y<0) {
                dy = -1 * dy;
                y = y + dy;
            }
        }
    }

}
