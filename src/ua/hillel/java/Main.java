package ua.hillel.java;

public class Main {

    public static void main(String[] args) {
        Mobile myNokia = new Mobile("Nokia", "3310", 2);
        Mobile myAnotherNokia = new Mobile("Nokia", "3210", 1);
        myAnotherNokia.powerOff();
        myNokia.call();
        myAnotherNokia.call();

        DialPhone homePhone = new DialPhone("Panasonic", "KX", true);
        DialPhone anotherHomePhone = new DialPhone("Panasonic", "AX", false);
        homePhone.call();
        homePhone.autoAnswer();
        anotherHomePhone.autoAnswer();

        SmartPhone myRedmi = new SmartPhone("Redmi", "11", 2, "android");
        myRedmi.powerOff();
        myRedmi.runApp();
        myRedmi.call();
        String myStr = "Hello!";
        String createdEmail = myRedmi.createMail(myStr);
        String editedEmail = myRedmi.editEmail("Hello, friend!");
        myRedmi.sendMail(createdEmail);
        myRedmi.sendMail(editedEmail);

        Cooker myCooker = new Cooker("Rotex", "RMC");
        myCooker.switchProgram(5);
        myCooker.cook();
        myCooker.powerOff();

        Oven myOven = new Oven("Tefal", "OF");
        myOven.initTimer(100);
        myOven.cook();
        myOven.powerOff();

        Post myPost = new Post();
        String myLetter = myPost.createMail("Hello, there!");
        myPost.sendMail(myLetter);

        turnOffDevice(myNokia, myAnotherNokia, homePhone, anotherHomePhone, myRedmi, myCooker, myOven);

        sendAllEmails(myPost, myRedmi);

    }

    private static void turnOffDevice(AbstractDevice... myDevices) {
        for (int i = 0; i < myDevices.length; i++) {
            myDevices[i].powerOff();
        }
    }

    private static void sendAllEmails(MailSender... myDevices) {
        for (int i = 0; i < myDevices.length; i++) {
            myDevices[i].sendMail("Test email sent from sendAllEmails method");
        }
    }
}
