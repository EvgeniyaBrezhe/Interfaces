package ua.hillel.java;

public abstract class Multicooker extends AbstractDevice {

    private String cooker = super.name + " " + super.serialNumber;

    public Multicooker(String name, String serialNumber) {
        super(name, serialNumber);
    }

    void powerOn() {
        String cooker = super.name + " " + super.serialNumber;
        System.out.println("-------------");
        System.out.println("Taking " + cooker + ". Checking that plug is in the socket.. " +
                "if not, don't worry. I will ask somebody to plug it in.");
        System.out.println("Pressing on \"ON\" button");
        System.out.println(cooker + " is turned on!");
    }

    void powerOff() {
        System.out.println("-------------");
        System.out.println("Taking " + cooker + ". Pressing on \"OFF\" button");
        System.out.println(cooker + " is turned off");

    }

    abstract void cook();
}
