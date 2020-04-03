//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 09; Arrays

public class JavaSimple09Arrays {
    public static void main(String[] args) {
        int value = 7;
        System.out.println(value);

        int[] values;
        values = new int[3];
        // int[] values = new int[3];
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int numbers[] = {5, 6, 7};
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
    }
}
