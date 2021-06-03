//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 52; Using Custom Objects In Sets And As Keys In Maps

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class JavaSimple52UsingCustomObjectsInSetsAndAsKeysInMaps {
    public static void main(String[] args) {
        /*
         * //Map<String, Integer> map = new HashMap<String, Integer>();
         * Map<String, Integer> map = new LinkedHashMap<String, Integer>();
         * map.put("one", 1); map.put("two", 2); map.put("three", 3);
         * map.put("one", 1); // Iterate through map's elements for (String key:
         * map.keySet()) { System.out.println(key + ": " + map.get(key)); }
         *
         * Set<String> set = new LinkedHashSet<String>(); set.add("dog");
         * set.add("cat"); set.add("mouse"); set.add("cat");
         * System.out.println(set);
         */

        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(1, "Sue");

        Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);
        // Iterate through map's elements
        for (Person key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        Set<Person> set = new LinkedHashSet<Person>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
    }
}
