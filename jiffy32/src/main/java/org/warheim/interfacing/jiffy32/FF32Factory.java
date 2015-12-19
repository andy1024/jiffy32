package org.warheim.interfacing.jiffy32;

import com.codeminders.hidapi.HIDDevice;
import com.codeminders.hidapi.HIDDeviceInfo;
import com.codeminders.hidapi.HIDManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.exceptions.InitalizationException;

/**
 *
 * @author amaslowski
 */
public class FF32Factory {
    private static final Logger logger = LoggerFactory.getLogger(FF32Factory.class);
    
    public static void showAllDevices() throws IOException {
        HIDDeviceInfo[] devices = HIDManager.getInstance().listDevices();
        for (HIDDeviceInfo di: devices) {
            logger.info(di.toString());
        }
    }
    
    public static List<HIDDeviceInfo> listFFDevices() throws IOException {
        HIDDeviceInfo[] devices = HIDManager.getInstance().listDevices();
        List<HIDDeviceInfo> result = new ArrayList<>();
        for (HIDDeviceInfo di: devices) {
            if (Constants.USB_FF32_VENDOR_NUMBER == di.getVendor_id()
                    &&
                Constants.USB_FF32_PRODUCT_ID_NUMBER == di.getProduct_id()) {
            result.add(di);
            }
        }
        return result;
    }

    public static FF32c getInstance(int vendorId, int productId, String serialNumber) {
        FF32c jiffy=null;
        try {
            HIDDevice dev = HIDManager.getInstance().openById(vendorId, productId, serialNumber);
            if (dev==null) {
                throw new InitalizationException();
            }
            jiffy = new FF32cImpl(dev);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }    
        return jiffy;
    }

    public static FF32c getInstance(String path) {
        FF32c jiffy=null;
        try {
            HIDDevice dev = HIDManager.getInstance().openByPath(path);
            if (dev==null) {
                throw new InitalizationException();
            }
            jiffy = new FF32cImpl(dev);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }    
        return jiffy;
    }

    public static FF32c getInstance() {
        return getInstance(Constants.USB_FF32_VENDOR_NUMBER, Constants.USB_FF32_PRODUCT_ID_NUMBER, null);
    }

}
