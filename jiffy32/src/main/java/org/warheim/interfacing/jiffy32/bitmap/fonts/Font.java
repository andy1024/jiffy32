package org.warheim.interfacing.jiffy32.bitmap.fonts;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author andy
 */
public abstract class Font implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(Font.class);
    private final String name;
    private final char start_char;
    private final char end_char;
    private final int char_height;
    private final int space_width;
    private final int gap_width;
    
    protected byte[] bitmaps;

    protected void readBitmapFile(String bitmapBinaryFilename) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream(bitmapBinaryFilename)) {
            bitmaps = new byte[(int) resourceStream.available()];
            DataInputStream dis = new DataInputStream(resourceStream);
            dis.readFully(bitmaps);
            dis.close();
        } catch (IOException ex) {
            logger.error("Main config not found", ex);
        }
    }
    
    public Font(String name, char start_char, char end_char, int char_height, int space_width, int gap_width, String bitmapBinaryFilename) {
        this.name = name;
        this.start_char = start_char;
        this.end_char = end_char;
        this.char_height = char_height;
        this.space_width = space_width;
        this.gap_width = gap_width;
        readBitmapFile(bitmapBinaryFilename);
    }
    
    public byte[] getBitmaps() {
        return bitmaps;
    }
    
    public abstract int[][] getDescriptors();
    
    public abstract byte[][] getKerning();

    public String getName() {
        return name;
    }

    public char getStart_char() {
        return start_char;
    }

    public char getEnd_char() {
        return end_char;
    }

    public int getChar_height() {
        return char_height;
    }

    public int getSpace_width() {
        return space_width;
    }

    public int getGap_width() {
        return gap_width;
    }
  
}
