//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 15; Method Parameters

public class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }

    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " metres in direction "
                + direction);
    }
}
