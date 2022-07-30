package ua.hillel.java;

public interface MailSender {

    default String createMail(String string) {
        System.out.println("Default option of creating emails:");
        return "Email created: " + string;
    }

    default String sendMail(String string) {
        System.out.println("Default option of sending emails:");
        return "Email sent: " + string;

    }
}
