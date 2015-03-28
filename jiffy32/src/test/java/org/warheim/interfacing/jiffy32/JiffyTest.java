package org.warheim.interfacing.jiffy32;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import com.codeminders.hidapi.HIDDevice;
import com.codeminders.hidapi.HIDManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author amaslowski
 */
public class JiffyTest {
    Logger logger = LoggerFactory.getLogger(JiffyTest.class);

    private HIDManager hidMgr;
    private HIDDevice dev;
    private FF32c jiffy;
    
    public JiffyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
	ClassPathLibraryLoader.loadNativeHIDLibrary();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        try {
            hidMgr = HIDManager.getInstance();
            dev = hidMgr.openById(Constants.USB_FF32_VENDOR_NUMBER, Constants.USB_FF32_PRODUCT_ID_NUMBER, null);
            jiffy = new FF32cImpl(dev);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }    
    }
    
    @After
    public void tearDown() {
        try {
            dev.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Ignore
    @org.junit.Test
    public void testGeneralUSBInfo() throws Exception {
        logger.info("Manufacturer: " + dev.getManufacturerString());
        logger.info("Product: " + dev.getProductString());
        logger.info("Serial Number: " + dev.getSerialNumberString()); 
    }

    @Ignore
    @org.junit.Test
    public void testMetadata() throws Exception {
        logger.info(jiffy.getChipInfo().toString());
        logger.info(jiffy.getAddress().toString());
        logger.info(jiffy.getProduct());
        logger.info(jiffy.getSerialNumber());
        //jiffy.setSerialNumber("serial12345");
        //System.err.println(jiffy.getSerialNumber());
        logger.info(jiffy.getVendor());
    }
    
    @Ignore
    @org.junit.Test
    public void testSetDigital() throws Exception {
        jiffy.setDigitalOutput(Pin.A5, true);
        Thread.sleep(1000);
        jiffy.setDigitalOutput(Pin.A5, false);
        jiffy.setDigitalOutput(Pin.A6, true);
        Thread.sleep(1000);
        jiffy.setDigitalOutput(Pin.A6, false);
        jiffy.setDigitalOutput(Pin.B7, true);
        Thread.sleep(1000);
        jiffy.setDigitalOutput(Pin.B7, false);
//        for (byte x=1;x<253;++x) {
//            System.out.println(x);
//            jiffy.setPWMOutput((byte)('A'), (byte)5, x);
//        }
//        for (int x=254;x>2;--x) {
//            System.out.println(x);
//            jiffy.setPWMOutput((byte)('A'), (byte)5, (byte)x);
//        }
    }
    
    @Ignore
    @org.junit.Test
    public void testPWMOutput() throws Exception {
        for (int x=1;x<253;++x) {
            logger.info("setting pwm to " + x);
            jiffy.setPWMOutput(Pin.A5, (byte)x);
        }
        for (int x=254;x>2;--x) {
            logger.info("setting pwm to " + x);
            jiffy.setPWMOutput(Pin.A5, (byte)x);
        }
    }
    
    @Ignore
    @org.junit.Test
    public void testMultipleDigitalOut() throws Exception {
        //light all in A block
        jiffy.setBlockDigitalOutputs(Constants.A, 0x003F, 0x003F);
        //dim all in A block
        Thread.sleep(1000);
        jiffy.setBlockDigitalOutputs(Constants.A, 0x003F, 0x0000);
        //light A5
        jiffy.setBlockDigitalOutputs(Constants.A, 0x003F, 0x0020);
        Thread.sleep(1000);
        //light A6
        jiffy.setBlockDigitalOutputs(Constants.A, 0x003F, 0x0040);
        Thread.sleep(1000);
        //light all in B block
        jiffy.setBlockDigitalOutputs(Constants.B, 0x0FFF, 0x0FFF);
        Thread.sleep(1000);
        //dim all in both blocks
        Thread.sleep(1000);
        jiffy.setBlockDigitalOutputs(Constants.A, 0x003F, 0x0000);
        jiffy.setBlockDigitalOutputs(Constants.B, 0x0FFF, 0x0000);
    }
    
//    @Ignore
    @org.junit.Test
    public void testI2C_PCF8591chip() throws Exception {
        logger.info("testI2C_PCF8591chip");
        jiffy.setI2CPins(Pin.B9, Pin.B10);
        byte slaveAddress = (byte)0x48;
        Map<Byte, String> ports = new HashMap<>();
        ports.put((byte)0x00, "empty");
        ports.put((byte)0x01, "pot");
        ports.put((byte)0x02, "photoresistor");
        ports.put((byte)0x03, "thermistor");
        for (int i=0;i<15;++i) {
            for (byte x: ports.keySet()) {
                jiffy.writeByteI2C(slaveAddress, x); 
                int retval = jiffy.readByteI2C(slaveAddress);
                logger.info("Port: " + x + " " + ports.get(x) + " " + retval);
            }
            Thread.sleep(200);
        }
        logger.info("~testI2C_PCF8591chip");
    }
    
}
