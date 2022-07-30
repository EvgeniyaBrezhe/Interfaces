package ua.hillel.java;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    private String os;

    public SmartPhone(String name, String serialNumber, int simCount, String os) {
        super(name, serialNumber, simCount);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    void runApp() {
        System.out.println("-------------");
        if (!super.isDisplayOn) {
            System.out.println("Can not run an app, because " + phone + " is turned off. Let me turn it on firstly.");
            this.powerOn();
        }
        String phone = super.name + " " + super.serialNumber;
        System.out.println("Taking " + phone + ". Navigating through different apps...");
        System.out.println("Choosing the app and press on it's icon...");
        System.out.println("The app is launched for " + this.os + "!");
    }

    @Override
    public void call() {
        System.out.println("-------------");
        System.out.println("Taking " + phone + ". Asking voice assistant to call...");
        System.out.println("Calling!");
    }

    @Override
    public String editEmail(String string) {
        System.out.println("-------------");
        System.out.println("Email is edited by " + phone + " to: " + string);
        return string;
    }

    @Override
    public String createMail(String string) {
        System.out.println("-------------");
        System.out.println("Email is created by " + phone + ": " + string);
        return string;
    }

    @Override
    public String sendMail(String string) {
        System.out.println("-------------");
        System.out.println("Email: \"" + string + "\" is sent by " + phone);
        return string;
    }
}
