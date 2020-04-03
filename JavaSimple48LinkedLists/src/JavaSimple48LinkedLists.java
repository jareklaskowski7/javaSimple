//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 48; Linked Lists

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaSimple48LinkedLists {
    public static void main(String[] args) {
        /*
         * ArrayLists manage arrays internally. [0][1][2][3][4][5] ....
         */
        // ArrayList<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();

        /*
         * LinkedLists consists of elements where each element has a reference
         * to the previous and next element [0]->[1]->[2]->[3]->[4]->[5] .... <-
         * <- <- <- <-
         */
        // LinkedList<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }

    private static void doTimings(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        /*
         * // Add items at end of list for (int i = 0; i < 1E5; i++) {
         * list.add(i); }
         */

        // Add items elsewhere in list
        for (int i = 0; i < 1E5; i++) {
            // beginning
            // list.add(0, i);
            // end
            // list.add(list.size(), i);
            // 100-th element from the end of list
            list.add(list.size() - 100, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}
