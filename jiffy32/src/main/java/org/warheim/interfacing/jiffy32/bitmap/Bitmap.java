package org.warheim.interfacing.jiffy32.bitmap;

import org.warheim.interfacing.jiffy32.fonts.SimpleFont;
import org.warheim.interfacing.jiffy32.fonts.VectorFont;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.warheim.interfacing.jiffy32.fonts.bitmap.BitmapFont;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * based on Guy Carpenter's py-gaugette and Adafruit_SSD1306 library
 * Bresenham algorithms come from wikipedia
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
    public boolean getPixel(int x, int y) {
        if (x<0 || x>=cols || y<0 || y>=rows) {
            return false;
        }
        int memCol = x;
        int memRow = y / 8;
        int bitMask = 1 << (y % 8);
        int offset = memRow + (rows / 8) * memCol;

        return (data[offset] & bitMask)>0;
    }
    
    public void drawPixel(int x, int y, int on) {
        drawPixel(x,y,(on==1));
    }

    public void drawPixel(int x, int y, boolean on/*=True*/) {
        if (x<0 || x>=cols || y<0 || y>=rows) {
            return;
        }
        int memCol = x;
        int memRow = y / 8;
        int bitMask = 1 << (y % 8);
        int offset = memRow + (rows / 8) * memCol;

        if (on) {
            data[offset] |= bitMask;
        } else {
            data[offset] &= (0xFF - bitMask);
        }
    }
    
    public void drawCircle(int x0, int y0, int r, float w, boolean on) {
        int x = r;
        int y = 0;
        int decisionOver2 = 1 - x;

        while( y <= x )
        {
          drawPixel( x + x0,  y + y0, on);
          drawPixel( y + x0,  x + y0, on);
          drawPixel(-x + x0,  y + y0, on);
          drawPixel(-y + x0,  x + y0, on);
          drawPixel(-x + x0, -y + y0, on);
          drawPixel(-y + x0, -x + y0, on);
          drawPixel( x + x0, -y + y0, on);
          drawPixel( y + x0, -x + y0, on);
          y++;
          if (decisionOver2<=0)
          {
            decisionOver2 += 2 * y + 1;
          }
          else
          {
            x--;
            decisionOver2 += 2 * (y - x) + 1;
          }
        }
    }
    
    public void drawFilledRect(int x1, int y1, int x2, int y2, int w, boolean on) {
        for (int x=x1;x<=x2;++x) {
            for (int y=y1;y<=y2;++y) {
                drawPixel(x, y, on);
            }
        }
    }

    public void drawRect(int x1, int y1, int x2, int y2, int w, boolean on) {
        for (int x=x1;x<=x2;++x) {
            drawPixel(x, y1, on);
            drawPixel(x, y2, on);
        }
        for (int y=y1;y<=y2;++y) {
            drawPixel(x1, y, on);
            drawPixel(x2, y, on);
        }
    }

    public void drawLine(int x1, int y1, int x2, int y2, int w, boolean on) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double error = 0;
        if (dx==0) {
            for (int y=y1;y<=y2;++y) {
                drawPixel(x1, y, on);
            }
        } else {
            double de = Math.abs(dy/dx);
            int y = y1;
            for (int x=x1;x<=x2;++x) {
                drawPixel(x, y, on);
                error = error + de;
                while (error>=0.5) {
                    drawPixel(x, y, on);
                    y+=Math.signum(y2-y1);
                    error-=1;
                }
            }
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
    public int textWidth(String string, BitmapFont font) {
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

    //draws text using simple font
    public void drawText(int x, int y, String string, SimpleFont font) {
        byte[] fontBytes = font.getBytes();
        int fontRows = font.getRows();
        int fontCols = font.getCols();
        for (int i=0; i<string.length(); ++i) {
            char c = string.charAt(i);
            int p = c * fontCols;
            for (int col=0; col<fontCols; ++col) {
                byte mask = fontBytes[p];
                p+=1;
                for (int row=0; row<fontRows; ++row) {
                    drawPixel(x,y+row,mask & 0x1);
                    mask >>= 1;
                }
                x += 1;
            }
        }
    }

    public void drawText(int x, int y, String string, SimpleFont font, int size/*=2*/, int space/*=1*/) {
        byte[] fontBytes = font.getBytes();
        int fontRows = font.getRows();
        int fontCols = font.getCols();
        for (int i=0; i<string.length(); ++i) {
            char c = string.charAt(i);
            int p = c * fontCols;
            for (int col=0; col<fontCols; ++col) {
                byte mask = fontBytes[p];
                p+=1;
                int py = y;
                for (int row=0; row<fontRows; ++row) {
                    for (int sy=0;sy<size;++sy) {
                        int px = x;
                        for (int sx=0;sx<size; ++sx) {
                            drawPixel(px,py,mask & 0x1);
                            px += 1;
                        }
                        py += 1;
                    }
                    mask >>= 1;
                }
                x += size;
            }
            x += space;
        }
    }

    public int drawText(int x, int y, String string, BitmapFont font) {
        int height = font.getCharHeight();
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
                int bytesPerRow = (width + 7) / 8;
                for (int row=0; row<height; ++row) {
                    int py = y + row;
                    byte mask = (byte)0x80;
                    int p = offset;
                    for (int col=0; col<width; ++col) {
                        int px = x + col;
                        if ((font.getBitmaps()[p] & mask)!=0) {
                            drawPixel(px,py,true);  // for kerning, never draw black
                        }
                        mask = (byte)((mask & 0xff) >>> 1); //Oh God... why?
                        if (mask == 0) {
                            mask = (byte)0x80;
                            p+=1;
                        }
                    }
                    offset += bytesPerRow;
                }
            }
        }
        if (prevChar != null) {
            x += prevWidth;
        }
        return x;
    }

    public static int calculate8bitAlignedRemainder(int w) {
        int widRemainder = 8-(w & 7);
        return widRemainder;
    }
    
    public void drawText(int x0, int y0, String text, VectorFont f) {
        drawText(x0, y0, text, f, true);
    }
    
    public void drawText(int x0, int y0, String text, VectorFont f, boolean on) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        //predraw text to get measurements
        BufferedImage bi = new BufferedImage(1, 1, BufferedImage.TYPE_BYTE_BINARY);
        Graphics2D g2 = ge.createGraphics(bi);
        g2.setFont(f);
        //TODO: check if it's necessary and if it introduces any side effects
        //if destination text position is not 8-bit aligned, move it right to align with 8-bit boundary
        int positionRemainder = calculate8bitAlignedRemainder(x0);
        int x = 0;
        FontRenderContext frc = g2.getFontRenderContext();
        LineMetrics lm = f.getLineMetrics(text, frc);

        int asc = (int) lm.getAscent();
        int y = 0 + asc;
        g2.drawString(text, x, y + asc);
        FontMetrics metrics = g2.getFontMetrics(f);
        Rectangle2D r = metrics.getStringBounds(text, null);
        g2.dispose();
        
        //get measurements
        int width = (int) (r.getWidth())+positionRemainder;
        int height = (int) (r.getHeight());
        
        //align to byte
        width += calculate8bitAlignedRemainder(width);
        
        //draw text onto virtual BufferedImage
        bi = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);
        g2 = ge.createGraphics(bi);
        g2.setColor(Color.white);
        g2.setFont(f);
        g2.drawString(text, x+positionRemainder, y);
        g2.dispose();
        
        for (int col=0;col<bi.getWidth();++col) {
            for (int row=0;row<bi.getHeight();++row) {
                if (bi.getRGB(col, row)==-1) {
                    drawPixel(x0+col, y0+row, on);
                }
            }
        }

    }

}
