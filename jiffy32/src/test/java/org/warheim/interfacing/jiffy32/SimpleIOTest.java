/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class SimpleIOTest {
    Logger logger = LoggerFactory.getLogger(SimpleIOTest.class);

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
    public void testSetDigital() throws Exception {
        jiffy.setDigitalOutput(Pin.A5, true);
        Thread.sleep(1000);
        jiffy.setDigitalOutput(Pin.A5, false);
        jiffy.setDigitalOutput(Pin.A6, true);
        Thread.sleep(1000);
        jiffy.setDigitalOutput(Pin.A6, false);
        jiffy.setDigitalOutput(Pin.B5, true);
        Thread.sleep(1000);
        jiffy.setDigitalOutput(Pin.B5, false);
//        for (byte x=1;x<253;++x) {
//            System.out.println(x);
//            jiffy.setPWMOutput((byte)('A'), (byte)5, x);
//        }
//        for (int x=254;x>2;--x) {
//            System.out.println(x);
//            jiffy.setPWMOutput((byte)('A'), (byte)5, (byte)x);
//        }
    }
    
    @org.junit.Test
    public void testSetDigital2() throws Exception {
        for (int i=0;i<5;++i) {
            jiffy.setDigitalOutput(Pin.B1, true);
            Thread.sleep(1000);
            jiffy.setDigitalOutput(Pin.B1, false);
            Thread.sleep(1000);
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
    

}
