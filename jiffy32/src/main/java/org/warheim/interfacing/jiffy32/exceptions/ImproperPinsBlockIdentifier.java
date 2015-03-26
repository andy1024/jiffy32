package org.warheim.interfacing.jiffy32.exceptions;

/**
 * Improper pin block specified
 * thrown from these functions:
 * Set digital output (0x20)
 * Read digital input (0x21)
 * Set PWM output (0x22)
 * Get analog voltage (0x23)
 * Configure 1-Wire / MicroLAN bus (0x2A)
 * 
 * @author amaslowski
 */
public class ImproperPinsBlockIdentifier extends JiffyException {
    
}
