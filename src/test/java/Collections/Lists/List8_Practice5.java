package Collections.Lists;

import javax.naming.InterruptedNamingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List8_Practice5 {
    // Given a list of integers print the version that list contains only last digit of elements.
    // [1, 22, 93] -> [1,2,3]
    // [16, 8, 886, 8, 1] -> [6, 8, 6, 8, 1]
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,16, 8, 886, 8, 1);
        List<Integer> lastDigits = new ArrayList<>();
        // Let's print out each element from the list
        for(int number : list){
            System.out.println(number);
            int lastDigit = number % 10;
            lastDigits.add(lastDigit);
            // If you want to get last digit of the number find the remainder with 10.

        }
        System.out.println(lastDigits);
    }



}
