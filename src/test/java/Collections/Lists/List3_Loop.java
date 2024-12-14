package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List3_Loop {
    public static void main(String[] args) {
        // Let's create a list to store int values.
        List<Integer> numbers = new ArrayList<>();
        // Adding multiple elements to the list in a single line.
        Collections.addAll(numbers, 1,2,3,4,5,6,7,8,9);
        // addAll method from Collections class to add multiple elements at the same time.
        System.out.println(numbers.size()); // 9

        // index numbers always start from 0 and goes till the size/length of the variables
        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }

        for (int number : numbers) {
            System.out.println(number);
        }
      List<String> s = new ArrayList<>();


    }

}
