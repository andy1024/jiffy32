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
 * 
 * based on Paul Stoffregen OneWire class
 * https://github.com/PaulStoffregen/OneWire/
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
    
    protected boolean lastDeviceFlag = false;
    protected byte lastDiscrepancy = 0;
    protected byte lastFamilyDiscrepancy = 0;
    protected byte[] ROM_NO = new byte[8];
    
    protected static final byte dscrcTable[] = {
      (byte)0,(byte) 94,(byte)188,(byte)226,(byte) 97,(byte) 63,(byte)221,(byte)131,(byte)194,(byte)156,(byte)126,(byte) 32,(byte)163,(byte)253,(byte) 31,(byte) 65,
    (byte)157,(byte)195,(byte) 33,(byte)127,(byte)252,(byte)162,(byte) 64,(byte) 30,(byte) 95,(byte)  1,(byte)227,(byte)189,(byte) 62,(byte) 96,(byte)130,(byte)220,
     (byte)35,(byte)125,(byte)159,(byte)193,(byte) 66,(byte) 28,(byte)254,(byte)160,(byte)225,(byte)191,(byte) 93,(byte)  3,(byte)128,(byte)222,(byte) 60,(byte) 98,
    (byte)190,(byte)224,(byte)  2,(byte) 92,(byte)223,(byte)129,(byte) 99,(byte) 61,(byte)124,(byte) 34,(byte)192,(byte)158,(byte) 29,(byte) 67,(byte)161,(byte)255,
     (byte)70,(byte) 24,(byte)250,(byte)164,(byte) 39,(byte)121,(byte)155,(byte)197,(byte)132,(byte)218,(byte) 56,(byte)102,(byte)229,(byte)187,(byte) 89,(byte)  7,
    (byte)219,(byte)133,(byte)103,(byte) 57,(byte)186,(byte)228,(byte)  6,(byte) 88,(byte) 25,(byte) 71,(byte)165,(byte)251,(byte)120,(byte) 38,(byte)196,(byte)154,
    (byte)101,(byte) 59,(byte)217,(byte)135,(byte)  4,(byte) 90,(byte)184,(byte)230,(byte)167,(byte)249,(byte) 27,(byte) 69,(byte)198,(byte)152,(byte)122,(byte) 36,
    (byte)248,(byte)166,(byte) 68,(byte) 26,(byte)153,(byte)199,(byte) 37,(byte)123,(byte) 58,(byte)100,(byte)134,(byte)216,(byte) 91,(byte)  5,(byte)231,(byte)185,
    (byte)140,(byte)210,(byte) 48,(byte)110,(byte)237,(byte)179,(byte) 81,(byte) 15,(byte) 78,(byte) 16,(byte)242,(byte)172,(byte) 47,(byte)113,(byte)147,(byte)205,
     (byte)17,(byte) 79,(byte)173,(byte)243,(byte)112,(byte) 46,(byte)204,(byte)146,(byte)211,(byte)141,(byte)111,(byte) 49,(byte)178,(byte)236,(byte) 14,(byte) 80,
    (byte)175,(byte)241,(byte) 19,(byte) 77,(byte)206,(byte)144,(byte)114,(byte) 44,(byte)109,(byte) 51,(byte)209,(byte)143,(byte) 12,(byte) 82,(byte)176,(byte)238,
     (byte)50,(byte)108,(byte)142,(byte)208,(byte) 83,(byte) 13,(byte)239,(byte)177,(byte)240,(byte)174,(byte) 76,(byte) 18,(byte)145,(byte)207,(byte) 45,(byte)115,
    (byte)202,(byte)148,(byte)118,(byte) 40,(byte)171,(byte)245,(byte) 23,(byte) 73,(byte)  8,(byte) 86,(byte)180,(byte)234,(byte)105,(byte) 55,(byte)213,(byte)139,
     (byte)87,(byte)  9,(byte)235,(byte)181,(byte) 54,(byte)104,(byte)138,(byte)212,(byte)149,(byte)203,(byte) 41,(byte)119,(byte)244,(byte)170,(byte) 72,(byte) 22,
    (byte)233,(byte)183,(byte) 85,(byte) 11,(byte)136,(byte)214,(byte) 52,(byte)106,(byte) 43,(byte)117,(byte)151,(byte)201,(byte) 74,(byte) 20,(byte)246,(byte)168,
    (byte)116,(byte) 42,(byte)200,(byte)150,(byte) 21,(byte) 75,(byte)169,(byte)247,(byte)182,(byte)232,(byte) 10,(byte) 84,(byte)215,(byte)137,(byte)107,(byte) 53
    };

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
    public boolean reset() {
        return false;
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
        jiffy.write1WireBus(ONEWIRE_CMD_SKIP);
    }
    
    // Stop forcing power onto the bus. You only need to do this if
    // you used the 'power' flag to write() or used a write_bit() call
    // and aren't about to do another read or write. You would rather
    // not leave this powered if you don't have to, just in case
    // someone shorts your bus.
    public void depower() {
        throw new RuntimeException("To be implemented");
    }
    
    // Clear the search state so that if will start from the beginning again.
    public void resetSearch() {
        // reset the search state
        lastDiscrepancy = 0;
        lastDeviceFlag = false;
        lastFamilyDiscrepancy = 0;
        for(int i = 0; i<ROM_NO.length; i++) {
            ROM_NO[i] = 0;
        }
    }

    // Setup the search to find the device type 'family_code' on the next call
    // to search(*newAddr) if it is present.
    public void targetSearch(byte family_code) {
        // set the search state to find SearchFamily type devices
        ROM_NO[0] = family_code;
        for (int i = 1; i < 8; i++) {
           ROM_NO[i] = 0;
        }
        lastDiscrepancy = 64;
        lastFamilyDiscrepancy = 0;
        lastDeviceFlag = false;
    }

    // Look for the next device. Returns 1 if a new address has been
    // returned. A zero might mean that the bus is shorted, there are
    // no devices, or you have already retrieved all of them.  It
    // might be a good idea to check the CRC to make sure you didn't
    // get garbage.  The order is deterministic. You will always get
    // the same devices in the same order.
    public byte[] search(boolean searchMode/* = true*/) throws IOException, JiffyException {
        byte[] retval = new byte[8];
        byte idBitNumber;
        byte lastZero, romByteNumber;
        boolean idBit, cmpIdBit;
        boolean searchResult;

        byte romByteMask;
        boolean searchDirection;

        // initialize for search
        idBitNumber = 1;
        lastZero = 0;
        romByteNumber = 0;
        romByteMask = 1;
        searchResult = false;

        // if the last call was not the last one
        if (!lastDeviceFlag) {
           // 1-Wire reset
           if (!reset()) {
              // reset the search
              lastDiscrepancy = 0;
              lastDeviceFlag = false;
              lastFamilyDiscrepancy = 0;
              return null;
           }

           // issue the search command
           if (searchMode == true) {
             jiffy.write1WireBus(ONEWIRE_CMD_NORMAL_SEARCH);
           } else {
             jiffy.write1WireBus(ONEWIRE_CMD_CONDITIONAL_SEARCH);
           }

           // loop to do the search
           do {
              // read a bit and its complement
              idBit = jiffy.readBit1WireBus();
              cmpIdBit = jiffy.readBit1WireBus();

              // check for no devices on 1-wire
              if ((idBit) && (cmpIdBit)) {
                 break;
              } else {
                 // all devices coupled have 0 or 1
                 if (idBit != cmpIdBit) {
                    searchDirection = idBit;  // bit write value for search
                 } else {
                    // if this discrepancy if before the Last Discrepancy
                    // on a previous next then pick the same as last time
                    if (idBitNumber < lastDiscrepancy) {
                       searchDirection = ((ROM_NO[romByteNumber] & romByteMask) > 0);
                    } else {
                       // if equal to last pick 1, if not then pick 0
                       searchDirection = (idBitNumber == lastDiscrepancy);
                    }

                    // if 0 was picked then record its position in LastZero
                    if (!searchDirection) {
                       lastZero = idBitNumber;

                       // check for Last discrepancy in family
                       if (lastZero < 9)
                          lastFamilyDiscrepancy = lastZero;
                    }
                 }

                 // set or clear the bit in the ROM byte rom_byte_number
                 // with mask rom_byte_mask
                 if (searchDirection) {
                   ROM_NO[romByteNumber] |= romByteMask;
                 } else {
                   ROM_NO[romByteNumber] &= ~romByteMask;
                 }
                 
                 // serial number search direction write bit
                 jiffy.writeBit1WireBus(searchDirection);

                 // increment the byte counter id_bit_number
                 // and shift the mask rom_byte_mask
                 idBitNumber++;
                 romByteMask <<= 1;

                 // if the mask is 0 then go to new SerialNum byte rom_byte_number and reset mask
                 if (romByteMask == 0) {
                     romByteNumber++;
                     romByteMask = 1;
                 }
              }
           } while(romByteNumber < 8);  // loop until through all ROM bytes 0-7

           // if the search was successful then
           if (!(idBitNumber < 65)) {
              // search successful so set LastDiscrepancy,LastDeviceFlag,search_result
              lastDiscrepancy = lastZero;

              // check for last device
              if (lastDiscrepancy == 0) {
                 lastDeviceFlag = true;
              }

              searchResult = true;
           }
        }

        // if no device found then reset counters so next 'search' will be like a first
        if (!searchResult || ROM_NO[0]==0) {
           lastDiscrepancy = 0;
           lastDeviceFlag = false;
           lastFamilyDiscrepancy = 0;
           searchResult = false;
        } else {
            System.arraycopy(ROM_NO, 0, retval, 0, 8);
        }
        if (!searchResult) {
            return null;
        } else {
            return retval;
        }
    }
    
    // Compute a Dallas Semiconductor 8 bit CRC, these are used in the
    // ROM and scratchpad registers.
    public static byte crc8(byte[] addr, int len) {
	byte crc = 0;

        for (int i=len-1;i>0;--i) {
            crc = dscrcTable[crc ^ addr[i]];
	}
	return crc;
    }

    // Compute the 1-Wire CRC16 and compare it against the received CRC.
    public static boolean checkCrc16(byte[] input, int len, byte[] inverted_crc, int crc/* = 0*/) {
        throw new RuntimeException("To be implemented");
    }

    public static int crc16(byte[] input, int len, int crc/* = 0*/) {
        throw new RuntimeException("To be implemented");
    }

}
