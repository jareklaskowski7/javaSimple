//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 23; Interfaces

public class Person implements Info {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello there");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " + name);
    }
}
