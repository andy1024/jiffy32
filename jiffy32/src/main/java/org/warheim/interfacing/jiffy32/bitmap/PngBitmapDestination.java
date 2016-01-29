package org.warheim.interfacing.jiffy32.bitmap;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author andy
 */
public class PngBitmapDestination {
    public void convertBitmap(Bitmap bmp, String outfile) throws IOException {
        convertBitmap(bmp, new File(outfile));
    }
    public void convertBitmap(Bitmap bmp, File outfile) throws IOException {
        BufferedImage img = new BufferedImage(bmp.getCols(), bmp.getRows(), BufferedImage.TYPE_BYTE_BINARY);
        Color color = Color.WHITE;
        for (int x=0;x<bmp.getCols();++x) {
            for (int y=0;y<bmp.getRows();++y) {
                if (bmp.getPixel(x, y)) {
                    img.setRGB(x, y, color.getRGB());
                }
            }
        }
        ImageIO.write(img, "png", outfile);
    }
}
