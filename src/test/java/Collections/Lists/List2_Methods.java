package Collections.Lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List2_Methods {
    public static void main(String[] args) {
        // Create a list to store String values
        List<String> words = new ArrayList<>();


        // Learning the size of the list -> size() method
        System.out.println(words.size());

        // We could add new elements to the list.
        // add(element): Adds an element to the end of list.
        words.add("testing");
        // This method adds given value to the end of the list.
        System.out.println(words); // ["testing"]

        words.add("auto-scaling");

        System.out.println(words);

        // which one will show first in the list? testing OR auto-scaling?
        // testing will be shown before, because list is an ordered collection so newly added elements
        // always go to end of the list.
        words.add("cloud-front");
        words.add("load-balancer");
        words.add("latency");
        System.out.println(words);
        // words -> [testing, auto-scaling, cloud-front, load-balancer, latency]

        // we could specify an index number for new element to be added.
        words.add(3,"elastic-beanstalk");

        System.out.println(words);
        // words -> [testing, auto-scaling, cloud-front, elastic-beanstalk,load-balancer, latency]

        // Is the list a mutable(changeable) or an immutable object?
        // mutable object, it is not reassigned but changed its value.

        // Accessing individual elements from the list.
        // Use an index number
        // we provide index number to the get() method.
        // words -> [testing, auto-scaling, cloud-front, elastic-beanstalk,load-balancer, latency]
        System.out.println(words.get(5)); // latency

        System.out.println(words.get(3)); // elastic-beanstalk

        // Remove the element at specified index
        // words -> [testing, auto-scaling, cloud-front, elastic-beanstalk,load-balancer, latency]
        words.remove(2); // this removes the element at index number 2.
        System.out.println(words);
        // words -> [testing, auto-scaling, elastic-beanstalk, load-balancer, latency]

        // Contains Method
        // It checks if the given element is in the list.
        // If the list contains the element it returns true, false otherwise.
        // words -> [testing, auto-scaling, elastic-beanstalk, load-balancer, latency]
        if(words.contains("elastic-bea")){
            System.out.println("elastic-beanstalk is on the list");
        }else {
            System.out.println("elastic-beanstalk is not on the list");
        }

        // Set Method
        // Replaces the element at a certain index
        // .set(indexNumber, newElement)
        // the method above will replace existing element at indexNumber with newElement.
        // words -> [testing, auto-scaling, elastic-beanstalk, load-balancer, latency]
        words.set(2,"elastic-file-system");
        System.out.println(words);
        // words -> [testing, auto-scaling, elastic-file-system, load-balancer, latency]

        // clear() method
        // Removes all elements from the list.
        words.clear();
        System.out.println(words); // []

        // isEmpty() method
        // Returns true if the list is empty, false otherwise
        System.out.println(words.isEmpty()); // true

   // add method
        // If only a value provided for add method, it will add that value to the end of list.
        // If both an index number and value provided, it will add value to the given index.
   // get method
        // It will return the value from the list at given index.
   // remove method
        // remove the element at given index
   // contains method
        // it will return true if the list contains given value, false otherwise
   // size()
        // it will return the number of elements in a list.
   // set()
        // When index number and a value provided, it replaces old value at given index with a new value.
   // isEmpty()
        // Returns true if the list is empty.
   // clear()
       // Removes all elements from the list.











    }




}
