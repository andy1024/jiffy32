package org.warheim.interfacing.jiffy32.unit;

import junit.framework.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.util.Utils;

/**
 *
 * @author andy
 */
public class ByteConversionTest {
    Logger logger = LoggerFactory.getLogger(ByteConversionTest.class);

    @org.junit.Test
    public void testSingleByteToIntOK() throws Exception {
        byte[] input = new byte[]{(byte)0xFF};
        int result = Utils.byteToInt(input);
        Assert.assertEquals(255, result);
    }
    
    @org.junit.Test
    public void testTwoByteToIntOK() throws Exception {
        byte[] input = new byte[]{(byte)0x03,(byte)0xFF};
        int result = Utils.byteToInt(input);
        Assert.assertEquals(1023, result);
    }
    
    @org.junit.Test
    public void testMultipleByteToIntOK() throws Exception {
        byte[] input = new byte[]{(byte)0xFF,(byte)0xFF,(byte)0xFF};
        int result = Utils.byteToInt(input);
        Assert.assertEquals(16777215, result);
    }

    @org.junit.Test
    public void testSingleBytePrefixedToIntOK() throws Exception {
        byte[] input = new byte[]{(byte)0x2C,(byte)0xFF};
        int result = Utils.byteToInt(input, 1);
        Assert.assertEquals(255, result);
    }
    
    @org.junit.Test
    public void testTwoBytePrefixedToIntOK() throws Exception {
        byte[] input = new byte[]{(byte)0xFF,(byte)0xC9,(byte)0x03,(byte)0xFF};
        int result = Utils.byteToInt(input, 2);
        Assert.assertEquals(1023, result);
    }
    
    @org.junit.Test
    public void testSingleByteSubstringToIntOK() throws Exception {
        byte[] input = new byte[]{(byte)0x2C,(byte)0xFF,(byte)0x33,(byte)0x40,(byte)0xFF};
        int result = Utils.byteToInt(input, 1, 1);
        Assert.assertEquals(255, result);
    }
    
    @org.junit.Test
    public void testTwoByteSubstringToIntOK() throws Exception {
        byte[] input = new byte[]{(byte)0x2C,(byte)0xFF,(byte)0x33,(byte)0x40,(byte)0xFF};
        int result = Utils.byteToInt(input, 1, 2);
        Assert.assertEquals(65331, result);
    }

    @org.junit.Test(expected = ArgumentException.class)  
    public void testEmptyBufferFailure() throws Exception {
        byte[] input = new byte[0];
        int result = Utils.byteToInt(input);
    }

    @org.junit.Test(expected = ArgumentException.class)  
    public void testBufferTooBigFailure() throws Exception {
        byte[] input = new byte[]{(byte)0x2C,(byte)0xFF,(byte)0x33,(byte)0x40,(byte)0xFF};
        int result = Utils.byteToInt(input);
    }

    @org.junit.Test(expected = ArgumentException.class)  
    public void testBufferAccessFailure() throws Exception {
        byte[] input = new byte[]{(byte)0x2C,(byte)0xFF,(byte)0x33,(byte)0x40,(byte)0xFF};
        int result = Utils.byteToInt(input, 7, 3);
    }
}
