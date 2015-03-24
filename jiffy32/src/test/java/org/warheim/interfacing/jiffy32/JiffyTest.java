/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.warheim.interfacing.jiffy32;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import com.codeminders.hidapi.HIDDevice;
import com.codeminders.hidapi.HIDManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author amaslowski
 */
public class JiffyTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    @org.junit.Test
    public void testSomeMethod() throws Exception {
//        HIDManager hidMgr = HIDManager.getInstance();
//        HIDDevice dev = hidMgr.openById(1240, 63673, null);
//        System.err.print("Manufacturer: " + dev.getManufacturerString() + "\n");
//        System.err.print("Product: " + dev.getProductString() + "\n");
//        System.err.print("Serial Number: " + dev.getSerialNumberString() + "\n"); 
        
    }
    
    @org.junit.Test
    public void testSetDigital() throws Exception {
        HIDManager hidMgr = HIDManager.getInstance();
        HIDDevice dev = hidMgr.openById(1240, 63673, null);
        System.err.print("Manufacturer: " + dev.getManufacturerString() + "\n");
        System.err.print("Product: " + dev.getProductString() + "\n");
        System.err.print("Serial Number: " + dev.getSerialNumberString() + "\n"); 
        FF32c jiffy = new FF32cImpl(dev);
        jiffy.setDigitalOutput((byte)('A'), (byte)5, (byte)1);
        System.err.println(jiffy.getChipInfo().toString());
        System.err.println(jiffy.getAddress().toString());
        System.err.println(jiffy.getProduct());
        System.err.println(jiffy.getSerialNumber());
        System.err.println(jiffy.getVendor());
        for (byte x=1;x<253;++x) {
            jiffy.setPWMOutput((byte)('A'), (byte)5, x);
        }
        for (int x=254;x>2;--x) {
            jiffy.setPWMOutput((byte)('A'), (byte)5, (byte)x);
        }
    }
    
}
