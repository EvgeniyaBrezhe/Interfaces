package ua.hillel.java;

public class Cooker extends Multicooker {

    private String cooker = super.name + " " + super.serialNumber;

    public Cooker(String name, String serialNumber) {
        super(name, serialNumber);
    }

    void switchProgram(int number) {
        System.out.println("-------------");
        System.out.println("Program is switched to program #" + number + " for " + cooker);
    }

    void cook() {
        System.out.println("-------------");
        System.out.println(cooker + " is cooking a perfect meal for you!");
    }
}
