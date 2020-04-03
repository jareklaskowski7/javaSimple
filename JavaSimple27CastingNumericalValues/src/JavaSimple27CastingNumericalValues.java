//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 27; Casting Numerical Values

public class JavaSimple27CastingNumericalValues {
    public static void main(String[] args) {
        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = 8834.8f;
        float floatValue2 = (float) 99.3;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(shortValue);
        intValue = (int) longValue;
        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int) floatValue;
        System.out.println(intValue);

        doubleValue = (double) intValue;
        System.out.println(doubleValue);

        System.out.println(floatValue2);

        // The following won't work as we expect it to!!
        // 128 is too big for a byte.
        byteValue = (byte) 128;
        System.out.println(byteValue);
    }
}
