package org.warheim.interfacing.jiffy32.hl;

import org.warheim.interfacing.jiffy32.bitmap.Bitmap;
import org.warheim.interfacing.jiffy32.bitmap.SimpleFont;
import org.warheim.interfacing.jiffy32.bitmap.Font5x8;
import org.warheim.interfacing.jiffy32.bitmap.fonts.Font;
import java.io.IOException;
import org.warheim.interfacing.jiffy32.Constants;
import org.warheim.interfacing.jiffy32.FF32c;
import org.warheim.interfacing.jiffy32.Pin;
import org.warheim.interfacing.jiffy32.exceptions.ArgumentException;
import org.warheim.interfacing.jiffy32.exceptions.JiffyException;

/**
 * based on Guy Carpenter's py-gaugette and Adafruit_SSD1306 library
 * 
 * @author andy
 */
public class I2C_SSD1306 extends I2CDevice {

    public static final int MAX_FF32_MSG          = 60;     // Max nr of bytes allowed to send to FF32 (I2C address excluded) in one message

    public static final int COMMAND_MODE          = 0x00;   // Continuation=0, Command/Data=0
    public static final int DATA_MODE             = 0x40;   // Continuation=0, Command/Data=1

    public static final int EXTERNAL_VCC          = 0x1;    // Vcc is supplied (7..12V) externally - check your specific board
    public static final int SWITCH_CAP_VCC        = 0x2;    // Vcc is generated from Vbat by charge pump (Vbat might be connected to Vdd)

    public static final int SET_LOW_COLUMN        = 0x00;
    public static final int SET_HIGH_COLUMN       = 0x10;
    public static final int SET_MEMORY_MODE       = 0x20;
    public static final int SET_COL_ADDRESS       = 0x21;
    public static final int SET_PAGE_ADDRESS      = 0x22;
    public static final int RIGHT_HORIZ_SCROLL    = 0x26;
    public static final int LEFT_HORIZ_SCROLL     = 0x27;
    public static final int VERT_AND_RIGHT_HORIZ_SCROLL = 0x29;
    public static final int VERT_AND_LEFT_HORIZ_SCROLL  = 0x2A;
    public static final int DEACTIVATE_SCROLL     = 0x2E;
    public static final int ACTIVATE_SCROLL       = 0x2F;
    public static final int SET_START_LINE        = 0x40;
    public static final int SET_CONTRAST          = 0x81;
    public static final int CHARGE_PUMP           = 0x8D;
    public static final int SEG_REMAP             = 0xA0;
    public static final int SET_VERT_SCROLL_AREA  = 0xA3;
    public static final int DISPLAY_ALL_ON_RESUME = 0xA4;
    public static final int DISPLAY_ALL_ON        = 0xA5;
    public static final int NORMAL_DISPLAY        = 0xA6;
    public static final int INVERT_DISPLAY        = 0xA7;
    public static final int DISPLAY_OFF           = 0xAE;
    public static final int DISPLAY_ON            = 0xAF;
    public static final int COM_SCAN_INC          = 0xC0;
    public static final int COM_SCAN_DEC          = 0xC8;
    public static final int SET_DISPLAY_OFFSET    = 0xD3;
    public static final int SET_COM_PINS          = 0xDA;
    public static final int SET_VCOM_DETECT       = 0xDB;
    public static final int SET_DISPLAY_CLOCK_DIV = 0xD5;
    public static final int SET_PRECHARGE         = 0xD9;
    public static final int SET_MULTIPLEX         = 0xA8;

    public static final int MEMORY_MODE_HORIZ     = 0x00;
    public static final int MEMORY_MODE_VERT      = 0x01;
    public static final int MEMORY_MODE_PAGE      = 0x02;
    
    private final int bufferRows;
    private final int bufferCols;
    private final int rows;
    private final int cols;
    private final int colOffset;
    private boolean flipped;
    private final Bitmap bitmap;

    public Bitmap getBitmap() {
        return bitmap;
    }
    private SimpleFont font;

    public I2C_SSD1306(FF32c jiffy, int slaveAddr, Pin sclPin, Pin sdaPin, int bufferRows, int bufferCols, int rows, int cols) throws IOException, JiffyException, ArgumentException {
        super(jiffy, sclPin, sdaPin, slaveAddr);
        this.cols = cols;
        this.rows = rows;
        this.bufferCols = bufferCols;
        this.bufferRows = bufferRows;
        this.font = new Font5x8();
        this.colOffset = 0;
        this.bitmap = new Bitmap(bufferCols, bufferRows);
        this.flipped = false;
    }
    
