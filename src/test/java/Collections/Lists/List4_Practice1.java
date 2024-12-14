package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List4_Practice1 {
    public static void main(String[] args) {
        // Let's create list called colors.
        // Store 5 colors in the list, print out the colors only first letter is uppercase.
        // rest is lower case.
        List<String> colors = new ArrayList<>();
        Collections.addAll(colors, "red", "YeLLOw", "bLUe", "blACK", "whITe");

        for (String element : colors) {
            // Using substring get the first letter from the element
            String firstUp = element.substring(0, 1).toUpperCase();
            // Using substring get the rest of the letters from element
            String restLo = element.substring(1).toLowerCase();
            System.out.print(firstUp + restLo + " ");
        }
        System.out.println();

        // Print each element from the list in upper case, starting from
        // last element in the list to first element in the list.
        for( int i = colors.size()-1 ; i >= 0 ; i-- ){
            System.out.println(colors.get(i).toUpperCase());
        }




    }
}