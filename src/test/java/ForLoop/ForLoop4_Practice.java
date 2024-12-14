package ForLoop;

import java.util.Scanner;

public class ForLoop4_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Find out, if a given string is a palindrome.
        // Palindrome means that reversed version of the string equals to string itself.
        // Such as, Hannah, civic.
        // Your code should not be case-sensitive.
        // For loop and char at method.

        //  1. We know how to get each letter in the string one by one
        //  2. I need to reverse order in the step 1
        //  3. I need to find sum of all the characters that I print in step 2
        //  If we need to gather(add) multiple chars in one data type, what data type should we use?
        //  4. I need to compare reversed version of the string ignoring the case
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        // For every string, index number of characters starts from 0 and goes till the length of the string.
        // length of the string is not included.
        // lastIndex = length of string -1
        String reversed = "";
        for (int index= s.length() - 1 ; index >= 0 ; index-- ){
            reversed += s.charAt(index);
        }
        if(reversed.equalsIgnoreCase(s))
        {
            System.out.println("You have entered a palindrome string.");
        }else {
            System.out.println("The string you have entered is not palindrome.");
        }

    }
}
