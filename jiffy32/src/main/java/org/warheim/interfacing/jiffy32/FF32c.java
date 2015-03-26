package org.warheim.interfacing.jiffy32;

import java.io.IOException;
import org.warheim.interfacing.jiffy32.exceptions.AddressOutOfRange;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;
import org.warheim.interfacing.jiffy32.model.Address;
import org.warheim.interfacing.jiffy32.model.ChipInformation;

/**
 *
 * FF32 interface
 * for details please consult http://www.flyfish-tech.com/FF32/FF32_datasheet.pdf
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
    void setDigitalOutput(byte pinBlock, byte pinNumber,
                              boolean state) throws IOException, JiffyException;
    void setDigitalOutput(Pin pin, boolean state) throws IOException, JiffyException;
    void setBlockDigitalOutputs(byte pinsBlock, int pinsMask,
                                    int states) throws IOException, JiffyException;
    byte readDigitalInput(byte pinBlock, byte pinNumber) throws IOException, JiffyException;
    byte readDigitalInput(Pin pin) throws IOException, JiffyException;
    int readBlockDigitalInputs(byte pinsBlock, int pinsMask) throws IOException, JiffyException;
    void setPWMOutput(byte pinBlock, byte pinNumber,
                          byte ratio) throws IOException, JiffyException;
    void setPWMOutput(Pin pin, byte ratio) throws IOException, JiffyException;
    byte readAnalogInput(byte pinBlock, byte pinNumber) throws IOException, JiffyException;
    byte readAnalogInput(Pin pin) throws IOException, JiffyException;
    void setSPIPins(byte CSPinBlock, byte CSPinNumber,
                        byte SCKPinBlock, byte SCKPinNumber,
                        byte MOSIPinBlock, byte MOSIPinNumber,
                        byte MISOPinBlock, byte MISOPinNumber) throws IOException, JiffyException;
    boolean writeSPIBus(int dataLen, String data) throws IOException, JiffyException;
    boolean readSPIBus(int WRDataLen, int RDDataLen, String WRData) throws IOException;
    void setI2CPins(byte SCLPinBlock, byte SCLPinNumber,
                        byte SDAPinBlock, byte SDAPinNumber) throws IOException, JiffyException;
    void writeI2CBus(byte[] data) throws IOException, JiffyException;
    byte[] readI2CBus(byte RDDataLen, byte[] WRData) throws IOException, JiffyException;
    boolean set1WirePin(byte DQPinBlock, byte DQPinNumber) throws IOException, JiffyException;
    boolean write1WireBus(int dataLen, String data) throws IOException, JiffyException;
    boolean read1WireBus(int WRDataLen, int RDDataLen, String WRData) throws IOException, JiffyException;
    byte[] sendData(byte... commands) throws IOException;
    byte[] sendDataString(String value, byte... commands) throws IOException;
    boolean openComm() throws IOException;
    void closeComm() throws IOException;
    boolean getPath(int pCount) throws IOException; 
}
