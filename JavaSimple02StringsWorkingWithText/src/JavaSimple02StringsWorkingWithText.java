//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 02; Strings: Working With Text

public class JavaSimple02StringsWorkingWithText {
    public static void main(String[] args) {
        String text = "Hello";
        String blank = " ";
        String name = "Bob";
        // Concatenation
        String greeting = text + blank + name;
        System.out.println(greeting);
        System.out.println("Hello" + " " + "Bob");

        // Addition
        int x = 9;
        int y = 8;
        System.out.println(x + y);

        // Concatenation
        int myInt = 7;
        System.out.println("My integer is: " + myInt);
        double myDouble = 7.8;
        System.out.println("My number is: " + myDouble + ".");
    }
}
