package org.warheim.interfacing.jiffy32.bitmap;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import javax.imageio.ImageIO;
/**
 *
 * @author andy
 */
public class SysFontDrawer {
    
    public static int calculate8bitAlignedRemainder(int w) {
        int widRemainder = 8-(w & 7);
        return widRemainder;
    }
    
    public static void drawStringToBitmap(String text, Font f, boolean on, int x0, int y0, Bitmap bitmap) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        //predraw text to get measurements
        BufferedImage bi = new BufferedImage(1, 1, BufferedImage.TYPE_BYTE_BINARY);
        Graphics2D g2 = ge.createGraphics(bi);
        g2.setFont(f);
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
        
        //transfer text onto bitmap
        byte[] byteArray = ((DataBufferByte) bi.getData().getDataBuffer()).getData();
//        for (byte b: byteArray) {
//            System.out.printf("%02x\n", b);
//        }
        for (int col=0;col<bi.getWidth();++col) {
            for (int row=0;row<bi.getHeight();++row) {
                //System.out.printf("pixel at %d,%d=%d\n",x0+col, y0+row, bi.getRGB(x0+col, y0+row));
                if (bi.getRGB(col, row)==-1) {
                    //System.out.printf("pixel at %d,%d\n",x0+col, y0+row);
                    bitmap.draw_pixel(x0+col, y0+row, on);
                }
            }
        }

    }
    
    public static void main(String... args) {
        int width=63;
        int widRemainder = 8-(width & 7);
        int newWidth = width + widRemainder;
        System.out.printf("width =%d remainder=%d newWidth=%d\n", width, widRemainder, newWidth);
    }
}
