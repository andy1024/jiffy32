/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.warheim.interfacing.jiffy32;

import com.codeminders.hidapi.ClassPathLibraryLoader;
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
public class HighLevelTest {
    private static final int SLAVE_ADDRESS = 0x48;

    Logger logger = LoggerFactory.getLogger(HighLevelTest.class);

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
    
    @Ignore
    @org.junit.Test
    public void testI2C_PCF8591chip() throws Exception {
        logger.info("testI2C_PCF8591chip");
        jiffy.setI2CPins(Pin.B9, Pin.B10);
        Map<Integer, String> ports = new HashMap<>();
        ports.put(0x00, "empty");
        ports.put(0x01, "pot");
        ports.put(0x02, "photoresistor");
        ports.put(0x03, "thermistor");
        for (int i=0;i<150;++i) {
            for (int x: ports.keySet()) {
                jiffy.writeByteI2C(SLAVE_ADDRESS, x); 
                int retval = jiffy.readByteI2C(SLAVE_ADDRESS);
                logger.info("Port: " + x + " " + ports.get(x) + " " + retval);
            }
            Thread.sleep(200);
        }
        logger.info("~testI2C_PCF8591chip");
    }
    
}
