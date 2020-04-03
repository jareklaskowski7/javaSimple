//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 21; Inheritance

public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }
}
