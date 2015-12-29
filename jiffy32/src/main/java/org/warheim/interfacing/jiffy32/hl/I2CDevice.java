package org.warheim.interfacing.jiffy32.hl;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.io.IOException;
import org.warheim.interfacing.jiffy32.FF32Factory;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.model.Pin;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;

/**
 *
 * @author andy
 */
public abstract class I2CDevice {
    static {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }

    final protected FF32c jiffy;
    final protected int slaveAddress;

    public I2CDevice(FF32c jiffy, Pin SCL, Pin SDA, int slaveAddress) throws IOException, JiffyException, ArgumentException {
        this.jiffy = jiffy;
        this.slaveAddress = slaveAddress;
        jiffy.setI2CPins(SCL, SDA);
    }

    public I2CDevice(Pin SCL, Pin SDA, int slaveAddress) throws IOException, JiffyException, ArgumentException {
        this(FF32Factory.getInstance(), SCL, SDA, slaveAddress);
    }
    
    //delegates to FF32c
    public void writeI2CBus(byte[] data) 
            throws IOException, JiffyException {
        jiffy.writeI2CBus(data);
    }

    public byte[] readI2CBus(int RDDataLen, byte[] WRData) 
            throws IOException, JiffyException, ArgumentException {
        return jiffy.readI2CBus(RDDataLen, WRData);
    }
    
    public void writeByteI2C(int value) 
            throws IOException, JiffyException, ArgumentException {
        jiffy.writeByteI2C(slaveAddress, value);
    }

    public void writeBlockI2C(byte[] values) 
            throws IOException, JiffyException, ArgumentException {
        jiffy.writeBlockI2C(slaveAddress, values);
    }

    public int readByteI2C() 
            throws IOException, JiffyException, ArgumentException {
        return jiffy.readByteI2C(slaveAddress);
    }

    public byte[] readBlockI2C(int readLength) 
            throws IOException, JiffyException, ArgumentException {
        return jiffy.readBlockI2C(slaveAddress, readLength);
    }
    
    public short readWordI2C() 
            throws IOException, JiffyException, ArgumentException {
        return jiffy.readWordI2C(slaveAddress);
    }
}
