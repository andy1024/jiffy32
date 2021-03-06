package org.warheim.interfacing.jiffy32.hl.onewire;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.io.IOException;
import org.warheim.interfacing.jiffy32.core.FF32Factory;
import org.warheim.interfacing.jiffy32.core.FF32c;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;
import org.warheim.interfacing.jiffy32.hl.CRC8;
import org.warheim.interfacing.jiffy32.model.Pin;

/**
 *
 * @author andy
 * 
 */
public class OneWireDevice {
    static {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }
    
    final protected FF32c jiffy;
    final protected Pin devicePin;
    

    public OneWireDevice(FF32c jiffy, Pin devicePin) throws IOException, JiffyException, ArgumentException {
        this.jiffy = jiffy;
        this.devicePin = devicePin;
        jiffy.set1WirePin(devicePin);
    }

    public OneWireDevice(Pin devicePin) throws IOException, JiffyException, ArgumentException {
        this(FF32Factory.getInstance(), devicePin);
    }
    
    //delegates to FF32c
    public void set1WirePin(int DQPinBlock, int DQPinNumber) 
            throws IOException, JiffyException, ArgumentException {
        jiffy.set1WirePin(DQPinBlock, DQPinNumber);
    }
    public void set1WirePin(Pin DQ) 
            throws IOException, JiffyException, ArgumentException {
        jiffy.set1WirePin(DQ);
    }
    public boolean reset1WireBus() 
            throws IOException, JiffyException {
        return jiffy.reset1WireBus();
    }
    public void write1WireBus(byte[] data) 
            throws IOException, JiffyException {
        jiffy.write1WireBus(data);
    }
    public void writeBit1WireBus(boolean dataBit) 
            throws IOException, JiffyException {
        jiffy.writeBit1WireBus(dataBit);
    }
    public byte[] read1WireBus(int RDDataLen, byte[] WRData) 
            throws IOException, JiffyException, ArgumentException {
        return jiffy.read1WireBus(RDDataLen, WRData);
    }
    public boolean readBit1WireBus() 
            throws IOException, JiffyException {
        return jiffy.readBit1WireBus();
    }
    
}
