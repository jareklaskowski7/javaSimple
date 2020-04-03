//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 05; If

public class JavaSimple05If {
    public static void main(String[] args) {
        int loop = 0;
        while (true) {
            System.out.println("Looping: " + loop);
            if (loop == 5) {
                break;
            }
            loop++;
            System.out.println("Running");
        }
    }
}
