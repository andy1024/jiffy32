package org.warheim.interfacing.jiffy32.model;

/**
 *
 * @author amaslowski
 */
public class Address {
    private byte value;

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public Address(byte value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" + "value=" + value + '}';
    }
    
}
