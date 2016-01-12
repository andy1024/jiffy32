package org.warheim.interfacing.jiffy32.hl;

import com.codeminders.hidapi.ClassPathLibraryLoader;
import java.io.IOException;
import org.warheim.interfacing.jiffy32.FF32Factory;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;
import org.warheim.interfacing.jiffy32.model.Pin;

/**
 *
 * @author andy
 */
public class OneWireDevice {
    static {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }
    
    public static final byte ONEWIRE_CMD_SELECT = (byte)0x55;
    public static final byte ONEWIRE_CMD_SKIP = (byte)0xCC;
    public static final byte ONEWIRE_CMD_NORMAL_SEARCH = (byte)0xF0;
    public static final byte ONEWIRE_CMD_CONDITIONAL_SEARCH = (byte)0xEC;

    final protected FF32c jiffy;
    final protected Pin devicePin;

    public OneWireDevice(FF32c jiffy, Pin devicePin) throws IOException, JiffyException, ArgumentException {
        this.jiffy = jiffy;
        this.devicePin = devicePin;
        jiffy.set1WirePin(devicePin);
    }

    public OneWireDevice(Pin devicePin) throws IOException, JiffyException, ArgumentException {
        this(FF32Factory.getInstance(), devicePin);
    }
    
    //delegates to FF32c
    public void set1WirePin(int DQPinBlock, int DQPinNumber) 
            throws IOException, JiffyException, ArgumentException {
        jiffy.set1WirePin(DQPinBlock, DQPinNumber);
    }
    public void set1WirePin(Pin DQ) 
            throws IOException, JiffyException, ArgumentException {
        jiffy.set1WirePin(DQ);
    }
    public boolean reset1WireBus() 
            throws IOException, JiffyException {
        return jiffy.reset1WireBus();
    }
    public void write1WireBus(byte[] data) 
            throws IOException, JiffyException {
        jiffy.write1WireBus(data);
    }
    public void writeBit1WireBus(boolean dataBit) 
            throws IOException, JiffyException {
        jiffy.writeBit1WireBus(dataBit);
    }
    public byte[] read1WireBus(int RDDataLen, byte[] WRData) 
            throws IOException, JiffyException, ArgumentException {
        return jiffy.read1WireBus(RDDataLen, WRData);
    }
    public boolean readBit1WireBus() 
            throws IOException, JiffyException {
        return jiffy.readBit1WireBus();
    }
    
    // Perform a 1-Wire reset cycle. Returns 1 if a device responds
    // with a presence pulse.  Returns 0 if there is no device or the
    // bus is shorted or otherwise held low for more than 250uS
    public byte reset() {
        return (byte)0;
    }

    // Issue a 1-Wire rom select command, you do the reset first.
    public void select(byte[] rom) throws IOException, JiffyException {
        byte[] command = new byte[9];
        command[0] = ONEWIRE_CMD_SELECT;
        System.arraycopy(rom, 0, command, 1, rom.length);
        jiffy.write1WireBus(command);
    }

    // Issue a 1-Wire rom skip command, to address all on bus.
    public void skip() throws IOException, JiffyException {
        jiffy.write1WireBus(new byte[]{ONEWIRE_CMD_SKIP});
    }
    
    // Stop forcing power onto the bus. You only need to do this if
    // you used the 'power' flag to write() or used a write_bit() call
    // and aren't about to do another read or write. You would rather
    // not leave this powered if you don't have to, just in case
    // someone shorts your bus.
    public void depower() {
        //TODO
    }
    
    // Clear the search state so that if will start from the beginning again.
    public void reset_search() {
        
    }

    // Setup the search to find the device type 'family_code' on the next call
    // to search(*newAddr) if it is present.
    public void target_search(byte family_code) {
        
    }

    // Look for the next device. Returns 1 if a new address has been
    // returned. A zero might mean that the bus is shorted, there are
    // no devices, or you have already retrieved all of them.  It
    // might be a good idea to check the CRC to make sure you didn't
    // get garbage.  The order is deterministic. You will always get
    // the same devices in the same order.
    public byte[] search(boolean search_mode/* = true*/) {
        byte[] retval = new byte[8];
        return retval;
    }
    
    // Compute a Dallas Semiconductor 8 bit CRC, these are used in the
    // ROM and scratchpad registers.
    public static byte crc8(byte[] addr, byte len) {
        return (byte)0;
    }

    // Compute the 1-Wire CRC16 and compare it against the received CRC.
    public static boolean check_crc16(byte[] input, int len, byte[] inverted_crc, int crc/* = 0*/) {
        return false;
    }

    public static int crc16(byte[] input, int len, int crc/* = 0*/) {
        return 0;
    }

}
