package org.warheim.interfacing.jiffy32.fonts;

import org.warheim.interfacing.jiffy32.bitmap.Bitmap;
import org.warheim.interfacing.jiffy32.bitmap.FontDrawer;

/**
 *
 * @author andy
 */
public abstract class SimpleFont implements AbstractFont {
    private String name;
    private int rows;
    private int cols;
    private int size;
    private int space;

    public SimpleFont(String name, int rows, int cols, int size, int space) {
        this.name = name;
        this.rows = rows;
        this.cols = cols;
        this.size = size;
        this.space = space;
    }
    
    public abstract byte[] getBytes();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    @Override
    public int draw(int x, int y, String str, boolean on, Bitmap bitmap, FontDrawer fontDrawerVisitor) {
        return fontDrawerVisitor.visit(this, x, y, str, on, bitmap);
    }

}
