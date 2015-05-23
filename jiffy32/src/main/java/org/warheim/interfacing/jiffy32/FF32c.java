package org.warheim.interfacing.jiffy32;

import java.io.IOException;
import org.warheim.interfacing.jiffy32.exceptions.AddressOutOfRange;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
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
    /* usb functions */
    public String getManufacturerString() throws IOException;
    public String getProductString() throws IOException;
    public String getSerialNumberString() throws IOException;
    public void close() throws IOException;
        
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
    void setDigitalOutput(int pinBlock, int pinNumber, boolean state) 
            throws IOException, JiffyException, ArgumentException;
    void setDigitalOutput(Pin pin, boolean state) 
            throws IOException, JiffyException, ArgumentException;
    void setBlockDigitalOutputs(int pinsBlock, int pinsMask, int states) 
            throws IOException, JiffyException, ArgumentException;
    int readDigitalInput(int pinBlock, int pinNumber) 
            throws IOException, JiffyException, ArgumentException;
    int readDigitalInput(Pin pin) 
            throws IOException, JiffyException, ArgumentException;
    int readBlockDigitalInputs(int pinsBlock, int pinsMask) 
            throws IOException, JiffyException, ArgumentException;
    void setPWMOutput(int pinBlock, int pinNumber, int ratio) 
            throws IOException, JiffyException, ArgumentException;
    void setPWMOutput(Pin pin, int ratio) 
            throws IOException, JiffyException, ArgumentException;
    int readAnalogInput(int pinBlock, int pinNumber) 
            throws IOException, JiffyException, ArgumentException;
    int readAnalogInput(Pin pin) 
            throws IOException, JiffyException, ArgumentException;
    
    /* SPI bus */
    //This method is called "Configure SPI bus (0x24)" in docs
    void setSPIPins(int CSPinBlock, int CSPinNumber,
                        int SCKPinBlock, int SCKPinNumber,
                        int MOSIPinBlock, int MOSIPinNumber,
                        int MISOPinBlock, int MISOPinNumber) 
            throws IOException, JiffyException, ArgumentException;
    void setSPIPins(Pin CS, Pin SCK, Pin MOSI, Pin MISO) 
            throws IOException, JiffyException, ArgumentException;
    void writeSPIBus(byte[] data) throws IOException, JiffyException;
    byte[] readSPIBus(int RDDataLen, byte[] WRData) 
            throws IOException, JiffyException, ArgumentException;
    
    /* i2c bus */
    void setI2CPins(int SCLPinBlock, int SCLPinNumber,
                        int SDAPinBlock, int SDAPinNumber) 
            throws IOException, JiffyException, ArgumentException;
    void setI2CPins(Pin SCL, Pin SDA) 
            throws IOException, JiffyException, ArgumentException;
    void writeI2CBus(byte[] data) 
            throws IOException, JiffyException;
    byte[] readI2CBus(int RDDataLen, byte[] WRData) 
            throws IOException, JiffyException, ArgumentException;

    void writeByteI2C(int addr, int value) 
            throws IOException, JiffyException, ArgumentException;
    void writeBlockI2C(int addr, byte[] values) 
            throws IOException, JiffyException, ArgumentException;
    int readByteI2C(int addr) 
            throws IOException, JiffyException, ArgumentException;
    byte[] readBlockI2C(int addr, int readLength) 
            throws IOException, JiffyException, ArgumentException;

    //Read a (two byte) word from a slave address (little-endian) (based on D. Otwell's code)
    short readWordI2C(int addr) 
            throws IOException, JiffyException, ArgumentException;
    
    /* 1-Wire bus */
    //This function is called "Configure 1-Wire/MicroLAN bus (0x2A)" in docs
    void set1WirePin(int DQPinBlock, int DQPinNumber) 
            throws IOException, JiffyException, ArgumentException;
    void set1WirePin(Pin DQ) 
            throws IOException, JiffyException, ArgumentException;
    boolean reset1WireBus() 
            throws IOException, JiffyException;
    void write1WireBus(byte[] data) 
            throws IOException, JiffyException;
    void writeBit1WireBus(boolean dataBit) 
            throws IOException, JiffyException;
    byte[] read1WireBus(int RDDataLen, byte[] WRData) 
            throws IOException, JiffyException, ArgumentException;
    boolean readBit1WireBus() 
            throws IOException, JiffyException;
    
    /* general communication functions */
    byte[] sendData(byte... commands) throws IOException;
    byte[] sendDataString(String value, byte... commands) throws IOException;
    
    /* general initialization functions */
    boolean openComm() throws IOException;
    void closeComm() throws IOException;
    boolean getPath(int pCount) throws IOException; 
    public String toString();
}
