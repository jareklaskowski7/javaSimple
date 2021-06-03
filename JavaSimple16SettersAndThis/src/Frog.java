//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 16; Setters And "this"

public class Frog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}
