package org.warheim.interfacing.jiffy32.hl;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.FF32Factory;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.Pin;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;

/**
 *
 * @author andy
 */
public class I2C_PCF8591 {
    Logger logger = LoggerFactory.getLogger(I2C_PCF8591.class);
    private static final int SLAVE_ADDRESS = 0x48;
    
    static {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }
    
    final private FF32c jiffy;
    private Map<String, Integer> ports;
    
    public I2C_PCF8591(FF32c jiffy, Pin SCL, Pin SDA, Map<String, Integer> ports) throws IOException, JiffyException, ArgumentException {
        this.jiffy = jiffy;
        this.ports = ports;
        jiffy.setI2CPins(SCL, SDA);
    }
    
    public I2C_PCF8591(Pin SCL, Pin SDA) throws IOException, JiffyException, ArgumentException {
        this(FF32Factory.getInstance(), SCL, SDA, null);
    }

    public int readPort(String portName) throws IOException, JiffyException, ArgumentException {
        Integer portNumber = (ports!=null?ports.get(portName):null);
        if (portNumber==null) {
            throw new ArgumentException("No such port: " + portName);
        }
        return readPort(portNumber);
    }

    public int readPort(int portNumber) throws IOException, JiffyException, ArgumentException {
        jiffy.writeByteI2C(SLAVE_ADDRESS, portNumber);
        int retval = jiffy.readByteI2C(SLAVE_ADDRESS);
        return retval;
    }
}
