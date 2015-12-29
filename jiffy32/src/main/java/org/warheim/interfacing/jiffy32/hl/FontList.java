package org.warheim.interfacing.jiffy32.hl;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author andy
 */
public class FontList {

    public static void main(String... args) throws Exception {
       List<Font> fonts = new ArrayList<>();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String testValue = "17:12:59";
        for (String s: ge.getAvailableFontFamilyNames()) {
            Font f = new Font(s, Font.PLAIN, 20);
            System.out.println(f.getName());
            for (TextAttribute ta: f.getAttributes().keySet()) {
                Object o = f.getAttributes().get(ta);
                System.out.println("----" + ta.toString() + "=" + o);
            }
            Map<TextAttribute, Object> map =
                new Hashtable<TextAttribute, Object>();
            map.put(TextAttribute.KERNING,
                TextAttribute.KERNING_ON);
            map.put(TextAttribute.LIGATURES,
                TextAttribute.LIGATURES_ON);
            f = f.deriveFont(map);
            Integer ke = (Integer)f.getAttributes().get(TextAttribute.KERNING);
            Integer li = (Integer)f.getAttributes().get(TextAttribute.LIGATURES);
            System.out.println("----KERNING=" + ke);
            System.out.println("----LIGATURES=" + li);
        }
    }
}
