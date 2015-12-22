package org.warheim.interfacing.jiffy32.hl;

import java.io.IOException;
import org.warheim.interfacing.jiffy32.FF32Factory;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.Pin;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;

/**
 *
 * @author andy
 */
public abstract class I2CDevice {
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


}
