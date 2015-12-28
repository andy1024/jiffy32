package org.warheim.interfacing.jiffy32.bitmap;

/**
 *
 * @author andy
 */
public abstract class SimpleFont {
    private String name;
    private int rows;
    private int cols;

    public SimpleFont(String name, int rows, int cols) {
        this.name = name;
        this.rows = rows;
        this.cols = cols;
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
    
    
    

    
}
