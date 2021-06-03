//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 08; Switch

import java.util.Scanner;

public class JavaSimple08Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of command:");
        int commandNumber = input.nextInt();
        switch (commandNumber) {
            case 1:
                System.out.println("Machine started");
                break;
            case 2:
                System.out.println("Machine stopped");
                break;
            default:
                System.out.println("Command not recognized");
        }
        input.close();
    }
}
