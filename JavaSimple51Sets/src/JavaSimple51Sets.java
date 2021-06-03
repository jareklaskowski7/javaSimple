//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 51; Sets

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSimple51Sets {
    public static void main(String[] args) {
        // Set - Unique elements

        // HashSet does not retain order
        // Set<String> set1 = new HashSet<String>();

        // LinkedHashSet remembers the order you added items in
        // Set<String> set1 = new LinkedHashSet<String>();

        // TreeSet sorts in natural order
        Set<String> set1 = new TreeSet<String>();

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        if (set1.isEmpty()) {
            System.out.println("Set is empty after adding (no!)");
        }

        // Adding duplicate items does nothing.
        set1.add("mouse");

        System.out.println(set1);

        // /////// Iteration /////////
        for (String element : set1) {
            System.out.println(element);
        }

        // /////// Does set contains a given item? /////////
        if (set1.contains("aardvark")) {
            System.out.println("Contains aardvark");
        }
        if (set1.contains("cat")) {
            System.out.println("Contains cat");
        }

        // / set2 contains some common elements with set1, and some new

        Set<String> set2 = new TreeSet<String>();

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");

        // ////////Intersection //////////////
        // Make a copy of set1
        Set<String> intersection = new HashSet<String>(set1);
        System.out.println(intersection);
        // Find out common elements of set1 and set2
        intersection.retainAll(set2);
        System.out.println(intersection);

        // //////// Difference //////////////

        // Make a copy of set1
        Set<String> difference = new HashSet<String>(set1);
        System.out.println(difference);
        // Find out elements in set1, which are not in set2
        difference.removeAll(set2);
        System.out.println(difference);

        // Make a copy of set2
        Set<String> difference2 = new HashSet<String>(set2);
        System.out.println(difference2);
        // Find out elements in set2, which are not in set1
        difference2.removeAll(set1);
        System.out.println(difference2);
    }
}
