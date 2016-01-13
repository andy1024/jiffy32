package org.warheim.interfacing.jiffy32.unit;

import junit.framework.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.hl.CRC8;

/**
 *
 * @author andy
 */
public class CRC8Test {
    Logger logger = LoggerFactory.getLogger(CRC8Test.class);

    @org.junit.Test
    public void testCRCOK() throws Exception {
        byte[] input = new byte[]{0x37, 0x01, 0x4b, 0x01, 0x7f, (byte)0xff, 0x0c, 0x10, 0x61};
        boolean result = CRC8.checkCRC(input, input.length);
        Assert.assertTrue(result);
    }
    
    @org.junit.Test
    public void testCRCFailure() throws Exception {
        byte[] input = new byte[]{0x37, 0x01, 0x4b, 0x01, 0x7f, 0x3f, 0x0c, 0x10, 0x61};
        boolean result = CRC8.checkCRC(input, input.length);
        Assert.assertFalse(result);
    }

}
