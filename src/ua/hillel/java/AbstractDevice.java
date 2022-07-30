package ua.hillel.java;

public abstract class AbstractDevice {
    protected String name;
    protected String serialNumber;

    public AbstractDevice(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.powerOn();
    }

    abstract void powerOn();

    abstract void powerOff();
}
