//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 14; Getters And Return Values

public class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name);
    }

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}
