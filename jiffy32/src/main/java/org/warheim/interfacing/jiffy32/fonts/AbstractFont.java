package org.warheim.interfacing.jiffy32.fonts;

import org.warheim.interfacing.jiffy32.bitmap.Bitmap;
import org.warheim.interfacing.jiffy32.bitmap.FontDrawer;

/**
 *
 * @author andy
 */
public interface AbstractFont {
    public int draw(int x, int y, String str, boolean on, Bitmap bitmap, FontDrawer fontDrawerVisitor);
}
