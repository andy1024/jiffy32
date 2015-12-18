package org.warheim.interfacing.jiffy32;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author amaslowski
 */
public class JiffyTest {
    private static final int SLAVE_ADDRESS = 0x48;

    Logger logger = LoggerFactory.getLogger(JiffyTest.class);

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
        logger.debug("setUp");
        jiffy = FF32Factory.getInstance();
    }
    
    @After
    public void tearDown() {
        logger.debug("tearDown");
        try {
            jiffy.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //@Ignore
    @org.junit.Test
    public void testGeneralUSBInfo() throws Exception {
        logger.info("Manufacturer: " + jiffy.getManufacturerString());
        logger.info("Product: " + jiffy.getProductString());
        logger.info("Serial Number: " + jiffy.getSerialNumberString()); 
        FF32Factory.showAllDevices();
    }

    //@Ignore
    @org.junit.Test
    public void testMetadata() throws Exception {
        logger.info(jiffy.getChipInfo().toString());
        logger.info(jiffy.getAddress().toString());
        logger.info(jiffy.getProduct());
        logger.info(jiffy.getSerialNumber());
        //jiffy.setSerialNumber("serial12345");
        //System.err.println(jiffy.getSerialNumber());
        //jiffy.setAddress(new Address((byte)0x01));
        logger.info(jiffy.getVendor());
    }

    
}
