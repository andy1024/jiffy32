package org.warheim.interfacing.jiffy32.exceptions;

/**
 * Improper data length parameter value
 * thrown from these functions:
 * Write to SPI device (0x25)
 * Read from SPI device (0x26)
 * Write to I2C / TWI device (0x28)
 * Read from I2C / TWI device (0x29)
 * Write to 1-Wire / MicroLAN device (0x2B)
 * Read from 1-Wire / MicroLAN device (0x2C)
 * 
 * @author amaslowski
 */
public class ImproperDataLengthParameterValue extends JiffyException {
    
}
