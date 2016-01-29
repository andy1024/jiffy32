package org.warheim.interfacing.jiffy32.unit;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.bitmap.Bitmap;
import org.warheim.interfacing.jiffy32.bitmap.PngBitmapDestination;

/**
 *
 * @author andy
 */
public class PngBitmapDestinationTest {
    Logger logger = LoggerFactory.getLogger(PngBitmapDestinationTest.class);

    @org.junit.Test
    public void testOutput() throws Exception {
        Bitmap bmp = new Bitmap(320, 200);
        bmp.drawLine(10, 10, 310, 190, 1, true);
        bmp.drawCircle(160, 100, 50, 1, true);
        bmp.drawRect(20, 40, 60, 80, 1, true);
        bmp.drawFilledRect(20, 120, 60, 160, 1, true);
        bmp.drawRect(260, 120, 300, 160, 1, true);
        bmp.drawFilledRect(260, 40, 300, 80, 1, true);
        PngBitmapDestination pbd = new PngBitmapDestination();
        File tempFile = File.createTempFile(this.getClass().getName(), ".png"); 
        pbd.convertBitmap(bmp, tempFile);
    }

}
