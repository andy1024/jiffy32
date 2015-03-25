/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.warheim.interfacing.jiffy32;

/**
 *
 * @author amaslowski
 */
public class Constants {
    public static final String PRODUCT_NAME = "FF32";

    public static final byte PRIMER          =        0x00;
    public static final byte CMD_SET_ADDRESS =        0x10;
    public static final byte CMD_GET_ADDRESS =        0x11;
    public static final byte CMD_SET_VENDOR =         0x12;
    public static final byte CMD_GET_VENDOR = 	0x13;
    public static final byte CMD_SET_PRODUCT = 	0x14;
    public static final byte CMD_GET_PRODUCT = 	0x15;
    public static final byte CMD_SET_SERIAL_NUMBER = 	0x16;
    public static final byte CMD_GET_SERIAL_NUMBER = 	0x17;

    public static final byte CMD_SET_DIGITAL_OUTPUT = 0x20;
    public static final byte CMD_SET_BLOCK_DIGITAL_OUTPUTS = 0x30;
    public static final byte CMD_READ_DIGITAL_INPUT = 0x21;
    public static final byte CMD_READ_BLOCK_DIGITAL_INPUTS = 0x31;
    public static final byte CMD_SET_PWM_OUTPUT = 	0x22;
    public static final byte CMD_READ_ANALOG_INPUT = 	0x23;
    public static final byte CMD_CONFIG_SPI_BUS = 	0x24;
    public static final byte CMD_WRITE_SPI_BUS = 	0x25;
    public static final byte CMD_READ_SPI_BUS = 	0x26;

    public static final byte CMD_CONFIG_I2C_BUS = 	0x27;
    public static final byte CMD_WRITE_I2C_BUS = 	0x28;
    public static final byte CMD_READ_I2C_BUS = 	0x29;
    public static final byte CMD_CONFIG_1WIRE_BUS = 	0x2A;
    public static final byte CMD_WRITE_1WIRE_BUS = 	0x2B;
    public static final byte CMD_READ_1WIRE_BUS = 	0x2C;

    public static final byte CMD_GET_CHIP_INFO = 	0x71;
    
    public static final byte RESULT_OK                    =       0x0E;
    public static final byte RESULT_ADDRESS_OUT_OF_RANGE  =       0x03;
    public static final byte RESULT_IMPROPER_PIN_NAME     =       0x01;
    public static final byte RESULT_IMPROPER_PINS_BLOCK_ID=       0x05;
    public static final byte RESULT_UNKNOWN_COMMAND       =       0x0F;
    public static final byte RESULT_IMPROPER_DATA_LEN     =       0x02;
    public static final byte RESULT_ACK_ABSENT            =       0x04;
    
    public static final byte A = 0x0A;
    public static final byte B = 0x0B;

}
