package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List7_Practice4 {
    // Given list of strings, write a program to count how many times each element appears in the list
    // regardless of the case
    //  Input: ["a", "b", "b", "c", "a", "b", "c", "D", "d","A"]
    // Output:
    // a appears 3 times
    // b appears 3 times
    // c appears 2 times
    // d appears 2 times
    public static void main(String[] args) {
        List<String> givenList = new ArrayList<>();
        Collections.addAll(givenList,"a", "b", "b", "c", "a", "b", "c", "D", "d","A");
        List<String>  checkedValues = new ArrayList<>();

        for (String element : givenList){
            if(!checkedValues.contains(element.toLowerCase())){
                int count = 0;
                for(String restElements : givenList){
                    if(element.equalsIgnoreCase(restElements)){
                        count ++;
                    }
                }
                checkedValues.add(element.toLowerCase());
                System.out.println("Count of the element "+ element.toLowerCase() +" is "+ count);
            }
        }
    }












}
