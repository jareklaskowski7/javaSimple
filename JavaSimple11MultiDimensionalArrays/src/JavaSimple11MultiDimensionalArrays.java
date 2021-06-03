//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 11; Multi-Dimensional Arrays

public class JavaSimple11MultiDimensionalArrays {
    public static void main(String[] args) {
        // 1D array
        int[] values = {3, 5, 2343};

        // Only need 1 index to access values.
        System.out.println(values[2]);

        // 2D array (grid or table)
        int[][] grid = {{3, 5, 2343}, {2, 4}, {1, 2, 3, 4}};

        // Need 2 indices to access values
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        // int[][] containers = new int[2][];

        // Can also create without initializing.
        String[][] texts = new String[2][3];
        texts[0][1] = "Hello there";
        texts[0][0] = "How";
        texts[0][2] = "are";
        texts[1][0] = "you";
        texts[1][1] = "doing";
        texts[1][2] = "?";
        // texts[0][3] = "Hey";
        // texts[1][2] = "Joe";

        System.out.println(texts[0][1]);

        // How to iterate through 2D arrays.
        // first iterate through rows, then for each row
        // go through the columns.
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

        // The last array index is optional.
        String[][] words = new String[2][];

        // Each sub-array is null.
        System.out.println(words[0]);

        // We can create the subarrays 'manually'.
        words[0] = new String[3];
        words[1] = new String[4];

        // Can set a values in the sub-array we
        // just created.
        words[0][1] = "hi there";
        words[0][0] = "my";
        words[0][2] = "name";
        words[1][0] = "is";
        words[1][1] = "jarek";
        words[1][2] = "laskowski";
        words[1][3] = "why";

        // words[0][3] = "x";
        // words[1][4] = "y";
        // System.out.println(words[0][1]);

        for (int row = 0; row < words.length; row++) {
            System.out.println("words.length = " + words.length);
            for (int col = 0; col < words[row].length; col++) {
                System.out.println("words[row].length = " + words[row].length);
                System.out.println(words[row][col]);
            }
        }
    }
}
