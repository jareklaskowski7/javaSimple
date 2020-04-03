//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 17; Constructors

public class JavaSimple17Constructors {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Chalky", 7);
        machine1.setCode(7);
        machine1.setName("One");
        machine2.setCode(8);
        machine2.setName("Two");
        machine3.setCode(9);
        machine3.setName("Three");
        System.out.println(machine1.getCode());
        System.out.println(machine1.getName());
        System.out.println(machine2.getCode());
        System.out.println(machine2.getName());
        System.out.println(machine3.getCode());
        System.out.println(machine3.getName());
    }
}
