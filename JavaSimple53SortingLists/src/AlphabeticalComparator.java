//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 53; Sorting Lists

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
