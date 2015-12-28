package org.warheim.interfacing.jiffy32.hl;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.Pin;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;

/**
 * 8-bit A/D & D/A converter
 * http://botland.com.pl/rozszerzenia-gpio-nakladki-hat-do-raspberry-pi-2/2632-pcf8591-przetwornik-ac-i-ca-8-bitowy-i2c.html
 *
 * @author andy
 */
public class I2C_PCF8591 extends I2CDevice {
    private static final Logger logger = LoggerFactory.getLogger(I2C_PCF8591.class);
    private static final int SLAVE_ADDRESS = 0x48;
    
    static {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }
    
    final private Map<String, Integer> ports;
    
    public I2C_PCF8591(FF32c jiffy, Pin SCL, Pin SDA, Map<String, Integer> ports) throws IOException, JiffyException, ArgumentException {
        super(jiffy, SCL, SDA, SLAVE_ADDRESS);
        this.ports = ports;
    }
    
    public I2C_PCF8591(Pin SCL, Pin SDA) throws IOException, JiffyException, ArgumentException {
        super(SCL, SDA, SLAVE_ADDRESS);
        this.ports = new HashMap<>();
    }

    public int readPort(String portName) throws IOException, JiffyException, ArgumentException {
        Integer portNumber = (ports!=null?ports.get(portName):null);
        if (portNumber==null) {
            throw new ArgumentException("No such port: " + portName);
        }
        return readPort(portNumber);
    }

    public int readPort(int portNumber) throws IOException, JiffyException, ArgumentException {
        writeByteI2C(portNumber);
        int retval = readByteI2C();
        return retval;
    }
    
    public static void main(String... args) throws Exception {
        I2C_PCF8591 chip = new I2C_PCF8591(Pin.B9, Pin.B10);
        System.out.println(chip.readPort(0x03));
    }
}
