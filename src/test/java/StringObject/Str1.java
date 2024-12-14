package StringObject;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        // Ask user to enter a string
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine(); // nextLine() method in scanner object allows us to get string value
        // from the console(output).
        // Find the total number of characters in a given string.
        // If there is more than 10 characters in a given string calculate and print the
        // last index number in the string.
        // If there is 10 or less character in string, then print nothing to calculate.

        // How can I find total number of characters in the str1?
        int length = str1.length();
        if (length > 10 ){
            // How can I find the last index number in a str1?
            // Since counting index starts from 0 and regular counting starts from 1
            // last index number will have 1 deficit compared to length.
            int lastIndexOfStr1 = length -1;
            System.out.println("Last index number of str1 is "+ lastIndexOfStr1);
        }else{
            System.out.println("Nothing to calculate...");

        }






    }
}
