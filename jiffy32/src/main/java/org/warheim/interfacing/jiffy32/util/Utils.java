package org.warheim.interfacing.jiffy32.util;

import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;

/**
 *
 * @author amaslowski
 */
public class Utils {
    public static final String CONVERTER_SUBSTRING_OUTSIDE_OF_BUFFER_SIZE = "Substring outside of buffer size";
    public static final String CONVERTER_BUFFER_ZEROSIZED = "Buffer zero-sized";
    public static final String CONVERTER_BUFFER_TOO_BIG_FOR_INT = "Buffer too big for int";

    public static String convertPrefixedByteArrayToString(byte[] buffer) {
        byte[] another = new byte[buffer.length];
        System.arraycopy(buffer, 1, another, 0, buffer.length-1);
        return new String(another);
    }
    
    public static int byteToInt(byte[] buffer) throws ArgumentException {
        return byteToInt(buffer, 0);
    }
    
    public static int byteToInt(byte[] buffer, int startingIndex) throws ArgumentException {
        int size = buffer.length-startingIndex;
        return byteToInt(buffer, startingIndex, size);
    }
    
    public static int byteToInt(byte[] buffer, int startingIndex, int length) throws ArgumentException {
        int retval=0;
        int size = length-1;
        if (length>4) {
            throw new ArgumentException(CONVERTER_BUFFER_TOO_BIG_FOR_INT);
        }
        if (length<1) {
            throw new ArgumentException(CONVERTER_BUFFER_ZEROSIZED);
        }
        if (length+startingIndex>buffer.length) {
            throw new ArgumentException(CONVERTER_SUBSTRING_OUTSIDE_OF_BUFFER_SIZE);
        }
        for (int i=size;i>=0;--i) {
            retval |= ((buffer[startingIndex+i] & 0xFF) << 8*(size-i));
        }
        return retval;
    }
}
