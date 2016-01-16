package org.warheim.interfacing.jiffy32.demo;

import org.warheim.interfacing.jiffy32.hl.i2c.I2C_PCF8591;
import org.warheim.interfacing.jiffy32.hl.*;
import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.core.FF32c;
import org.warheim.interfacing.jiffy32.model.Pin;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;

/**
 * 8-bit A/D & D/A converter
 * http://botland.com.pl/rozszerzenia-gpio-nakladki-hat-do-raspberry-pi-2/2632-pcf8591-przetwornik-ac-i-ca-8-bitowy-i2c.html
 *
 * @author andy
 */
public class I2C_PCF8591Demo {
    private static final Logger logger = LoggerFactory.getLogger(I2C_PCF8591Demo.class);
    
    static {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }
    
    
    public static void main(String... args) throws Exception {
        Map<String, Integer> ports = new HashMap<>();
        ports.put("empty", 0x00);
        ports.put("pot", 0x01);
        ports.put("photoresistor", 0x02);
        ports.put("thermistor", 0x03);

        I2C_PCF8591 chip = new I2C_PCF8591(Pin.B9, Pin.B10, ports);
        for (int i=0;i<50;++i) {
            for (String x: ports.keySet()) {
                int retval = chip.readPort(x);
                logger.info("Port: " + x + " " + ports.get(x) + " " + retval);
            }
            Thread.sleep(200);
        }
    }
}
