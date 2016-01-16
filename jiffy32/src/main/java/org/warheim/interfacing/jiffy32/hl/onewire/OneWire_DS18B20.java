package org.warheim.interfacing.jiffy32.hl.onewire;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.core.FF32c;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;
import org.warheim.interfacing.jiffy32.hl.CRC8;
import org.warheim.interfacing.jiffy32.model.Pin;

/**
 *
 * @author andy
 */
public class OneWire_DS18B20 extends OneWireDevice {
    private static final Logger logger = LoggerFactory.getLogger(OneWire_DS18B20.class);
    
    public static final byte CMD_CONVERT_T = 0x44;
    public static final byte CMD_READ_SCRATCHPAD = (byte)0xBE;
    public static final byte CMD_READ_POWER_SUPPLY = (byte)0xB4;
    public static final byte CMD_SKIP_ROM = (byte)0xCC;
    
    public static final byte RESPONSE_LEN = 0x09;


    public OneWire_DS18B20(FF32c jiffy, Pin devicePin) throws IOException, JiffyException, ArgumentException {
        super(jiffy, devicePin);
    }

    public OneWire_DS18B20(Pin devicePin) throws IOException, JiffyException, ArgumentException {
        super(devicePin);
    }

    public void setup() throws IOException, JiffyException {
        reset1WireBus();
    }
    
    public double readTemp() throws IOException, JiffyException, ArgumentException {
        write1WireBus(new byte[]{CMD_SKIP_ROM, CMD_CONVERT_T});
        byte[] response = read1WireBus(RESPONSE_LEN, 
                new byte[]{CMD_SKIP_ROM, CMD_READ_SCRATCHPAD});
        for (int i=0;i<response.length;++i) {
            String s = String.format("%2x ", response[i]);
            logger.debug(s);
        }
        
        boolean crcOk = CRC8.checkCRC(response, RESPONSE_LEN);
        if (crcOk) {
            return (response[1] * 256 + response[0]) * 0.0625;
            // just return nonsense result to report invalid data
        } else {
            return 2000.0;
        }
    }
}
