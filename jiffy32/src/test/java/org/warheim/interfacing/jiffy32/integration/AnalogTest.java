package org.warheim.interfacing.jiffy32.integration;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.core.Constants;
import org.warheim.interfacing.jiffy32.core.FF32Factory;
import org.warheim.interfacing.jiffy32.core.FF32c;
import org.warheim.interfacing.jiffy32.model.Pin;

/**
 *
 * @author andy
 */
public class AnalogTest {
    Logger logger = LoggerFactory.getLogger(AnalogTest.class);

    private FF32c jiffy;
    
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

    @org.junit.Test
    public void testPWMOutput() throws Exception {
        for (int x=0;x<255;x=x+5) {
            logger.info("setting pwm to " + x);
            jiffy.setPWMOutput(Pin.A5, x);
        }
        for (int x=255;x>=0;x=x-5) {
            logger.info("setting pwm to " + x);
            jiffy.setPWMOutput(Pin.A5, x);
        }
    }
    
    @org.junit.Test
    public void testAllAnalogInputs() throws Exception {
        for (int i=1;i<=12;++i) {
            int[] result = jiffy.readAnalogInput(0x0B, i);
            logger.info("Analog voltage read from B" + i + ": voltage=" + result[0] + ", value=" + result[1]);
        }
    }

    @org.junit.Test
    public void testSingleAnalogInput() throws Exception {
        Pin pin = Pin.B12;
        for (int i=0;i<5000;++i) {
            int[] result = jiffy.readAnalogInput(pin);
            logger.info("Analog voltage read from " + pin + ": voltage=" + result[0] + ", value=" + result[1]);
        }
    }

    @org.junit.Test
    public void testMultipleAnalogInput() throws Exception {
        int[] result = jiffy.readBlockAnalogInputs(Constants.B, 0x0FFF);
        logger.info("Reference voltage is " + result[0]);
        for (int i=1;i<=12;++i) {
            logger.info("Analog voltage read from B" + i + " = " + result[i]);
        }
    }
}
