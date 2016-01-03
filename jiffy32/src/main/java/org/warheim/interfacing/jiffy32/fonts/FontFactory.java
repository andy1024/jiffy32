package org.warheim.interfacing.jiffy32.fonts;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andy
 */
public class FontFactory {
    public static Font getFont(FontType type, String name, int style, int size, boolean kerning, boolean ligature) {
        Font f = new Font(name, style, size);
        if (kerning||ligature) {
            Map<TextAttribute, Object> map = new HashMap<>();
            if (kerning) {
                map.put(TextAttribute.KERNING,
                    TextAttribute.KERNING_ON);
            }
            if (ligature) {
                map.put(TextAttribute.LIGATURES,
                    TextAttribute.LIGATURES_ON);
            }
            f = f.deriveFont(map);
        }
        return f;
    }
}
