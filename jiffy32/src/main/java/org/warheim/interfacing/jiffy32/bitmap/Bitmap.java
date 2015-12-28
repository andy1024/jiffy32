package org.warheim.interfacing.jiffy32.bitmap;

import org.warheim.interfacing.jiffy32.bitmap.fonts.Font;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * based on Guy Carpenter's py-gaugette and Adafruit_SSD1306 library
 *
 * @author andy
 */
public class Bitmap {
    private static final Logger logger = LoggerFactory.getLogger(Bitmap.class);
    
    // Pixels are stored in column-major order!
    // This makes it easy to reference a vertical slice of the display buffer
    // and we use the to achieve reasonable performance vertical scrolling 
    // without hardware support.
    private int rows;
    private int cols;
    private int bytesPerCol;
    private byte data[];

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getBytesPerCol() {
        return bytesPerCol;
    }

    public void setBytesPerCol(int bytes_per_col) {
        this.bytesPerCol = bytes_per_col;
    }

    public Bitmap(int cols, int rows) {
        this.rows = rows;
        this.cols = cols;
        this.bytesPerCol = rows / 8;
        data = new byte [cols * bytesPerCol];
    }
    
    public void copyPortion(byte[] bitmapPortion, int start) {
        System.arraycopy(data, start, bitmapPortion, 0, bitmapPortion.length);
    }

    public void clear() {
        for (int i=0;i<data.length;++i) {
            data[i] = 0;
        }
    }
/*
    // Diagnostic print of the memory buffer to stdout 
    public void dump(self) {
        for y in range(0, rows) {
            mem_row = y/8
            bit_mask = 1 << (y % 8)
            line = ""
            for x in range(0, cols) {
                mem_col = x
                offset = mem_row + rows/8 * mem_col
                if data[offset] & bit_mask:
                    line += '*'
                else:
                    line += ' '
            print('|'+line+'|')
*/
    

    public void drawPixel(int x, int y, boolean on/*=True*/) {
        if (x<0 || x>=cols || y<0 || y>=rows) {
            return;
        }
        int memCol = x;
        int memRow = y / 8;
        int bitMask = 1 << (y % 8);
        int offset = memRow + rows/8 * memCol;

        if (on) {
            data[offset] |= bitMask;
        } else {
            data[offset] &= (0xFF - bitMask);
        }
    }

    public void clearBlock(int x0, int y0, int dx, int dy) {
        for (int x=x0;x<x0+dx;++x) {
            for (int y=y0;y<y0+dy;++y) {
                drawPixel(x,y,false);
            }
        }
    }

    // returns the width in pixels of the string allowing for kerning & interchar-spaces
    public int textWidth(String string, Font font) {
        int x = 0;
        Character prevChar = null;
        int prevWidth = 0;
        for (int i=0; i<string.length(); ++i) {
            char c = string.charAt(i);
            if (c<font.getStartChar() || c>font.getEndChar()) {
                if (prevChar != null) {
                    x += font.getSpaceWidth() + prevWidth + font.getGapWidth();
                }
                prevChar = null;
            } else {
                int pos = c - font.getStartChar();
                int width = font.getDescriptors()[pos][0];
                int offset = font.getDescriptors()[pos][1];
                if (prevChar != null) {
                    x += font.getKerning()[prevChar][pos] + font.getGapWidth();
                }
                prevChar = (char)pos;
                prevWidth = width;
            }
        }

        if (prevChar != null) {
            x += prevWidth;
        }

        return x;
    }
    
    private static void print(String s) {
        logger.debug(s);
    }

    private static void print(String s, Object... args) {
        print(String.format(s, args));
    }

    public int drawText(int x, int y, String string, Font font) {
        int height = font.getCharHeight();
        Character prevChar = null;
        print("1 height=%d", height);
        int prevWidth = 0;
        for (int i=0; i<string.length(); ++i) {
            char c = string.charAt(i);
            print("2 char=%c", c);
            if (c<font.getStartChar() || c>font.getEndChar()) {
                if (prevChar != null) {
                    print("3a outside, prev_char=%c", prevChar);
                    x += font.getSpaceWidth() + prevWidth + font.getGapWidth();
                    print("3b x=%d", x);
                }
                prevChar = null;
            } else {
                int pos = c - font.getStartChar();
                print("4a pos=%d", pos);
                int width = font.getDescriptors()[pos][0];
                int offset = font.getDescriptors()[pos][1];
                print("4b width=%d offset=%d", width, offset);
                if (prevChar != null) {
                    print("5a prev_char not null");
                    x += font.getKerning()[prevChar][pos] + font.getGapWidth();
                    print("5b x=%d", x);
                }
                prevChar = (char)pos;
                prevWidth = width;
                print("6a prev_char=%c prev_width=%d",(int)prevChar, prevWidth);
                int bytesPerRow = (width + 7) / 8;
                print("6b bytes_per_row=%d", bytesPerRow);
                for (int row=0; row<height; ++row) {
                    print("7a row=%d", row);
                    int py = y + row;
                    byte mask = (byte)0x80;
                    int p = offset;
                    print("7b py=%d mask=%x p=%d",py, mask, p);
                    for (int col=0; col<width; ++col) {
                        print("8a col=%d", col);
                        int px = x + col;
                        print("8b px=%d", px);
                        if ((font.getBitmaps()[p] & mask)!=0) {
                            print("9 and mask");
                            drawPixel(px,py,true);  // for kerning, never draw black
                        }
                        mask = (byte)((mask & 0xff) >>> 1); //Oh God... why?
                        print("9.1 mask=%x", mask);
                        if (mask == 0) {
                            mask = (byte)0x80;
                            p+=1;
                        }
                        print("10 mask=%x p=%d", mask, p);
                    }
                    offset += bytesPerRow;
                    print("11 offset=%d",offset);
                }
            }
        }
        if (prevChar != null) {
            x += prevWidth;
            print("12 prev_char not null, x=%d",x);
        }
        print("13 x=%d",x);
        return x;
    }

}
