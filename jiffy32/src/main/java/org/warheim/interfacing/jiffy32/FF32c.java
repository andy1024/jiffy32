/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.warheim.interfacing.jiffy32;

import java.io.IOException;
import org.warheim.interfacing.jiffy32.exceptions.AddressOutOfRange;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;
import org.warheim.interfacing.jiffy32.model.Address;
import org.warheim.interfacing.jiffy32.model.ChipInformation;

/**
 *
 * @author amaslowski
 */
public interface FF32c {
    ChipInformation getChipInfo() throws IOException;
    void setAddress(Address address) throws IOException, AddressOutOfRange;
    Address getAddress() throws IOException;
    void setVendor(String vendor) throws IOException;
    String getVendor() throws IOException;
    void setProduct(String product) throws IOException;
    String getProduct() throws IOException;
    String getSerialNumber() throws IOException;
    void setSerialNumber(String serial) throws IOException;
    void setDigitalOutput(byte pinBlock, byte PinNumber,
                              byte state) throws IOException, JiffyException;
    void setBlockDigitalOutputs(byte pinsBlock, String pinsMask,
                                    String states) throws IOException;
    byte readDigitalInput(byte pinBlock, byte pinNumber) throws IOException, JiffyException;
    boolean readBlockDigitalInputs(byte pinsBlock, String pinsMask) throws IOException;
    void setPWMOutput(byte pinBlock, byte pinNumber,
                          byte ratio) throws IOException, JiffyException;
    byte readAnalogInput(byte pinBlock, byte pinNumber) throws IOException, JiffyException;
    void setSPIPins(byte CSPinBlock, byte CSPinNumber,
                        byte SCKPinBlock, byte SCKPinNumber,
                        byte MOSIPinBlock, byte MOSIPinNumber,
                        byte MISOPinBlock, byte MISOPinNumber) throws IOException;
    boolean writeSPIBus(int dataLen, String data) throws IOException;
    boolean readSPIBus(int WRDataLen, int RDDataLen, String WRData) throws IOException;
    boolean setI2CPins(byte SCLPinBlock, byte SCLPinNumber,
                        byte SDAPinBlock, byte SDAPinNumber) throws IOException;
    boolean writeI2CBus(int dataLen, String data) throws IOException;
    boolean readI2CBus(int WRDataLen, int RDDataLen, String WRData) throws IOException;
    boolean set1WirePin(byte DQPinBlock, byte DQPinNumber) throws IOException;
    boolean write1WireBus(int dataLen, String data) throws IOException;
    boolean read1WireBus(int WRDataLen, int RDDataLen, String WRData) throws IOException;
    byte[] sendData(byte... commands) throws IOException;
    byte[] sendDataString(String value, byte... commands) throws IOException;
    boolean openComm() throws IOException;
    void closeComm() throws IOException;
    boolean getPath(int pCount) throws IOException; 
}
