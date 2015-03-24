/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.warheim.interfacing.jiffy32;

import com.codeminders.hidapi.HIDDevice;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.warheim.interfacing.jiffy32.util.Utils;
import org.warheim.interfacing.jiffy32.exceptions.AddressOutOfRange;
import org.warheim.interfacing.jiffy32.exceptions.DeviceAcknowlegdementAbsent;
import org.warheim.interfacing.jiffy32.exceptions.GeneralFF32Error;
import org.warheim.interfacing.jiffy32.exceptions.ImproperDataLengthParameterValue;
import org.warheim.interfacing.jiffy32.exceptions.ImproperPinName;
import org.warheim.interfacing.jiffy32.exceptions.ImproperPinsBlockIdentifier;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;
import org.warheim.interfacing.jiffy32.exceptions.UndefinedException;
import org.warheim.interfacing.jiffy32.exceptions.UnknownCommand;
import org.warheim.interfacing.jiffy32.model.Address;
import org.warheim.interfacing.jiffy32.model.ChipInformation;

/**
 *
 * @author amaslowski
 */
public class FF32cImpl implements FF32c {
    HIDDevice dev;

    public FF32cImpl(HIDDevice dev) {
        this.dev = dev;
    }
    
    @Override
    public ChipInformation getChipInfo() throws IOException {
        byte[] result = sendData(Constants.CMD_GET_CHIP_INFO);
        return new ChipInformation(result);
    }

