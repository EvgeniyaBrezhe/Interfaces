package ua.hillel.java;

public class DialPhone extends Phone implements Caller {

    private boolean hasAnswerPhone;
    private String phone = super.name + " " + super.serialNumber;

    public boolean isHasAnswerPhone() {
        return hasAnswerPhone;
    }

    public void setHasAnswerPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DialPhone(String name, String serialNumber, boolean hasAnswerPhone) {
        super(name, serialNumber);
        this.hasAnswerPhone = hasAnswerPhone;
    }

    public void powerOn() {
        System.out.println("-------------");
        String phone = super.name + " " + super.serialNumber;
        System.out.println("Taking " + phone + ". Checking that plug is in the socket.. " +
                "if not, don't worry. I will ask somebody to plug it in.");
        System.out.println(phone + " is plugged in and ready to make and receive calls!");
    }

    public void powerOff() {
        System.out.println("-------------");
        System.out.println("Taking " + phone + ". Pulling the plug off");
        System.out.println(phone + " is turned off");
    }

    @Override
    public void call() {
        System.out.println("-------------");
        System.out.println("Taking " + phone + ". Dialing a number...");
        System.out.println("Calling!");
    }

    public void autoAnswer() {
        System.out.println("-------------");
        System.out.println("Ring, Ring! Somebody is calling to " + phone + "...");
        if (this.hasAnswerPhone) {
            System.out.println(phone + " will be waiting for 10 sec and turn a voice mail.");
            System.out.println("Hello, that's me! I can not puck up a phone at the moment, please, leave the message after the beep.");
            System.out.println("Beep.");
            System.out.println("Recording the message and saving it to phone's memory.");
        } else {
            System.out.println("Unfortunately, there is no voice main on " + phone);
            System.out.println("The call will be missed.");
        }
    }
}
