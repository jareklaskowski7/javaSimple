//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 24; Public, Private, Protected

package world;

public class Field {
    private Plant plant = new Plant();

    public Field() {
        // size is protected; Field is in the same package as Plant.
        System.out.println(plant.size);
    }
}
