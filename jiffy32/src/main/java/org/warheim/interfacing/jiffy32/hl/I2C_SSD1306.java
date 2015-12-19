package org.warheim.interfacing.jiffy32.hl;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.io.IOException;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.FF32Factory;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.Pin;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;

/**
 * I2C driven OLED screen
 *
 * @author andy
 */
public class I2C_SSD1306 {
    Logger logger = LoggerFactory.getLogger(I2C_SSD1306.class);
    private static final int SLAVE_ADDRESS = 0x78;
    public static final int DEFAULT_WIDTH = 128;
    public static final int DEFAULT_HEIGHT = 64;
    
    static {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }
    
    final private FF32c jiffy;
    ImageBuffer imageBuffer;
    
    public I2C_SSD1306(FF32c jiffy, Pin SCL, Pin SDA, int width, int height) throws IOException, JiffyException, ArgumentException {
        this.jiffy = jiffy;
        jiffy.setI2CPins(SCL, SDA);
        this.imageBuffer = new ImageBuffer(width, height);
    }
    
    public I2C_SSD1306(Pin SCL, Pin SDA, int width, int height) throws IOException, JiffyException, ArgumentException {
        this(FF32Factory.getInstance(), SCL, SDA, width, height);
    }

    public boolean init() {
        return true;
    }
    
    public void setPixel(int x, int y, boolean color) throws ArgumentException {
        if (x<0||x>imageBuffer.getWidth()||y<0||y>imageBuffer.getHeight()) {
            throw new ArgumentException("Pixel position outside boundaries");
        }
        imageBuffer.setPixel(x, y, color);
    }
    
    public boolean getPixel(int x, int y) throws ArgumentException {
        if (x<0||x>imageBuffer.getWidth()||y<0||y>imageBuffer.getHeight()) {
            throw new ArgumentException("Pixel position outside boundaries");
        }
        return imageBuffer.getPixel(x, y);
    }
    
    public void drawLine(int x1, int y1, int x2, int y2, boolean color) throws ArgumentException {
        if (x1<0||x1>imageBuffer.getWidth()||y1<0||y1>imageBuffer.getHeight()
                || 
            x2<0||x2>imageBuffer.getWidth()||y2<0||y2>imageBuffer.getHeight()) {
            throw new ArgumentException("Line ends outside boundaries");
        }
        //TODO: bresenham line
    }

    public void drawCircle(int x, int y, int r, boolean color) throws ArgumentException {
        if (x-r<0||x+r>imageBuffer.getWidth()||y-r<0||y+r>imageBuffer.getHeight()) {
            throw new ArgumentException("Circle ends outside boundaries");
        }
        //TODO: bresenham circle
    }

    public void replaceBuffer(ImageBuffer ib) throws ArgumentException {
        if (ib.sameSize(imageBuffer)) {
            imageBuffer.replace(ib);
        } else {
            throw new ArgumentException("Buffers differ in size");
        }
    }

    public void putBuffer() throws ArgumentException {
        //TODO: draw the entire buffer to the device
    }

    public int readPort(int portNumber) throws IOException, JiffyException, ArgumentException {
        jiffy.writeByteI2C(SLAVE_ADDRESS, portNumber);
        int retval = jiffy.readByteI2C(SLAVE_ADDRESS);
        return retval;
    }
    
    public static void main(String... args) throws Exception {
        I2C_SSD1306 chip = new I2C_SSD1306(Pin.B9, Pin.B10, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        System.out.println(chip.readPort(0x03));
    }

}