    public I2C_SSD1306(int slaveAddr, Pin sclPin, Pin sdaPin, int bufferRows, int bufferCols, int rows, int cols) throws IOException, JiffyException, ArgumentException {
        super(sclPin, sdaPin, slaveAddr);
        this.cols = cols;
        this.rows = rows;
        this.bufferCols = bufferCols;
        this.bufferRows = bufferRows;
        this.font = new Font5x8();
        this.colOffset = 0;
        this.bitmap = new Bitmap(bufferCols, bufferRows);
        this.flipped = false;
    }
    
    public void command(int... commandbytes) throws IOException, JiffyException, ArgumentException {
        // Every command byte and following parameter(s) has to be preceded by
        // the COMMAND_MODE byte to mark it as command.
        // Command mode: first byte to send = COMMAND_MODE (Co=0 D/C#=1)
        for (int b: commandbytes) {
            byte[] senddata = new byte[2];
            senddata[0] = COMMAND_MODE;
            senddata[1] = (byte)b;
            writeBlockI2C(senddata);
        }
    }
/*    
    public void command(int commandbytes) throws IOException, JiffyException, ArgumentException {
        // Every command byte and following parameter(s) has to be preceded by
        // the COMMAND_MODE byte to mark it as command.
        // Command mode: first byte to send = COMMAND_MODE (Co=0 D/C#=1)
        byte[] senddata = new byte[2];
        senddata[0] = COMMAND_MODE;
        senddata[1] = (byte)commandbytes;
        jiffy.writeBlockI2C(slave_addr, senddata);
    }
*/
    public void data(byte[] databytes) throws IOException, JiffyException, ArgumentException {
        // Data mode: first byte to send = DATA_MODE (Co=0 D/C#=1)
        // Databytes follow after that. The datapointer is maintained by I2C_SSD1306
        // FF32 can only send 60byte chuncks of data at a time
        // So send chunk if senddata array reaches max chunk size
        byte[] senddata=null;
        int j=1;
        for (int i=0; i<databytes.length;++i) {
            if (senddata==null) {
                j=1;
                if (databytes.length-i>Constants.MAX_BUS_DATA_BUFFER_LENGTH-2) {
                    senddata = new byte[Constants.MAX_BUS_DATA_BUFFER_LENGTH-1];
                } else {
                    senddata = new byte[databytes.length-i+1];
                }
                senddata[0] = DATA_MODE;
            }
            senddata[j++] = databytes[i];
            if (j>=Constants.MAX_BUS_DATA_BUFFER_LENGTH-1) {
                writeBlockI2C(senddata);
                //j=0;
                // re-init senddata for next chunk
                senddata=null;
            }
        }
        // send remainder (at least if senddata contains more than DATA_MODE byte)
        if (senddata!=null&&senddata.length > 1) {
            writeBlockI2C(senddata);
        }
    }
    
    public void begin(int vcc_state) throws InterruptedException, IOException, JiffyException, ArgumentException { // = SWITCH_CAP_VCC
        Thread.sleep(1); // 1ms
        command(DISPLAY_OFF);
        command(SET_DISPLAY_CLOCK_DIV, 0x80);

        // support for 128x32 and 128x64 line models
        if (rows == 64) {
            command(SET_MULTIPLEX, 0x3F);
            command(SET_COM_PINS, 0x12);
        } else {
            command(SET_MULTIPLEX, 0x1F);
            command(SET_COM_PINS, 0x02);
        }
            
        command(SET_DISPLAY_OFFSET, 0x00);
        command(SET_START_LINE | 0x00);
        // support for internally supplied Vcc (Charge pump) or 
        // external supplied Vcc
        if (vcc_state == EXTERNAL_VCC) {
            command(CHARGE_PUMP, 0x10);
        } else {
            command(CHARGE_PUMP, 0x14);
        }
        command(SET_MEMORY_MODE, 0x00);
        command(SEG_REMAP | 0x01);
        command(COM_SCAN_DEC);
        command(SET_CONTRAST, 0xbf);
        if (vcc_state == EXTERNAL_VCC) {
            command(SET_PRECHARGE, 0x22);
        } else {
            command(SET_PRECHARGE, 0xF1);
        }
        command(SET_VCOM_DETECT, 0x40);
        command(DISPLAY_ALL_ON_RESUME);
        command(NORMAL_DISPLAY);
        command(DISPLAY_ON);
    }

//    public void select() {
//        // reconfigure I2C bus on FF32 chip after talking to other I2C device
//        jiffy
//            ff32.setI2CPins(self.scl_pin, self.sda_pin)
//    }
   
    public void clearDisplay() throws InterruptedException, IOException, JiffyException, ArgumentException {
        bitmap.clear();
    }

    public void invertDisplay() throws InterruptedException, IOException, JiffyException, ArgumentException {
        command(INVERT_DISPLAY);
    }

