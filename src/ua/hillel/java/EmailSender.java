package ua.hillel.java;

public interface EmailSender extends MailSender {

    default String editEmail(String string) {
        System.out.println("Default option of editing emails:");
        return "Email has been edited to: " + string;
    }
}
