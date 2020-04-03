//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 43; Recursion: A Useful Trick Up Your Sleeve

public class JavaSimple43RecursionAUsefulTrickUpYourSleeve {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int value) {
        System.out.println(value);
        if (value == 1)
            return 1;
        return factorial(value - 1) * value;
    }
}
