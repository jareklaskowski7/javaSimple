//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 13; Methods

public class JavaSimple13Methods {
    public static void main(String[] args) {
        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.speak();
        person1.sayHello();

        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        person1.sayHello();

        System.out.println(person1.name);
    }
}
