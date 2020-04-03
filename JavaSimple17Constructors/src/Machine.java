//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 17; Constructors

public class Machine {
    private String name;
    private int code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Machine() {
        this("Arnie", 0);

        System.out.println("Constructor running!");
    }

    public Machine(String name) {
        this(name, 0);

        System.out.println("Second constructor running");
        // No longer need following line, since we're using the other
        // constructor above.
        // this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}
