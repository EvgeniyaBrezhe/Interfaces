package ua.hillel.java;

public class Oven extends Multicooker {

    private String oven = super.name + " " + super.serialNumber;

    public Oven(String name, String serialNumber) {
        super(name, serialNumber);
    }

    void initTimer(int time) {
        System.out.println("-------------");
        System.out.println("Setting a timer for " + time + " minutes for " + oven);

    }

    void cook() {
        System.out.println("-------------");
        System.out.println(oven + " is cooking a perfect meal for you!");
    }
}
