//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 44; Serialization: Saving Objects to Files

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 4965974660314472776L;
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
