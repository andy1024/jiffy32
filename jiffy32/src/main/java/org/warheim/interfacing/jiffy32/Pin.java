package org.warheim.interfacing.jiffy32;

/**
 *
 * @author amaslowski
 */
public enum Pin {
    A1(0x0A,1),
    A2(0x0A,2),
    A3(0x0A,3),
    A4(0x0A,4),
    A5(0x0A,5),
    A6(0x0A,6),
    B1(0x0B,1),
    B2(0x0B,2),
    B3(0x0B,3),
    B4(0x0B,4),
    B5(0x0B,5),
    B6(0x0B,6),
    B7(0x0B,7),
    B8(0x0B,8),
    B9(0x0B,9),
    B10(0x0B,10),
    B11(0x0B,11),
    B12(0x0B,12);
    private final byte pinBlock;
    private final byte pinNumber;
    private Pin(int pinBlock, int pinNumber) {
        this.pinBlock = (byte)pinBlock;
        this.pinNumber = (byte)pinNumber;
    }
    public byte getBlock() {
        return pinBlock;
    }
    public byte getNumber() {
        return pinNumber;
    }
}
