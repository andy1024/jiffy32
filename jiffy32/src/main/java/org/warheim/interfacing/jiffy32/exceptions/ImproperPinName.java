package org.warheim.interfacing.jiffy32.exceptions;

/**
 * Improper pin number specified
 * thrown from these functions:
 * Set digital output (0x20)
 * Read digital input (0x21)
 * Set PWM output (0x22)
 * Get analog voltage (0x23)
 * Configure 1-Wire / MicroLAN bus (0x2A)
 * Configure SPI bus (0x24)
 * Configure I2C / TWI bus (0x27)
 * Configure 1-Wire / MicroLAN bus (0x2A)
 * 
 * @author amaslowski
 */
public class ImproperPinName extends JiffyException {
    
}
