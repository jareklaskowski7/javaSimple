//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 13; Methods

public class Person {
    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain

    // 1. Data
    // 2. Subroutines (methods)

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is: " + name + " and I am " + age
                    + " years old ");
        }
    }

    void sayHello() {
        System.out.println("Hello there!");
    }
}
