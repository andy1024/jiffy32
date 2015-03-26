package org.warheim.interfacing.jiffy32.util;

/**
 *
 * @author amaslowski
 */
public class Utils {
    public static String convertPrefixedByteArrayToString(byte[] buffer) {
        byte[] another = new byte[buffer.length];
        System.arraycopy(buffer, 1, another, 0, buffer.length-1);
        return new String(another);
    }
    

}
