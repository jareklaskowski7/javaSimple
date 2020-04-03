//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 53; Sorting Lists

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
        return 0;
    }
}
