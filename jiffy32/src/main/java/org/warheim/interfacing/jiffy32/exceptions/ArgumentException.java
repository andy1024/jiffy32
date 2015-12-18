package org.warheim.interfacing.jiffy32.exceptions;

/**
 *
 * @author amaslowski
 */
public class ArgumentException extends Exception {
     public ArgumentException(String message) {
         super("ArgumentException: " + message);
     }
}
