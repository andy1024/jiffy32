package org.warheim.interfacing.jiffy32.hl;

import org.warheim.interfacing.jiffy32.hl.i2c.I2C_SSD1306;
import org.warheim.interfacing.jiffy32.fonts.bitmap.BitmapFont;
import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.warheim.interfacing.jiffy32.core.FF32Factory;
import org.warheim.interfacing.jiffy32.core.FF32c;
import org.warheim.interfacing.jiffy32.bitmap.FontDrawer;
import org.warheim.interfacing.jiffy32.model.Pin;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Arial16;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Arial24;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Arial32;
import org.warheim.interfacing.jiffy32.fonts.bitmap.ArialNarrow16;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Curlz22;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Curlz32;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Magneto16;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Magneto24;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Magneto32;
import org.warheim.interfacing.jiffy32.fonts.bitmap.OldEnglish30;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Stencil16;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Stencil24;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Stencil33;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Tahoma16;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Tahoma24;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Tahoma32;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Verdana15;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Verdana24;
import org.warheim.interfacing.jiffy32.fonts.bitmap.Verdana32;

/**
 *
 * @author andy
 */
public class FontDemo {
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
        List<BitmapFont> fonts = new ArrayList<>();
        fonts.add(new Arial16());
        fonts.add(new ArialNarrow16());
        fonts.add(new Arial24());
        fonts.add(new Arial32());
        fonts.add(new Curlz22());
        fonts.add(new Curlz32());
        fonts.add(new Magneto16());
        fonts.add(new Magneto24());
        fonts.add(new Magneto32());
        fonts.add(new OldEnglish30());
        fonts.add(new Stencil16());
        fonts.add(new Stencil24());
        fonts.add(new Stencil33());
        fonts.add(new Tahoma16());
        fonts.add(new Tahoma24());
        fonts.add(new Tahoma32());
        fonts.add(new Verdana15());
        fonts.add(new Verdana24());
        fonts.add(new Verdana32());
        
        int fc = 0;
        BitmapFont font = fonts.get(fc);
        FontDrawer fd = new FontDrawer();
        while (true) {
            // retrieve current date 
            DateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
            String text = formatter.format(new Date());
            // wipe area and show date
            oled.clearBlock(0,0,159,35);
            font.draw(0,0,text,true, oled.getBitmap(), fd);
            System.out.println(String.format("[x,y]=%f,%f [px,py]=%f,%f [dx,dy]=%f,%f", x, y, px, py, dx, dy));
            oled.drawPixel((int)px, (int)py, false);
            oled.drawPixel((int)x, (int)y, true);
            oled.display();
            Thread.sleep(5);
            i++;
            if (i>10) {
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
