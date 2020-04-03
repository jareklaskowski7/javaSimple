//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 50; Sorted Maps

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaSimple50SortedMaps {
    public static void main(String[] args) {
        // HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // LinkedHashMap<Integer, String> linkedhashMap = new
        // LinkedHashMap<Integer, String>();
        // TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println(new Temp());
        System.out.println("Hash Map: (order not guaranteed)");
        testMap(hashMap);
        System.out
                .println("\nLinked Hash Map: (order in the way it was entered)");
        testMap(linkedHashMap);
        System.out.println("\nTree Map: (natural order)");
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);

        }
    }
}
