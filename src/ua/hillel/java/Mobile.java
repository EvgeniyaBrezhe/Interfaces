package ua.hillel.java;

public class Mobile extends Phone {

    private int simCount;
    protected boolean isDisplayOn;
    protected String phone = super.name + " " + super.serialNumber;

    public Mobile(String name, String serialNumber, int simCount) {
        super(name, serialNumber);
        this.simCount = simCount;
    }

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public boolean isDisplayOn() {
        return isDisplayOn;
    }

    public void setDisplayOn(boolean displayOn) {
        isDisplayOn = displayOn;
    }

    void powerOn() {
        System.out.println("-------------");
        String phone = super.name + " " + super.serialNumber;
        System.out.println("Taking " + phone + ". Pressing on Power Button...");
        System.out.println(phone + " is turning on and setting up for work...");
        System.out.println(phone + " is ready for work!");
        this.isDisplayOn = true;
    }

    void powerOff() {
        System.out.println("-------------");
        System.out.println("Taking " + phone + ". Pressing on Power button");
        System.out.println(phone + " is turned off.");
        this.isDisplayOn = false;
    }

    void call() {
        System.out.println("-------------");
        if (!this.isDisplayOn) {
            System.out.println("Can not make a call, because " + phone + " is turned off. Let me turn it on firstly.");
            this.powerOn();
        }
        System.out.println("Taking " + phone + ". Going to Contacts...");
        System.out.println("Choosing the Contact who the User wants to call...");
        System.out.println("Dial in a Contact number and press Call...");
        if (this.simCount > 1) {
            System.out.println("Choosing a SIM card for call...");
        }
        System.out.println("Calling!");
    }
}
