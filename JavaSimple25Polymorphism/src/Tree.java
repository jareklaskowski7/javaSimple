//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 25; Polymorphism

public class Tree extends Plant {
    @Override
    public void grow() {
        System.out.println("Tree growing");
    }

    public void shedLeaves() {
        System.out.println("Leaves shedding");
    }
}
