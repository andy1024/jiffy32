package org.warheim.interfacing.jiffy32.exceptions;

/**
 * Acknowledgement absent from the device
 * thrown in case of error from functions:
 * Write to I2C / TWI device (0x28)
 * Read from I2C / TWI device (0x29)
 * Write to 1-Wire / MicroLAN device (0x2B)
 * Read from 1-Wire / MicroLAN device (0x2C)
 * 
 * @author amaslowski
 */
public class DeviceAcknowlegdementAbsent extends JiffyException {
    
}
