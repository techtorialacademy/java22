package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List5_Practice2 {
//    Given an list of integers, write a program to remove duplicate
//    elements and print the list with unique values only.
/*
Input: [4, 5, 4, 8, 5, 2, 2, 8]
Output: [4, 5, 8, 2]
 */
public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    Collections.addAll(numbers,4, 5, 4, 8, 5, 2, 2, 8);
    // Hint
    // Create a new list to store unique values

    List<Integer> uniqueValues = new ArrayList<>();

    // We will loop through the numbers list, and for each element we will check if the
    // uniqueValues contain the element. If it does we will skip, if uniqueValues list doesn't contain
    // the element then we add that element to the unique values.
    for (int element : numbers){
        if (!uniqueValues.contains(element)){
            uniqueValues.add(element);
        }
    }
//    for (int i = 0; i < numbers.size() ;  i++){
//        if (!uniqueValues.contains(numbers.get(i))){
//            uniqueValues.add(numbers.get(i));
//        }
//    }
    System.out.println(uniqueValues);






}




}
