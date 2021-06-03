//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 40; The equals() Method

public class JavaSimple40TheEqualsMethod {
    public static void main(String[] args) {
        System.out.println(new Object());
        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        Double value1 = 7.2;
        Double value2 = 7.2;
        System.out.println(value1 == value2);
        System.out.println(value1.equals(value2));

        Integer number1 = 6;
        Integer number2 = 6;
        System.out.println(number1 == number2);
        System.out.println(number1.equals(number2));

        String text1 = "Hello";
        String text2 = "Hellodfadf".substring(0, 5);
        System.out.println(text2);
        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));
    }
}
