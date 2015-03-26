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
    /* device metadata functions */
    ChipInformation getChipInfo() throws IOException;
    void setAddress(Address address) throws IOException, AddressOutOfRange;
    Address getAddress() throws IOException;
    void setVendor(String vendor) throws IOException;
    String getVendor() throws IOException;
    void setProduct(String product) throws IOException;
    String getProduct() throws IOException;
    String getSerialNumber() throws IOException;
    void setSerialNumber(String serial) throws IOException;
    
    /* simple interface functions */
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
    
    /* SPI bus */
    //This method is called "Configure SPI bus (0x24)" in docs
    void setSPIPins(byte CSPinBlock, byte CSPinNumber,
                        byte SCKPinBlock, byte SCKPinNumber,
                        byte MOSIPinBlock, byte MOSIPinNumber,
                        byte MISOPinBlock, byte MISOPinNumber) throws IOException, JiffyException;
    void setSPIPins(Pin CS, Pin SCK, Pin MOSI, Pin MISO) throws IOException, JiffyException;
    void writeSPIBus(byte[] data) throws IOException, JiffyException;
    byte[] readSPIBus(byte RDDataLen, byte[] WRData) throws IOException, JiffyException;
    
    /* i2c bus */
    void setI2CPins(byte SCLPinBlock, byte SCLPinNumber,
                        byte SDAPinBlock, byte SDAPinNumber) throws IOException, JiffyException;
    void setI2CPins(Pin SCL, Pin SDA) throws IOException, JiffyException;
    void writeI2CBus(byte[] data) throws IOException, JiffyException;
    byte[] readI2CBus(byte RDDataLen, byte[] WRData) throws IOException, JiffyException;
    
    /* 1-Wire bus */
    //This function is called "Configure 1-Wire/MicroLAN bus (0x2A)" in docs
    void set1WirePin(byte DQPinBlock, byte DQPinNumber) throws IOException, JiffyException;
    void set1WirePin(Pin DQ) throws IOException, JiffyException;
    boolean reset1WireBus() throws IOException, JiffyException;
    void write1WireBus(byte[] data) throws IOException, JiffyException;
    void writeBit1WireBus(boolean dataBit) throws IOException, JiffyException;
    byte[] read1WireBus(byte RDDataLen, byte[] WRData) throws IOException, JiffyException;
    boolean readBit1WireBus() throws IOException, JiffyException;
    
    /* general communication functions */
    byte[] sendData(byte... commands) throws IOException;
    byte[] sendDataString(String value, byte... commands) throws IOException;
    
    /* general initialization functions */
    boolean openComm() throws IOException;
    void closeComm() throws IOException;
    boolean getPath(int pCount) throws IOException; 
}
