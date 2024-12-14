package Collections.Map;

import java.util.HashMap;

public class Map4_CountAndStore2 {
    //create a method to count and store each letter from a String into a hashmap and return your final map
    // "Java"
    // "J" -> 1
    // "a" -> 2
    // "v" -> 1

    //{   "J": 1, "a": 2,
    // }

    public static HashMap<String,Integer> findLetterCounts(String str){
        // Our goal is to find count of each letter from a given str.
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            // How could I get each letter?
            // What method do I use to get a letter from a string with a known index?
            String letter = str.charAt(i) + "";
            if (map.containsKey(letter)){
                map.put(letter, map.get(letter)+1 );
            }else{
                map.put(letter,1);
            }

        }
         return map;
    }

    public static void main(String[] args) {
        String s = "Techtorial Academy";
        System.out.println(findLetterCounts(s));



    }

}
