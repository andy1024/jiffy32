package org.warheim.interfacing.jiffy32.hl;

import java.util.BitSet;

/**
 *
 * @author andy
 */
public class ImageBuffer {
    final private int width;
    final private int height;
    private BitSet buffer;
    final private int size;
    
    public ImageBuffer(int width, int height) {
        this.width = width;
        this.height = height;
        this.size = width*height;
        this.buffer = new BitSet(size);
    }
    
    public void clear() {
        buffer.clear();
    }

    public void invert() {
        buffer.flip(0, size-1);
    }

    public void setPixel(int x, int y, boolean color) {
        buffer.set(y*width+x, color);
    }

    public boolean getPixel(int x, int y) {
        return buffer.get(y*width+x);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public void replace(ImageBuffer ib) {
        buffer = ib.getBuffer();
    }

    public BitSet getBuffer() {
        return buffer;
    }

    public int getSize() {
        return size;
    }
    
    public boolean sameSize(ImageBuffer ib) {
        return (this.width==ib.getWidth()&&this.height==ib.getHeight());
    }

}
