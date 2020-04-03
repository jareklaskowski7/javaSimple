//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 53; Sorting Lists

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSimple53SortingLists {
    public static void main(String[] args) {
        // ////////// Sorting Strings /////////////
        List<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");

        // Sort list in alphabetical order (natural order)
        Collections.sort(animals);
        // Iterate through list of animals
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println();

        // Collections.sort(animals);
        Collections.sort(animals, new StringLengthComparator());
        // Iterate through list of animals
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println();

        // Sort list in alphabetical order (natural order)
        Collections.sort(animals, new AlphabeticalComparator());
        // Iterate through list of animals
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println();

        // Sort list in reverse alphabetical order
        Collections.sort(animals, new ReverseAlphabeticalComparator());
        // Iterate through list of animals
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // //////////Sorting Numbers /////////////
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        // Sort list in natural order
        Collections.sort(numbers);
        // Iterate through list of numbers
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        // Sort list in reverse natural order
        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        // Iterate through list of numbers
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        // //////////Sorting Arbitrary objects /////////////
        List<Person> people = new ArrayList<Person>();
        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Clare"));
        people.add(new Person(2, "Sue"));

        // Iterate through list of people
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        // Sort list of people in order of ID
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                if (p1.getId() > p2.getId()) {
                    return 1;
                } else if (p1.getId() < p2.getId()) {
                    return -1;
                }
                return 0;
            }
        });
        // Iterate through list of people
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        // Sort list of people in order of name
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        // Iterate through list of people
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();
    }
}
