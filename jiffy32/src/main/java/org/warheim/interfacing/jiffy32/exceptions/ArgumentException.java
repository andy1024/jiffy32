/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
