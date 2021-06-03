//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 12; Classes And Objects

public class JavaSimple12ClassesAndObjects {
    public static void main(String[] args) {
        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);
    }
}
