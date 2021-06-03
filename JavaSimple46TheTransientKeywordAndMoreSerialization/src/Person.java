//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 46; The Transient Keyword And More Serialization

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 4965974660314472776L;
    private transient int id;
    private String name;
    private static int count;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Two-argument constructor");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public String toString() {
        return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
    }
}
