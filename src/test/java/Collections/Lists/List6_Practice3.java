package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List6_Practice3 {
    public static void main(String[] args) {
        // Given list of integers, write a program to find the difference between the maximum
        // and the minimum values in the list.
        /*
        Example:
            Input: [8, 2, 14, 5, 9]
            Output: 12 (14 - 2)
              */
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,8, 2, 14, 5, 9);
        int theMax = numbers.get(0);
        int theMin = numbers.get(0);
        for(int num : numbers){
            if(num > theMax){
                theMax = num;
            }
            if(num < theMin){
                theMin = num;
            }
        }
        System.out.println("The biggest value in the list is "+ theMax);
        System.out.println("The lowest value in the list is "+ theMin);
        System.out.println("And, the difference between the maximum and minimum is "+ (theMax - theMin));

    }
}
