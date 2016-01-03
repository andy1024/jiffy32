package org.warheim.interfacing.jiffy32.fonts;

import org.warheim.interfacing.jiffy32.fonts.bitmap.BitmapFont;


public class FontBuilder {
    private FontType type;
    private String name;
    private Class fontClass;
    private int style;
    private int size;
    private boolean kerning;
    private boolean ligature;

    public FontBuilder() {
    }

    public FontBuilder setType(FontType type) {
        this.type = type;
        return this;
    }

    public FontBuilder setFontClass(Class fontClass) {
        this.fontClass = fontClass;
        return this;
    }

    public FontBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FontBuilder setStyle(int style) {
        this.style = style;
        return this;
    }

    public FontBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public FontBuilder setKerning(boolean kerning) {
        this.kerning = kerning;
        return this;
    }

    public FontBuilder setLigature(boolean ligature) {
        this.ligature = ligature;
        return this;
    }

    public AbstractFont createFont() throws InstantiationException, IllegalAccessException {
        AbstractFont af=null;
        switch (type) {
            case SIMPLE:
                return (SimpleFont)fontClass.newInstance();
            case BITMAP:
                //return (BitmapFont)fontClass.newInstance();
            case VECTOR:
                break;
            default:
                //error
                break;
        }
        return af;
    }

}