    @Override
    public void setAddress(Address address) throws IOException, AddressOutOfRange {
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
    public Address getAddress() throws IOException {
        byte[] result = sendData(Constants.CMD_GET_ADDRESS);
        if (result!=null&&result.length>1&&result[0]==Constants.CMD_GET_ADDRESS) {
            return new Address(result[1]);
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setVendor(String vendor) throws IOException {
        byte[] result = sendDataString(vendor, Constants.CMD_SET_VENDOR);
        if (result!=null&&result.length>0&&result[0]==Constants.RESULT_OK) {
            
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public String getVendor() throws IOException {
        byte[] result = sendData(Constants.CMD_GET_VENDOR);
        if (result!=null&&result.length>1&&result[0]==Constants.CMD_GET_VENDOR) {
            return Utils.convertPrefixedByteArrayToString(result);
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setProduct(String product) throws IOException {
        byte[] result = sendDataString(product, Constants.CMD_SET_PRODUCT);
        if (result!=null&&result.length>0&&result[0]==Constants.RESULT_OK) {
            
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public String getProduct() throws IOException {
        byte[] result = sendData(Constants.CMD_GET_PRODUCT);
        if (result!=null&&result.length>1&&result[0]==Constants.CMD_GET_PRODUCT) {
            return Utils.convertPrefixedByteArrayToString(result);
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public String getSerialNumber() throws IOException {
        byte[] result = sendData(Constants.CMD_GET_SERIAL_NUMBER);
        if (result!=null&&result.length>1&&result[0]==Constants.CMD_GET_SERIAL_NUMBER) {
            return Utils.convertPrefixedByteArrayToString(result);
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setSerialNumber(String serial) throws IOException {
        byte[] result = sendDataString(serial, Constants.CMD_SET_SERIAL_NUMBER);
        if (result!=null&&result.length>0&&result[0]==Constants.RESULT_OK) {
            
        } else {
            throw new GeneralFF32Error();
        }
    }
    
    private JiffyException decodeException(byte[] buffer) {
        if (buffer!=null&&buffer.length>0) {
            switch (buffer[0]) {
                case Constants.RESULT_ACK_ABSENT:
                    return new DeviceAcknowlegdementAbsent();
                case Constants.RESULT_ADDRESS_OUT_OF_RANGE:
                    return new AddressOutOfRange();
                case Constants.RESULT_IMPROPER_DATA_LEN:
                    return new ImproperDataLengthParameterValue();
                case Constants.RESULT_IMPROPER_PINS_BLOCK_ID:
                    return new ImproperPinsBlockIdentifier();
                case Constants.RESULT_IMPROPER_PIN_NAME:
                    return new ImproperPinName();
                case Constants.RESULT_UNKNOWN_COMMAND:
                    return new UnknownCommand();
                default:
                    return new UndefinedException();
            }
        }
        return null;
    }

    @Override
    public void setDigitalOutput(byte pinBlock, byte pinNumber, byte state) throws IOException, JiffyException {
        byte[] commands = new byte[4];
        commands[0] = Constants.CMD_SET_DIGITAL_OUTPUT;
        commands[1] = pinBlock;
        commands[2] = pinNumber;
        commands[3] = state;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setBlockDigitalOutputs(byte PinsBlock, String PinsMask, String States) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public byte readDigitalInput(byte pinBlock, byte pinNumber) throws IOException, JiffyException {
        byte[] commands = new byte[3];
        commands[0] = Constants.CMD_READ_DIGITAL_INPUT;
        commands[1] = pinBlock;
        commands[2] = pinNumber;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>1&&result[0]==Constants.CMD_READ_DIGITAL_INPUT) {
                return result[1];
            } else {
                JiffyException je = decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public boolean readBlockDigitalInputs(byte PinsBlock, String PinsMask) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPWMOutput(byte pinBlock, byte pinNumber, byte ratio) throws IOException, JiffyException {
        byte[] commands = new byte[4];
        commands[0] = Constants.CMD_SET_PWM_OUTPUT;
        commands[1] = pinBlock;
        commands[2] = pinNumber;
        commands[3] = ratio;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>0&&result[0]==Constants.RESULT_OK) {

            } else {
                JiffyException je = decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public byte readAnalogInput(byte pinBlock, byte pinNumber) throws IOException, JiffyException {
        byte[] commands = new byte[3];
        commands[0] = Constants.CMD_READ_ANALOG_INPUT;
        commands[1] = pinBlock;
        commands[2] = pinNumber;
        byte[] result = sendData(commands);
        if (result!=null) {
            if (result.length>1&&result[0]==Constants.CMD_READ_ANALOG_INPUT) {
                return result[1];
            } else {
                JiffyException je = decodeException(result);
                throw je;
            }
        } else {
            throw new GeneralFF32Error();
        }
    }

    @Override
    public void setSPIPins(byte CSPinBlock, byte CSPinNumber, byte SCKPinBlock, byte SCKPinNumber, byte MOSIPinBlock, byte MOSIPinNumber, byte MISOPinBlock, byte MISOPinNumber) throws IOException {
        byte[] commands = new byte[10];
        commands[0] = Constants.CMD_CONFIG_SPI_BUS;
        commands[1] = CSPinBlock;
        commands[2] = CSPinNumber;
        commands[3] = SCKPinBlock;
        commands[4] = SCKPinNumber;
        commands[5] = MOSIPinBlock;
        commands[6] = MOSIPinNumber;
        commands[7] = MISOPinBlock;
        commands[8] = MISOPinNumber;
        commands[9] = 0;
        sendData(commands);
    }

    @Override
    public boolean writeSPIBus(int DataLen, String Data) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean readSPIBus(int WRDataLen, int RDDataLen, String WRData) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setI2CPins(byte SCLPinBlock, byte SCLPinNumber, byte SDAPinBlock, byte SDAPinNumber) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeI2CBus(int DataLen, String Data) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean readI2CBus(int WRDataLen, int RDDataLen, String WRData) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean set1WirePin(byte DQPinBlock, byte DQPinNumber) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean write1WireBus(int DataLen, String Data) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean read1WireBus(int WRDataLen, int RDDataLen, String WRData) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private byte[] sendRaw(byte... commands) throws IOException {
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
        return buffer;
    }
    
    @Override
    public byte[] sendData(byte... commands) throws IOException {
        byte[] buffer = new byte[commands.length + 1];
        buffer[0] = Constants.PRIMER;
        System.arraycopy(commands, 0, buffer, 1, commands.length);
        return sendRaw(buffer);
    }

    @Override
    public byte[] sendDataString(String value, byte... commands) throws IOException {
        byte[] buffer = new byte[commands.length + 1 + value.length()];
        buffer[0] = Constants.PRIMER;
        System.arraycopy(commands, 0, buffer, 1, commands.length);
        byte[] str = value.getBytes(Charset.forName("UTF-8"));
        int len = value.length();

        if (len > 32)
            len = 32;
        int startIndex = 1+commands.length;
        int endIndex = startIndex + len;
        System.arraycopy(str, 0, buffer, startIndex, endIndex);
        Arrays.fill(buffer, len, 34, Constants.PRIMER);
        return sendRaw(buffer);

    }

    @Override
    public boolean openComm() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeComm() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getPath(int pCount) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
