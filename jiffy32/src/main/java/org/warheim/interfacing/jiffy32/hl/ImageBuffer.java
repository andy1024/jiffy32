package org.warheim.interfacing.jiffy32.hl;

import java.util.BitSet;

/**
 *
 * @author andy
 */
public class ImageBuffer {
    final private int width;
    final private int height;
    private byte[] buffer;
    final private int size;
    
    public ImageBuffer(int width, int height) {
        this.width = width;
        this.height = height;
        this.size = width*height;
        this.buffer = new byte[size+1]; //1 for command
    }
    
    public void clear() {
        for (int i=1;i<buffer.length;++i) {
            buffer[i] = 0;
        }
    }

    public void invert() {
        for (int i=1;i<buffer.length;++i) {
            buffer[i] ^= 0;
        }
    }

    public void setPixel(int x, int y, boolean color) {
        if (color) {
            buffer[1+x+ (y/8)*width] |=  (1 << (y&7)); 
        } else {
            buffer[1+x+ (y/8)*height] &= ~(1 << (y&7)); 
        }
    }

    public boolean getPixel(int x, int y) {
        return false;//TODO: do something with it!
        //buffer.get(y*width+x);
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

    public byte[] getBuffer() {
        return buffer;
    }

    public int getSize() {
        return size;
    }
    
    public boolean sameSize(ImageBuffer ib) {
        return (this.width==ib.getWidth()&&this.height==ib.getHeight());
    }

}
