//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 18; Static And Final

public class Thing {
    public final static int LUCKY_NUMBER = 7;
    public String name;
    public static String description;
    public static int count = 0;
    public int id;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": "
                + name);
        System.out.println(count);
    }

    public static void showInfo() {
        System.out.println(description);
        // Won't work: System.out.println(name);
    }
}
