package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class Set3_TreeSet {
    public static void main(String[] args) {
        // Creation of treeset
       TreeSet<Integer> numbers = new TreeSet<>();
        // It stores the unique elements in sorted order AND doesn't allow null value to be stored.
        numbers.add(5);
        numbers.add(11);
        numbers.add(1);
        numbers.add(0);
        numbers.add(2);
        numbers.add(4);

        System.out.println(numbers); // [0, 1, 2, 4, 5, 11] it sorts the elements in ascending order.

        // numbers.add(null); // NullPointerException because TreeSet doesn't allow null value to be stored.

        // TreeSet doesn't allow us to get elements individually from the set, however
        // it allows us to get first AND last element from the set.

        // To get first element from the TreeSet
        System.out.println(numbers.first());

        // To get the last element from the TreeSet
        System.out.println(numbers.last());







    }

}
