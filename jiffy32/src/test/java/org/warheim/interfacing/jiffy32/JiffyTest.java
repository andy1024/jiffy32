/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.warheim.interfacing.jiffy32;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import com.codeminders.hidapi.HIDDevice;
import com.codeminders.hidapi.HIDManager;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author amaslowski
 */
public class JiffyTest {
    
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
            dev = hidMgr.openById(1240, 63673, null);
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
        System.err.print("Manufacturer: " + dev.getManufacturerString() + "\n");
        System.err.print("Product: " + dev.getProductString() + "\n");
        System.err.print("Serial Number: " + dev.getSerialNumberString() + "\n"); 
    }

    @Ignore
    @org.junit.Test
    public void testMetadata() throws Exception {
        System.err.println(jiffy.getChipInfo().toString());
        System.err.println(jiffy.getAddress().toString());
        System.err.println(jiffy.getProduct());
        System.err.println(jiffy.getSerialNumber());
        //jiffy.setSerialNumber("serial12345");
        //System.err.println(jiffy.getSerialNumber());
        System.err.println(jiffy.getVendor());
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
            System.out.println(x);
            jiffy.setPWMOutput(Pin.A5, (byte)x);
        }
        for (int x=254;x>2;--x) {
            System.out.println(x);
            jiffy.setPWMOutput(Pin.A5, (byte)x);
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
        //dim all in A block
        Thread.sleep(1000);
        jiffy.setBlockDigitalOutputs(Constants.A, 0x003F, 0x0000);
    }
    
}
