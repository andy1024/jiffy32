/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.warheim.interfacing.jiffy32;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import com.codeminders.hidapi.HIDDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author amaslowski
 */
public class MultipleDevicesTest {
    Logger logger = LoggerFactory.getLogger(MultipleDevicesTest.class);

    @BeforeClass
    public static void setUpClass() {
	ClassPathLibraryLoader.loadNativeHIDLibrary();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @org.junit.Test
    public void testMultipleDevices() throws Exception {
        List<FF32c> jiffies = new ArrayList<>();
        for (HIDDeviceInfo devInfo: FF32Factory.listFFDevices()) {
            logger.info("Discovered FF32 at: " + devInfo.getPath());
            jiffies.add(FF32Factory.getInstance(devInfo.getPath()));
        }
        for (int i=0;i<3;++i) {
            //light all in both blocks in all devices
            for (FF32c jiffy: jiffies) {
                jiffy.setBlockDigitalOutputs(Constants.A, 0x003F, 0x003F);
                jiffy.setBlockDigitalOutputs(Constants.B, 0x0FFF, 0x0FFF);
            }
            Thread.sleep(1000);
            //dim all in both blocks in all devices
            for (FF32c jiffy: jiffies) {
                jiffy.setBlockDigitalOutputs(Constants.A, 0x003F, 0x0000);
                jiffy.setBlockDigitalOutputs(Constants.B, 0x0FFF, 0x0000);
            }
            Thread.sleep(1000);
        }
        //close all devices
        for (FF32c jiffy: jiffies) {
            jiffy.close();
        }
    }
    

}
