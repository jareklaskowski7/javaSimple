//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 38; Try With Resources 1

public class Temp implements AutoCloseable {
    public void close() throws Exception {
        System.out.println("Closing");
        throw new Exception("oh no");
    }
}
