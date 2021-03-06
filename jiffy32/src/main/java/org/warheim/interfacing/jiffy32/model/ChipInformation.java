package org.warheim.interfacing.jiffy32.model;

import org.warheim.interfacing.jiffy32.core.Constants;

/**
 *
 * @author amaslowski
 */
public class ChipInformation {
    private short identifier;
    private byte versionHigh;
    private byte versionLow;

    public short getIdentifier() {
        return identifier;
    }

    public void setIdentifier(short identifier) {
        this.identifier = identifier;
    }

    public byte getVersionHigh() {
        return versionHigh;
    }

    public void setVersionHigh(byte versionHigh) {
        this.versionHigh = versionHigh;
    }

    public byte getVersionLow() {
        return versionLow;
    }

    public void setVersionLow(byte versionLow) {
        this.versionLow = versionLow;
    }

    public ChipInformation(byte[] input) {
        if (input!=null&&input.length>=5&&input[0]==Constants.CMD_GET_CHIP_INFO) {
            identifier = (short)(input[1] & input[2]<<8);
            versionHigh = input[3];
            versionLow = input[4];
        }
    }

    @Override
    public String toString() {
        return "ChipInformation{" + "identifier=" + identifier + ", versionHigh=" + versionHigh + ", versionLow=" + versionLow + '}';
    }
    
}
