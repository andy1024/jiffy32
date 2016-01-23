package org.warheim.interfacing.jiffy32.core;

import org.warheim.interfacing.jiffy32.model.Pin;
import com.codeminders.hidapi.HIDDevice;
import java.io.IOException;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.warheim.interfacing.jiffy32.util.Utils;
import org.warheim.interfacing.jiffy32.exceptions.AddressOutOfRange;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.GeneralFF32Error;
import org.warheim.interfacing.jiffy32.exceptions.ImproperDataLengthParameterValue;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;
import org.warheim.interfacing.jiffy32.model.Address;
import org.warheim.interfacing.jiffy32.model.ChipInformation;

/**
 *
 * @author amaslowski
 */
public class FF32cImpl implements FF32c {
    HIDDevice dev;
    private static final byte BTRUE = 0x01;
    private static final byte BFALSE = 0x00;
    
    Logger logger = LoggerFactory.getLogger(FF32cImpl.class);

    public FF32cImpl(HIDDevice dev) {
        this.dev = dev;
    }
    
    private int b2i(byte b) {
        return (int)b & 0xFF;
    }
    
    private void validateArguments(int... args) 
            throws ArgumentException {
        for (int x: args) {
            if (x<0 || x>255) {
                String msg = String.format(Constants.ARGUMENT_EXC_MESSAGE_BYTE, x);
                throw new ArgumentException(msg);
            }
        }
    }
    
    @Override
    public ChipInformation getChipInfo() 
            throws IOException {
        byte[] result = sendData(Constants.CMD_GET_CHIP_INFO);
        return new ChipInformation(result);
    }

    @Override
    public void setAddress(Address address) 
            throws IOException, AddressOutOfRange {
        byte[] commands = new byte[2];
        commands[0] = Constants.CMD_SET_ADDRESS;
        commands[1] = address.getValue();
        byte[] result = sendData(commands);
        if (result!=null&&result.length>0&&result[0]==Constants.RESULT_OK) {
            
        } else {
            throw new AddressOutOfRange();
        }
            
    }