    public void flipDisplay(boolean flipped/*=True*/) throws InterruptedException, IOException, JiffyException, ArgumentException {
        this.flipped = flipped;
        if (flipped) {
            command(COM_SCAN_INC);
            command(SEG_REMAP | 0x00);
        } else {
            command(COM_SCAN_DEC);
            command(SET_COM_PINS, 0x02);
        }
    }

    public void normalDisplay() throws InterruptedException, IOException, JiffyException, ArgumentException {
        command(NORMAL_DISPLAY);
    }

    public void setContrast(int contrast/*=0x8f*/) throws InterruptedException, IOException, JiffyException, ArgumentException {
        command(SET_CONTRAST, contrast);
    }

    public void display() throws InterruptedException, IOException, JiffyException, ArgumentException {
        displayBlock(bitmap, 0, 0, cols, colOffset);
    }

    public void displayCols(int start_col, int count) throws InterruptedException, IOException, JiffyException, ArgumentException {
        displayBlock(bitmap, 0, start_col, count, colOffset);
    }
    /**
     * Transfers data from the passed bitmap (instance of Bitmap class)
     * starting at row <row> col <col>.
     * Both row and bitmap.rows will be divided by 8 to get page addresses,
     * so both must divide evenly by 8 to avoid surprises.
     * 
     * @param bitmap:     instance of Bitmap
     * @param row:        Starting row to write to - must be multiple of 8
     * @param col:        Starting col to write to.
     * @param colCount:  Number of cols to write.
     * @param colOffset: column offset in buffer to write from
     */
      
    public void displayBlock(Bitmap bitmap, int row, int col, int colCount, int colOffset/*=0*/) throws IOException, JiffyException, ArgumentException {
        int pageCount = bitmap.getRows() >> 3;
        int pageStart = row >> 3;
        int pageEnd   = pageStart + pageCount - 1;
        int colStart  = col;
        int colEnd    = col + colCount - 1;
        command(SET_MEMORY_MODE, MEMORY_MODE_VERT);
        command(SET_PAGE_ADDRESS, pageStart, pageEnd);
        command(SET_COL_ADDRESS, colStart, colEnd);
        int start = colOffset * pageCount;
        int length = colCount * pageCount;
        byte[] bitmapPortion = new byte[length];
        bitmap.copyPortion(bitmapPortion, start);
        data(bitmapPortion);
    }
    
    public void drawPixel(int x, int y, boolean on /*True*/) {
        bitmap.drawPixel(x,y,on);
    }
        
    public void drawPixel(int x, int y, int on /*True*/) {
        bitmap.drawPixel(x,y,(on==1));
    }

    //draws text using simple font
    public void drawText(int x, int y, String string) {
        byte[] fontBytes = font.getBytes();
        int fontRows = font.getRows();
        int fontCols = font.getCols();
        for (int i=0; i<string.length(); ++i) {
            char c = string.charAt(i);
            int p = c * fontCols;
            for (int col=0; col<fontCols; ++col) {
                byte mask = fontBytes[p];
                p+=1;
                for (int row=0; row<fontRows; ++row) {
                    drawPixel(x,y+row,mask & 0x1);
                    mask >>= 1;
                }
                x += 1;
            }
        }
    }

    public void drawText(int x, int y, String string, int size/*=2*/, int space/*=1*/) {
        byte[] fontBytes = font.getBytes();
        int fontRows = font.getRows();
        int fontCols = font.getCols();
        for (int i=0; i<string.length(); ++i) {
            char c = string.charAt(i);
            int p = c * fontCols;
            for (int col=0; col<fontCols; ++col) {
                byte mask = fontBytes[p];
                p+=1;
                int py = y;
                for (int row=0; row<fontRows; ++row) {
                    for (int sy=0;sy<size;++sy) {
                        int px = x;
                        for (int sx=0;sx<size; ++sx) {
                            drawPixel(px,py,mask & 0x1);
                            px += 1;
                        }
                        py += 1;
                    }
                    mask >>= 1;
                }
                x += size;
            }
            x += space;
        }
    }

    public void clearBlock(int x0, int y0, int dx, int dy) {
        bitmap.clearBlock(x0,y0,dx,dy);
    }
    
    public void drawText(int x, int y, String string, Font font) {
        bitmap.drawText(x,y,string,font);
    }

    public void textWidth(String string, Font font) {
        bitmap.textWidth(string, font);
    }

    public int getBufferRows() {
        return bufferRows;
    }

    public int getBufferCols() {
        return bufferCols;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public SimpleFont getFont() {
        return font;
    }

    public void setFont(SimpleFont font) {
        this.font = font;
    }
    
}
