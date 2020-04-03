//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 49; HashMap: Retrieving Objects via a Key

import java.util.HashMap;
import java.util.Map;

public class JavaSimple49HashMapRetrievingObjectsViaAKey {
    public static void main(String[] args) {
        // Key and Value PAIRS
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");

        String text = map.get(4);
        System.out.println(text);

        // If you try to get element, which does not exist in map
        String text2 = map.get(1);
        System.out.println(text2);

        // If you try to add an Object, which has same key as an
        // existing Object (second value overrides first value)
        String text3 = map.get(6);
        System.out.println(text3);
        map.put(6, "Hello");
        String text4 = map.get(6);
        System.out.println(text4);

        // Iterate over map using for each loop
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
