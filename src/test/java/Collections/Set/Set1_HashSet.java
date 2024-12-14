package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class Set1_HashSet {
    public static void main(String[] args) {

        // Creating a set object
        Set<String> colors = new HashSet<>();

        // Adding objects to set
        // We use add() method. The return type of add method is boolean.
        // If the object is succesfully added, then it returns true. If the object is not
        // added because it is duplicate then it will return false.
        System.out.println("Size of the set at the beginning is " + colors.size());
        // So the method below will return true
        System.out.println("Is the set empty? " + colors.isEmpty());

        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("black");
        colors.add("white");
        // We have added five different(unique) elements to the set. So the size of the set will be 5.
        System.out.println("Size of the set after adding elements is " + colors.size());
        // So the method below will return false
        System.out.println("Is the set empty? " + colors.isEmpty());

        System.out.println(colors.add("white")); // What will it print? // false
        // Because there is already white in the set we cannot add the duplicate value.
        System.out.println("After we try to add white AGAIN size of the set is " + colors.size());

        System.out.println(colors.add("green")); // true
        // Because there is no element with value `green`

        System.out.println("After I have added green the size of the set is " + colors.size());

        // Can we reach out a single element from a set?
        // To give an answer to question above let's see what happens when we print the set.
        System.out.println(colors);
        // Since there is no set order for the elements in `SET` object, we cannot access elements using
        // index numbers. There is no index number assigned to any element in set.

        // We could find/access the element in a set object if we know which value we are looking for by using
        // for loop.
        // Find if there is green in the colors set and if there is remove the element.
        for(String color : colors){
            if(color.equals("green")){
                System.out.println("There is a green in the set.");
                System.out.println("And now I am going to remove the element green");
                colors.remove("green");
                System.out.println(colors);
                break;
            }

        }




















    }
}
