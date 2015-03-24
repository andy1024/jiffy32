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

    @org.junit.Test
    public void testGeneralUSBInfo() throws Exception {
        System.err.print("Manufacturer: " + dev.getManufacturerString() + "\n");
        System.err.print("Product: " + dev.getProductString() + "\n");
        System.err.print("Serial Number: " + dev.getSerialNumberString() + "\n"); 
    }

    @org.junit.Test
    public void testMetadata() throws Exception {
        System.err.println(jiffy.getChipInfo().toString());
        System.err.println(jiffy.getAddress().toString());
        System.err.println(jiffy.getProduct());
        System.err.println(jiffy.getSerialNumber());
        jiffy.setSerialNumber("serial12345");
        System.err.println(jiffy.getSerialNumber());
        System.err.println(jiffy.getVendor());
    }
    
    @org.junit.Test
    public void testSetDigital() throws Exception {
        jiffy.setDigitalOutput((byte)('A'), (byte)5, (byte)1);
//        for (byte x=1;x<253;++x) {
//            System.out.println(x);
//            jiffy.setPWMOutput((byte)('A'), (byte)5, x);
//        }
//        for (int x=254;x>2;--x) {
//            System.out.println(x);
//            jiffy.setPWMOutput((byte)('A'), (byte)5, (byte)x);
//        }
    }
    
}
