package Collections.Map;

import java.util.*;

public class Map2_MethodsLoops {


    public static void main(String[] args) {
        // Let's create an HashMap
        HashMap<String,String> map = new HashMap<>();
        // Let's put state and city names.
        map.put("IL","Chicago");
        map.put("FL","Tampa");
        map.put("WI","Dells");

        // Let's get the city value for the state
        String cityForIL = map.get("IL");
        System.out.println(cityForIL);

        map.put("FL","Orlando"); // Since the key FL exists it will just update the value for key FL.


        String cityForFL = map.get("FL");
        System.out.println("City for FL is " + cityForFL);

        // remove() -> Just provide the key or provide the key and the value

        map.remove("FL");

        System.out.println(map);

       // Remove the IL key, if the city name is springfield
        map.remove("IL","Springfield"); // since the value for IL is not Springfield. It wont remove anything.

        System.out.println(map);

        // values() method
        // returns the collection of values from the map.

        System.out.println(map.values());

        Collection<String> values = map.values();

        // You could get the keys from the map as a set.
        Set<String> keys = map.keySet();

        System.out.println(keys);

        printValues(map);

        printValuesByKeys(map);


    }

    // create a method that will take a map as a parameter
    // your method will extract keys from parameter map
    // print each value from map by using map.get() method call
    //
    // in the main method, call/use your newly created method to check the result
    public static void printValuesByKeys(HashMap<String,String > map){
        Set<String> keys = map.keySet();
        for(String theKey : keys){
            // How could I get the value for theKey?
            System.out.println("Key : " + theKey + " and the value is " + map.get(theKey));

        }


    }



    // create a method that will take a map as a parameter
    // your method will print each value from the parameter map one by one
    // in the main method, call/use your newly created method to check the result
      public static void printValues(HashMap<String,String> map){
        // How could I find the all the values from the map above?
          Collection<String> valuesFromMap = map.values();
          for(Object aValue : valuesFromMap){
              System.out.println("Value: " + aValue);
          }


      }


}
