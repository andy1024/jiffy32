package org.warheim.interfacing.jiffy32.fonts.bitmap;

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
public abstract class BitmapFont implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(BitmapFont.class);
    private final String name;
    private final char startChar;
    private final char endChar;
    private final int charHeight;
    private final int spaceWidth;
    private final int gapWidth;
    
    protected byte[] bitmaps;

    final protected void readBitmapFile(String bitmapBinaryFilename) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream(bitmapBinaryFilename)) {
            bitmaps = new byte[(int) resourceStream.available()];
            try (DataInputStream dis = new DataInputStream(resourceStream)) {
                dis.readFully(bitmaps);
            }
        } catch (IOException ex) {
            logger.error("Main config not found", ex);
        }
    }
    
    public BitmapFont(String name, char startChar, char endChar, int charHeight, int spaceWidth, int gapWidth, String bitmapBinaryFilename) {
        this.name = name;
        this.startChar = startChar;
        this.endChar = endChar;
        this.charHeight = charHeight;
        this.spaceWidth = spaceWidth;
        this.gapWidth = gapWidth;
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

    public char getStartChar() {
        return startChar;
    }

    public char getEndChar() {
        return endChar;
    }

    public int getCharHeight() {
        return charHeight;
    }

    public int getSpaceWidth() {
        return spaceWidth;
    }

    public int getGapWidth() {
        return gapWidth;
    }
  
}
