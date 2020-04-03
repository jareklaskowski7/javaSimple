//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 20; The toString Method

public class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return String.format("%-4d: %s", id, name);
        /*
         * StringBuilder sb = new StringBuilder();
         * sb.append(id).append(": ").append(name);
         *
         * return sb.toString();
         */
    }
}
