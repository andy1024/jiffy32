package org.warheim.interfacing.jiffy32.fonts;

import org.warheim.interfacing.jiffy32.bitmap.Bitmap;
import org.warheim.interfacing.jiffy32.bitmap.FontDrawer;

/**
 *
 * @author andy
 */
public class VectorFont extends java.awt.Font implements AbstractFont {

    public VectorFont(String name, int style, int size) {
        super(name, style, size);
    }

    public VectorFont(java.awt.Font baseFont) {
        super(baseFont);
    }

    @Override
    public int draw(int x, int y, String str, boolean on, Bitmap bitmap, FontDrawer fontDrawerVisitor) {
        return fontDrawerVisitor.visit(this, x, y, str, on, bitmap);
    }
}
