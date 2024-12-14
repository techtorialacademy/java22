package Collections.Set;

import java.util.*;

public class Set4_Example {
//    Create a method that takes a List of Strings as a parameter. This method should:
//
//    Find unique elements from the given list using a Set.
//    Return those unique elements as a new List.

    public static List<String> findUniqueElements(List<String> inputList){
        // Step1: Create a set to store unique elements
        Set<String> uniqueElements = new HashSet<>();
        // Step2: Add all elements of the list to the set. Since the set won't allow duplicates to be
        // stored. I will eliminate the duplicates.
        // Add all elements from inputList to the uniqueElements set.
        for(String element : inputList){
            // we are going to add the element from inputList to the uniqueElements set.
            uniqueElements.add(element); // Since the duplicate elements cannot be added to the set.
            // it will eliminate the duplicates.
        }
        // uniqueElements is set
        // I have to convert set of String to the List of String.
        return new ArrayList<>(uniqueElements);
    }

 // Create a method that takes List Of Strings as parameter. This method should:
 // Find the elements that appear more than once.
// Return these repeated elements a new List.
//      "Alice", "Bob", "Alice", "Charlie", "Bob", "Bob", "Bob", "Charlie", "John", "Charlie", "Eve"
//       Your method should return Alice, Bob, Charlie
// Hint: Use contains method or you can use add method which returns true or false.

    public static List<String> findDuplicates(List<String> inputList){
        Set<String> duplicateFinder = new HashSet<>();
        Set<String> duplicatedElements = new HashSet<>();
        for (String element : inputList){
           if( !duplicateFinder.add(element) ){
               // element is a duplicate
               duplicatedElements.add(element);
           }

        }

        return new ArrayList<>(duplicatedElements);

    }
    public static void main(String[] args) {
        // Example input list with duplicate elements
        List<String> names = new ArrayList<>(Arrays.asList(
                "Alice", "Bob", "Alice", "Charlie", "Bob", "David", "Eve"
        ));

        System.out.println(names);
        List<String> uniqueElementsOnly = findUniqueElements(names);

        System.out.println(uniqueElementsOnly);

        List<String> names2 = new ArrayList<>(Arrays.asList(
                "Alice", "Bob", "Alice", "Charlie", "Bob", "Bob", "Bob", "Charlie", "John", "Charlie", "Eve"
        ));

        System.out.println(findDuplicates(names2));









    }

}
