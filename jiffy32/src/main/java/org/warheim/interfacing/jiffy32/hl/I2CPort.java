package org.warheim.interfacing.jiffy32.hl;

/**
 *
 * @author andy
 */
public class I2CPort {
    private int portNumber;
    private String portName;

    public I2CPort(int portNumber, String portName) {
        this.portNumber = portNumber;
        this.portName = portName;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }
    
    
}
