package org.warheim.interfacing.jiffy32.exceptions;

import org.warheim.interfacing.jiffy32.Constants;

/**
 * Baseclass for all the Jiffy exceptions
 * 
 * @author amaslowski
 */
public abstract class JiffyException extends Exception {

    public static JiffyException decodeException(byte[] buffer) {
        if (buffer != null && buffer.length > 0) {
            switch (buffer[0]) {
                case Constants.RESULT_ACK_ABSENT:
                    return new DeviceAcknowlegdementAbsent();
                case Constants.RESULT_ADDRESS_OUT_OF_RANGE:
                    return new AddressOutOfRange();
                case Constants.RESULT_IMPROPER_DATA_LEN:
                    return new ImproperDataLengthParameterValue();
                case Constants.RESULT_IMPROPER_PINS_BLOCK_ID:
                    return new ImproperPinsBlockIdentifier();
                case Constants.RESULT_IMPROPER_PIN_NAME:
                    return new ImproperPinName();
                case Constants.RESULT_UNKNOWN_COMMAND:
                    return new UnknownCommand();
                default:
                    return new UndefinedException();
            }
        }
        return null;
    }
    
}
