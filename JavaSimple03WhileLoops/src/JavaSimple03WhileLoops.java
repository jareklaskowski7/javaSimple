//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 03; While Loops

public class JavaSimple03WhileLoops {
    public static void main(String[] args) {
        int value = 0;
        while (value < 10) {
            System.out.println("Hello " + value);
            value++;
            //value = value + 1;
            //value += 1;
            if (value == 7) {
                System.out.println("seven");
            }
        }
    }
}
