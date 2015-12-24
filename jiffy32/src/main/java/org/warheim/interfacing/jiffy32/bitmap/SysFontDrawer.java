package org.warheim.interfacing.jiffy32.bitmap;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;
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
    
    private static double DELTA_THETA = Math.PI / 90;
    
    public static BufferedImage tilt(BufferedImage image, double angle) {
        double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
        int w = image.getWidth(), h = image.getHeight();
        int neww = (int)Math.floor(w*cos+h*sin), newh = (int)Math.floor(h*cos+w*sin);
        int transparency = image.getColorModel().getTransparency();
        BufferedImage result = new BufferedImage(neww, newh, BufferedImage.TYPE_BYTE_BINARY);
        Graphics2D g = result.createGraphics();
        g.translate((neww-w)/2, (newh-h)/2);
        g.rotate(angle, w/2, h/2);
        g.drawRenderedImage(image, null);
        return result;
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
        
        BufferedImage rotated1 = tilt(bi, -Math.PI/2);
        bi=rotated1;
//        try {
//            ImageIO.write(rotated1, "png", new File("/tmp/testimage2.png"));
//        } catch (IOException ex) {
//            
//        }
//        if (1==1) throw new RuntimeException();
        //transfer text onto bitmap
        byte[] byteArray = ((DataBufferByte) bi.getData().getDataBuffer()).getData();
//        for (byte b: byteArray) {
//            System.out.printf("%02x\n", b);
//        }
        int widthInBytes = bi.getWidth()/8;
        int maxColInBytes = bitmap.getCols()/8;
        int maxRow = bitmap.getRows();
        int x0InBytes = x0/8;
        for (int col=0;col<widthInBytes;++col) {
            for (int row=0;row<bi.getHeight();++row) {
                if (x0InBytes+col<maxColInBytes && y0+row<maxRow) {
                    byte textStencilByte = byteArray[col+row*widthInBytes];
                    int addressInBitmap = (x0InBytes+col)+(y0+row)*maxColInBytes;
                    byte bitmapBackgroundByte = bitmap.getData()[addressInBitmap];
                    byte result = (byte)(bitmapBackgroundByte | textStencilByte);
                    bitmap.getData()[addressInBitmap] = result;
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
