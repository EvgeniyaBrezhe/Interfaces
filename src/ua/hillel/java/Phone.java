package ua.hillel.java;

public abstract class Phone extends AbstractDevice {

    public Phone(String name, String serialNumber) {
        super(name, serialNumber);
    }

    abstract void call();
}