    @Override
    public Address getAddress() 
            throws IOException {
        byte[] result = sendData(Constants.CMD_GET_ADDRESS);
        if (result!=null&&result.length>1&&result[0]==Constants.CMD_GET_ADDRESS) {
            return new Address(result[1]);
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setVendor(String vendor) 
            throws IOException {
        byte[] result = sendDataString(vendor, Constants.CMD_SET_VENDOR);
        if (result!=null&&result.length>0&&result[0]==Constants.RESULT_OK) {
            
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public String getVendor() 
            throws IOException {
        byte[] result = sendData(Constants.CMD_GET_VENDOR);
        if (result!=null&&result.length>1&&result[0]==Constants.CMD_GET_VENDOR) {
            return Utils.convertPrefixedByteArrayToString(result);
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setProduct(String product) 
            throws IOException {
        byte[] result = sendDataString(product, Constants.CMD_SET_PRODUCT);
        if (result!=null&&result.length>0&&result[0]==Constants.RESULT_OK) {
            
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public String getProduct() 
            throws IOException {
        byte[] result = sendData(Constants.CMD_GET_PRODUCT);
        if (result!=null&&result.length>1&&result[0]==Constants.CMD_GET_PRODUCT) {
            return Utils.convertPrefixedByteArrayToString(result);
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public String getSerialNumber() 
            throws IOException {
        byte[] result = sendData(Constants.CMD_GET_SERIAL_NUMBER);
        if (result!=null&&result.length>1&&result[0]==Constants.CMD_GET_SERIAL_NUMBER) {
            return Utils.convertPrefixedByteArrayToString(result);
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setSerialNumber(String serial) 
            throws IOException {
        byte[] result = sendDataString(serial, Constants.CMD_SET_SERIAL_NUMBER);
        if (result!=null&&result.length>0&&result[0]==Constants.RESULT_OK) {
            
        } else {
            throw new GeneralFF32Error();
        }
    }
    
    private void logBytes(String msg, byte[] buffer) {
        logger.debug(msg);
        StringBuilder s = new StringBuilder();
        for (byte b: buffer) {
            s.append(String.format("%02X ", b));
        }
        logger.debug(s.toString());
    }

    private byte[] sendRaw(byte... commands) 
            throws IOException {
        logBytes("SEND:", commands);

        byte[] buffer = new byte[64];
        int n;
        n = dev.write(commands);
        if (n<0) {
            return null;
        }
        n = dev.read(buffer);
        if (n<0) {
            return null;
        }
        logBytes("RCVD["+n+"]", buffer);
        return buffer;
    }
    
    @Override
    public byte[] sendData(byte... commands) 
            throws IOException {
        byte[] buffer = new byte[commands.length + 1];
        buffer[0] = Constants.PRIMER;
        System.arraycopy(commands, 0, buffer, 1, commands.length);
        return sendRaw(buffer);
    }

    @Override
    public byte[] sendDataString(String value, byte... commands) 
            throws IOException {
        byte[] buffer = new byte[commands.length + 1 + value.length()];
        buffer[0] = Constants.PRIMER;
        System.arraycopy(commands, 0, buffer, 1, commands.length);
        byte[] str = value.getBytes();//Charset.forName("UTF-8"));
        int len = value.length();

        if (len > Constants.MAX_METADATA_BUFFER_LENGTH)
            len = Constants.MAX_METADATA_BUFFER_LENGTH;
        int startIndex = 1+commands.length;
        System.arraycopy(str, 0, buffer, startIndex, len);
        Arrays.fill(buffer, startIndex + len, buffer.length, Constants.PRIMER);
        return sendRaw(buffer);

    }

    @Override
    public boolean openComm() 
            throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeComm() 
            throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getPath(int pCount) 
            throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDigitalOutput(int pinBlock, int pinNumber, boolean state) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(pinBlock, pinNumber);
        byte[] commands = new byte[4];
        commands[0] = Constants.CMD_SET_DIGITAL_OUTPUT;
        commands[1] = (byte)pinBlock;
        commands[2] = (byte)pinNumber;
        commands[3] = (state?BTRUE:BFALSE);
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setDigitalOutput(Pin pin, boolean state) 
            throws IOException, JiffyException, ArgumentException {
        setDigitalOutput(pin.getBlock(), pin.getNumber(), state);
    }

    @Override
    public void setBlockDigitalOutputs(int pinsBlock, int pinsMask, int states) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(pinsBlock);
        byte[] commands = new byte[6];
        commands[0] = Constants.CMD_SET_BLOCK_DIGITAL_OUTPUTS;
        commands[1] = (byte)pinsBlock;
        byte maskLSB = (byte)(pinsMask & 0xFF);
        byte maskMSB = (byte)((pinsMask >> 8)& 0xFF);
        commands[2] = maskMSB;
        commands[3] = maskLSB;
        byte stateLSB = (byte)(states & 0xFF);
        byte stateMSB = (byte)((states >> 8)& 0xFF);
        
        commands[4] = stateMSB;
        commands[5] = stateLSB;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public int readDigitalInput(int pinBlock, int pinNumber) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(pinBlock, pinNumber);
        byte[] commands = new byte[3];
        commands[0] = Constants.CMD_READ_DIGITAL_INPUT;
        commands[1] = (byte)pinBlock;
        commands[2] = (byte)pinNumber;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>1&&result[0]==Constants.CMD_READ_DIGITAL_INPUT) {
                return result[1];
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public int readDigitalInput(Pin pin) 
            throws IOException, JiffyException, ArgumentException {
        return readDigitalInput(pin.getBlock(), pin.getNumber());
    }

    @Override
    public int readBlockDigitalInputs(int pinsBlock, int pinsMask) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(pinsBlock);
        byte[] commands = new byte[4];
        commands[0] = Constants.CMD_READ_BLOCK_DIGITAL_INPUTS;
        commands[1] = (byte)pinsBlock;
        byte maskLSB = (byte)(pinsMask & 0xFF);
        byte maskMSB = (byte)((pinsMask >> 8)& 0xFF);
        commands[2] = maskMSB;
        commands[3] = maskLSB;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>2&&result[0]==Constants.CMD_READ_BLOCK_DIGITAL_INPUTS) {
                int retval = (result[1] << 8) | result[2];
                return retval;
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setPWMOutput(int pinBlock, int pinNumber, int ratio) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(pinBlock, pinNumber, ratio);
        byte[] commands = new byte[4];
        commands[0] = Constants.CMD_SET_PWM_OUTPUT;
        commands[1] = (byte)pinBlock;
        commands[2] = (byte)pinNumber;
        commands[3] = (byte)ratio;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setPWMOutput(Pin pin, int ratio) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(ratio);
        setPWMOutput(pin.getBlock(), pin.getNumber(), ratio);
    }

    @Override
    public int[] readAnalogInput(int pinBlock, int pinNumber) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(pinBlock, pinNumber);
        byte[] commands = new byte[3];
        commands[0] = Constants.CMD_READ_ANALOG_INPUT;
        commands[1] = (byte)pinBlock;
        commands[2] = (byte)pinNumber;
        byte[] result = sendData(commands);
        int[] retval = new int[2];
        if (result!=null) {
            if (result.length>=4&&result[0]==Constants.CMD_READ_ANALOG_INPUT) {
                retval[0] = result[1];
                retval[1] = Utils.byteToInt(result, 2);
                return retval;
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public int[] readAnalogInput(Pin pin) 
            throws IOException, JiffyException, ArgumentException {
        return readAnalogInput(pin.getBlock(), pin.getNumber());
    }

    @Override
    public int[] readBlockAnalogInputs(int pinsBlock, int pinsMask) throws IOException, JiffyException, ArgumentException {
        validateArguments(pinsBlock);
        byte[] commands = new byte[4];
        commands[0] = Constants.CMD_READ_BLOCK_ANALOG_INPUTS;
        commands[1] = (byte)pinsBlock;
        byte maskLSB = (byte)(pinsMask & 0xFF);
        byte maskMSB = (byte)((pinsMask >> 8)& 0xFF);
        commands[2] = maskMSB;
        commands[3] = maskLSB;
        byte[] result = sendData(commands);
        int[] retval = new int[13];
        if (result!=null) {
            if (result.length>=25&&result[0]==Constants.CMD_READ_BLOCK_ANALOG_INPUTS) {
                retval[0] = result[1];
                for (int i=2;i<26;i=i+2) {
                    retval[i/2]= Utils.byteToInt(result, i, 2);
                }
                return retval;
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    //WARNING: not tested yet
    @Override
    public void writeSPIBus(byte[] data) 
            throws IOException, JiffyException {
        if (data.length>Constants.MAX_BUS_DATA_BUFFER_LENGTH) {
            throw new ImproperDataLengthParameterValue();
        }
        byte[] commands = new byte[2+data.length];
        commands[0] = Constants.CMD_WRITE_SPI_BUS;
        commands[1] = (byte)data.length;
        System.arraycopy(data, 0, commands, 2, data.length);
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    //WARNING: not tested yet
    //This method is called "Configure SPI bus (0x24)" in docs
    @Override
    public void setSPIPins(int CSPinBlock, int CSPinNumber, int SCKPinBlock, int SCKPinNumber, 
            int MOSIPinBlock, int MOSIPinNumber, int MISOPinBlock, int MISOPinNumber) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(CSPinBlock, CSPinNumber, SCKPinBlock, SCKPinNumber, 
                MOSIPinBlock, MOSIPinNumber, MISOPinBlock, MISOPinNumber);
        
        byte[] commands = new byte[10];
        commands[0] = Constants.CMD_CONFIG_SPI_BUS;
        commands[1] = (byte)CSPinBlock;
        commands[2] = (byte)CSPinNumber;
        commands[3] = (byte)SCKPinBlock;
        commands[4] = (byte)SCKPinNumber;
        commands[5] = (byte)MOSIPinBlock;
        commands[6] = (byte)MOSIPinNumber;
        commands[7] = (byte)MISOPinBlock;
        commands[8] = (byte)MISOPinNumber;
        commands[9] = 0x00;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }    
    }
    
    @Override
    public void setSPIPins(Pin CS, Pin SCK, Pin MOSI, Pin MISO) 
            throws IOException, JiffyException, ArgumentException {
        setSPIPins(CS.getBlock(), CS.getNumber(), SCK.getBlock(), SCK.getNumber(), 
                MOSI.getBlock(), MOSI.getNumber(), MISO.getBlock(), MISO.getNumber());
    }

    //WARNING: not tested yet
    @Override
    public byte[] readSPIBus(int RDDataLen, byte[] WRData) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(RDDataLen);
        if (WRData.length>Constants.MAX_BUS_DATA_BUFFER_LENGTH||RDDataLen>Constants.MAX_BUS_DATA_BUFFER_LENGTH) {
            throw new ImproperDataLengthParameterValue();
        }
        byte[] commands = new byte[3+WRData.length];
        commands[0] = Constants.CMD_READ_SPI_BUS;
        commands[1] = (byte)WRData.length;
        commands[2] = (byte)RDDataLen;
        System.arraycopy(WRData, 0, commands, 3, WRData.length);
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>1&&result[0]==Constants.CMD_READ_SPI_BUS) {
                byte readBytesArrayLength = result[1];
                byte[] retval = new byte[readBytesArrayLength];
                System.arraycopy(result, 2, retval, 0, readBytesArrayLength);
                return retval;
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setI2CPins(int SCLPinBlock, int SCLPinNumber, int SDAPinBlock, int SDAPinNumber) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(SCLPinBlock, SCLPinNumber, SDAPinBlock, SDAPinNumber);
        byte[] commands = new byte[5];
        commands[0] = Constants.CMD_CONFIG_I2C_BUS;
        commands[1] = (byte)SCLPinBlock;
        commands[2] = (byte)SCLPinNumber;
        commands[3] = (byte)SDAPinBlock;
        commands[4] = (byte)SDAPinNumber;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }
    
    @Override
    public void setI2CPins(Pin SCL, Pin SDA) 
            throws IOException, JiffyException, ArgumentException {
        setI2CPins(SCL.getBlock(), SCL.getNumber(), SDA.getBlock(), SDA.getNumber());
    }

    @Override
    public void writeI2CBus(byte[] data) 
            throws IOException, JiffyException {
        if (data.length>Constants.MAX_BUS_DATA_BUFFER_LENGTH) {
            throw new ImproperDataLengthParameterValue();
        }
        byte[] commands = new byte[2+data.length];
        commands[0] = Constants.CMD_WRITE_I2C_BUS;
        commands[1] = (byte)data.length;
        System.arraycopy(data, 0, commands, 2, data.length);
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {
                
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public byte[] readI2CBus(int RDDataLen, byte[] WRData) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(RDDataLen);
        if (WRData.length>Constants.MAX_BUS_DATA_BUFFER_LENGTH||RDDataLen>Constants.MAX_BUS_DATA_BUFFER_LENGTH) {
            throw new ImproperDataLengthParameterValue();
        }
        byte[] commands = new byte[3+WRData.length];
        commands[0] = Constants.CMD_READ_I2C_BUS;
        commands[1] = (byte)WRData.length;
        commands[2] = (byte)RDDataLen;
        System.arraycopy(WRData, 0, commands, 3, WRData.length);
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>1&&result[0]==Constants.CMD_READ_I2C_BUS) {
                byte readBytesArrayLength = result[1];
                byte[] retval = new byte[readBytesArrayLength];
                System.arraycopy(result, 2, retval, 0, readBytesArrayLength);
                return retval;
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }
    
    @Override
    public void writeByteI2C(int addr, int value) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(addr, value);
        addr = (byte)(addr * 2);
        byte[] data =  {(byte)addr, (byte)value};
        //byte[] result = 
        writeI2CBus(data);
    }

    @Override
    public void writeBlockI2C(int addr, byte[] values) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(addr);
        addr = (byte)(addr * 2);
        byte[] data =  new byte[1+values.length];
        data[0] = (byte)addr;
        System.arraycopy(values, 0, data, 1, values.length);
        writeI2CBus(data);
    }

    @Override
    public int readByteI2C(int addr) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(addr);
        addr = (byte)(addr * 2 + 1);
        byte[] data =  {(byte)addr};
        byte[] result = readI2CBus((byte)1, data);
        return b2i(result[0]);
    }

    @Override
    public byte[] readBlockI2C(int addr, int readLength) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(addr, readLength);
        addr = (byte)(addr * 2 + 1);
        byte[] data =  {(byte)addr};
        byte[] result = readI2CBus(readLength, data);
        return result;
    }
    

    /**
     *  Read a (two byte) word from a slave address (little-endian) (based on D. Otwell's code)
     * @param addr
     * @return
     * @throws IOException
     * @throws JiffyException 
     * @throws org.warheim.interfacing.jiffy32.exceptions.ArgumentException 
     */
    @Override
    public short readWordI2C(int addr) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(addr);
        addr = (byte)(addr * 2 + 1);
        byte[] data =  {(byte)addr};
        byte[] result = readI2CBus((byte)2, data);
        return (short)((result[1] << 8) | result[0]);
    }

    //WARNING: not tested yet
    //This function is called "Configure 1-Wire/MicroLAN bus (0x2A)" in docs
    @Override
    public void set1WirePin(int DQPinBlock, int DQPinNumber) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(DQPinBlock, DQPinNumber);
        byte[] commands = new byte[3];
        commands[0] = Constants.CMD_CONFIG_1WIRE_BUS;
        commands[1] = (byte)DQPinBlock;
        commands[2] = (byte)DQPinNumber;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }
    
    @Override
    public void set1WirePin(Pin DQ) 
            throws IOException, JiffyException, ArgumentException {
        set1WirePin(DQ.getBlock(), DQ.getNumber());
    }

    //WARNING: not tested yet
    @Override
    public boolean reset1WireBus() 
            throws IOException, JiffyException {
        byte[] commands = new byte[1];
        commands[0] = Constants.CMD_RESET_1WIRE_BUS;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>1&&result[0]==Constants.CMD_RESET_1WIRE_BUS) {
                return (result[1]!=BFALSE);
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void write1WireBus(byte data) throws IOException, JiffyException {
        write1WireBus(new byte[]{data});
    }

    //WARNING: not tested yet
    @Override
    public void write1WireBus(byte[] data) 
            throws IOException, JiffyException {
        if (data.length>Constants.MAX_BUS_DATA_BUFFER_LENGTH) {
            throw new ImproperDataLengthParameterValue();
        }
        byte[] commands = new byte[2+data.length];
        commands[0] = Constants.CMD_WRITE_1WIRE_BUS;
        commands[1] = (byte)data.length;
        System.arraycopy(data, 0, commands, 2, data.length);
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    //WARNING: not tested yet
    @Override
    public void writeBit1WireBus(boolean dataBit) 
            throws IOException, JiffyException {
        byte[] commands = new byte[2];
        commands[0] = Constants.CMD_WRITE_BIT_1WIRE_BUS;
        commands[1] = (byte)(dataBit?BTRUE:BFALSE);
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    //WARNING: not tested yet
    @Override
    public byte[] read1WireBus(int RDDataLen, byte[] WRData) 
            throws IOException, JiffyException, ArgumentException {
        validateArguments(RDDataLen);
        if (WRData.length>Constants.MAX_BUS_DATA_BUFFER_LENGTH||RDDataLen>Constants.MAX_BUS_DATA_BUFFER_LENGTH) {
            throw new ImproperDataLengthParameterValue();
        }
        byte[] commands = new byte[3+WRData.length];
        commands[0] = Constants.CMD_READ_1WIRE_BUS;
        commands[1] = (byte)WRData.length;
        commands[2] = (byte)RDDataLen;
        System.arraycopy(WRData, 0, commands, 3, WRData.length);
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>1&&result[0]==Constants.CMD_READ_1WIRE_BUS) {
                byte readBytesArrayLength = result[1];
                byte[] retval = new byte[readBytesArrayLength];
                System.arraycopy(result, 2, retval, 0, readBytesArrayLength);
                return retval;
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    //WARNING: not tested yet
    @Override
    public boolean readBit1WireBus() 
            throws IOException, JiffyException {
        byte[] commands = new byte[1];
        commands[0] = Constants.CMD_READ_BIT_1WIRE_BUS;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>1&&result[0]==Constants.CMD_READ_BIT_1WIRE_BUS) {
                return (result[1]!=BFALSE);
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public String getManufacturerString() throws IOException {
        return dev.getManufacturerString();
    }

    @Override
    public String getProductString() throws IOException {
        return dev.getProductString();
    }

    @Override
    public String getSerialNumberString() throws IOException {
        return dev.getSerialNumberString();
    }

    @Override
    public void close() throws IOException {
        dev.close();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setMode1Wire(boolean enableImplicitReset) throws IOException, JiffyException {
        byte[] commands = new byte[2];
        commands[0] = Constants.CMD_SET_MODE_1WIRE_BUS;
        commands[1] = (byte)(!enableImplicitReset?BTRUE:BFALSE);//this is correct according to specs
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {
                
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setDefaultItem1Wire(int pinBlock, int pinNumber) throws IOException, JiffyException, ArgumentException {
        validateArguments(pinBlock, pinNumber);
        byte[] commands = new byte[4];
        commands[0] = Constants.CMD_SET_DEFAULT_ITEM_1WIRE_BUS;
        commands[1] = Constants.HEADER_SET_DEFAULT_ITEM_1WIRE_BUS;
        commands[2] = (byte)pinBlock;
        commands[3] = (byte)pinNumber;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {
                
            } else {
                JiffyException je = JiffyException.decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setDefaultItem1Wire(Pin defaultItem) throws IOException, JiffyException, ArgumentException {
        setDefaultItem1Wire(defaultItem.getBlock(), defaultItem.getNumber());
    }
    
}
