//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 31; Anonymous Classes

public class JavaSimple31AnonymousClasses {
    public static void main(String[] args) {
        // This is equivalent to creating a class that "extends"
        // Machine and overrides the start method.
        Machine machine1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Camera snapping");
            }
        };
        machine1.start();
        // This is equivalent to creating a class that "implements"
        // the Plant interface
        Plant plant1 = new Plant() {
            // @Override not necessary
            @Override
            public void grow() {
                System.out.println("Plant growing");
            }
        };
        plant1.grow();
    }
}
