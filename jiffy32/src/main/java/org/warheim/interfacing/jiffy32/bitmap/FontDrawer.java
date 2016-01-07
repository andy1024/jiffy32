package org.warheim.interfacing.jiffy32.bitmap;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.warheim.interfacing.jiffy32.fonts.SimpleFont;
import org.warheim.interfacing.jiffy32.fonts.VectorFont;
import org.warheim.interfacing.jiffy32.fonts.bitmap.BitmapFont;

/**
 *
 * @author andy
 */
public class FontDrawer {
    public static int calculate8bitAlignedRemainder(int w) {
        int widRemainder = 8-(w & 7);
        return widRemainder;
    }

    public int visit(SimpleFont font, int x, int y, String str, boolean on, Bitmap bitmap) {
        int color = (on?0x01:0x00);
        byte[] fontBytes = font.getBytes();
        int fontRows = font.getRows();
        int fontCols = font.getCols();
        if (font.getSize()==1&&font.getSpace()==1) {
            for (int i=0; i<str.length(); ++i) {
                char c = str.charAt(i);
                int p = c * fontCols;
                for (int col=0; col<fontCols; ++col) {
                    byte mask = fontBytes[p];
                    p+=1;
                    for (int row=0; row<fontRows; ++row) {
                        bitmap.drawPixel(x,y+row,mask & color);
                        mask >>= 1;
                    }
                    x += 1;
                }
            }
        } else {
            int size = font.getSize();
            int space = font.getSpace();
            for (int i=0; i<str.length(); ++i) {
                char c = str.charAt(i);
                int p = c * fontCols;
                for (int col=0; col<fontCols; ++col) {
                    byte mask = fontBytes[p];
                    p+=1;
                    int py = y;
                    for (int row=0; row<fontRows; ++row) {
                        for (int sy=0;sy<size;++sy) {
                            int px = x;
                            for (int sx=0;sx<size; ++sx) {
                                bitmap.drawPixel(px,py,mask & color);
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
        return x;
    }
    
    public int visit(BitmapFont font, int x, int y, String str, boolean on, Bitmap bitmap) {
        int height = font.getCharHeight();
        Character prevChar = null;
        int prevWidth = 0;
        for (int i=0; i<str.length(); ++i) {
            char c = str.charAt(i);
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
                            bitmap.drawPixel(px,py,true);  // for kerning, never draw black
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

    public int visit(VectorFont font, int x0, int y0, String str, boolean on, Bitmap bitmap) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        //predraw text to get measurements
        BufferedImage bi = new BufferedImage(1, 1, BufferedImage.TYPE_BYTE_BINARY);
        Graphics2D g2 = ge.createGraphics(bi);
        g2.setFont(font);
        //TODO: check if it's necessary and if it introduces any side effects
        //if destination text position is not 8-bit aligned, move it right to align with 8-bit boundary
        int positionRemainder = calculate8bitAlignedRemainder(x0);
        int x = 0;
        FontRenderContext frc = g2.getFontRenderContext();
        LineMetrics lm = font.getLineMetrics(str, frc);

        int asc = (int) lm.getAscent();
        int y = 0 + asc;
        g2.drawString(str, x, y + asc);
        FontMetrics metrics = g2.getFontMetrics(font);
        Rectangle2D r = metrics.getStringBounds(str, null);
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
        g2.setFont(font);
        g2.drawString(str, x+positionRemainder, y);
        g2.dispose();
        
        for (int col=0;col<bi.getWidth();++col) {
            for (int row=0;row<bi.getHeight();++row) {
                if (bi.getRGB(col, row)==-1) {
                    bitmap.drawPixel(x0+col, y0+row, on);
                }
            }
        }
        return x0+width;
    }
    
}
