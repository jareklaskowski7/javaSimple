//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 29; Using Generics

import java.util.ArrayList;
import java.util.HashMap;

public class JavaSimple29UsingGenerics {
    public static void main(String[] args) {
        // ///////////////// Before Java 5 ////////////////////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");
        String fruit = (String) list.get(1);
        System.out.println(fruit);

        // ///////////// Modern style //////////////////////////////
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");
        String animal = strings.get(1);
        System.out.println(animal);

        // /////////// There can be more than one type argument
        // ////////////////////
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // ////////// Java 7 style /////////////////////////////////
        //ArrayList<Animal> someList = new ArrayList<>();
    }
}
