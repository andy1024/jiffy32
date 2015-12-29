package org.warheim.interfacing.jiffy32.hl;

import org.warheim.interfacing.jiffy32.bitmap.fonts.Font;
import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.warheim.interfacing.jiffy32.FF32Factory;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.Pin;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Arial16;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Arial24;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Arial32;
import org.warheim.interfacing.jiffy32.bitmap.fonts.ArialNarrow16;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Curlz22;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Curlz32;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Magneto16;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Magneto24;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Magneto32;
import org.warheim.interfacing.jiffy32.bitmap.fonts.OldEnglish30;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Stencil16;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Stencil24;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Stencil33;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Tahoma16;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Tahoma24;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Tahoma32;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Verdana15;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Verdana24;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Verdana32;

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
        List<Font> fonts = new ArrayList<>();
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
        Font font = fonts.get(fc);
        while (true) {
            // retrieve current date 
            DateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
            String text = formatter.format(new Date());
            // wipe area and show date
            oled.clearBlock(0,0,159,35);
            oled.drawText(0,0,text,font);
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
