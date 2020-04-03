//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 42; Enum Types: Basic And Advanced Usage

public enum Animal {
    CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This animal is called: " + name;
    }
}
