package org.warheim.interfacing.jiffy32.demo;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import org.warheim.interfacing.jiffy32.FF32Factory;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.hl.onewire.OneWire_DS18B20;
import org.warheim.interfacing.jiffy32.model.Pin;

/**
 *
 * @author andy
 */
public class OneWire_DS18B20Demo {
    static {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }

    public static void main(String... args) throws Exception {
        FF32c jiffy = FF32Factory.getInstance();
        OneWire_DS18B20 probe = new OneWire_DS18B20(jiffy, Pin.B2);
        while (true) {
            double temp = probe.readTemp();
            System.out.println(String.format("Temperature %f", temp));
            Thread.sleep(500);
        }
    }
}
