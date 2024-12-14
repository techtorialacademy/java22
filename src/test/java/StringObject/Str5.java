package StringObject;

import java.util.Scanner;

public class Str5 {
    public static void main(String[] args) {
//    # Ask user to enter a string and print a rotated
//    # left 2 version, where the first 2 characters
//    # of the string moved to the end.
//       01234
//    # "Hello" → "lloHe"
//    # "java" → "vaja"
      // 0123456....
      // Software Testing is A Process For ......
        // scanner, substring, concat
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        // How can I find first 2 characters of the string?
        String firstTwo = str.substring(0,2);
        // Find rest of the characters in the string
        String restOfWord = str.substring(2);

        String rotated = restOfWord.concat(firstTwo);// Putting first two characters at the end of rest of word.

        System.out.println("Rotated version of string is " + rotated);







    }
}
