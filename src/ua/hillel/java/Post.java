package ua.hillel.java;

public class Post implements MailSender {

    @Override
    public String createMail(String string) {
        System.out.println("-------------");
        System.out.println("Email is created in Post office: " + string);
        return string;
    }

    @Override
    public String sendMail(String string) {
        System.out.println("-------------");
        System.out.println("Email \"" + string + "\" has been sent from the post office.");
        return string;
    }
}
