package org.warheim.interfacing.jiffy32.bitmap.fonts;

/**
 *
 * @author andy
 */
public abstract class Font {
    private final String name;
    private final char start_char;
    private final char end_char;
    private final int char_height;
    private final int space_width;
    private final int gap_width;

    public Font(String name, char start_char, char end_char, int char_height, int space_width, int gap_width) {
        this.name = name;
        this.start_char = start_char;
        this.end_char = end_char;
        this.char_height = char_height;
        this.space_width = space_width;
        this.gap_width = gap_width;
    }
    
    public abstract byte[] getBitmaps();
    
    public abstract int[][] getDescriptors();
    
    public abstract byte[][] getKerning();

    public String getName() {
        return name;
    }

    public char getStart_char() {
        return start_char;
    }

    public char getEnd_char() {
        return end_char;
    }

    public int getChar_height() {
        return char_height;
    }

    public int getSpace_width() {
        return space_width;
    }

    public int getGap_width() {
        return gap_width;
    }
  
}
