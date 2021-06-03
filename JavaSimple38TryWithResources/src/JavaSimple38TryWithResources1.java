//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 38; Try With Resources 1

public class JavaSimple38TryWithResources1 {
    public static void main(String[] args) {
        try (Temp temp = new Temp()) {
            //
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
