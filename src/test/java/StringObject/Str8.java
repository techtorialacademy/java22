package StringObject;

import java.util.Scanner;

public class Str8 {
    public static void main(String[] args) {
//        # Given two strings, append them together (known as "concatenation")
//        # and return the result. However, if the strings are different lengths,
//        # omit starting chars from the longer string. So, it is the same length as the
//        # shorter string. So "Hello" and "Hi" yield "loHi".
//        # The strings may be any length.
        // str1 = java str2 = tech -> javatech
        // str1 = programming str2 = tech -> mingtech
        // str1 = java   str2 = techtorial -> javarial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.nextLine();
        System.out.println("Enter another string");
        String str2 = sc.nextLine();
        // str1 + str2, longer string is not known by us.

        // 1. Two strings can be same length
        // 2. str1 could be longer than str2
        // 3. str2 could be longer than str1
        if (str1.length() == str2.length()){
            System.out.println(str1.concat(str2));
        } else if (str1.length() > str2.length()) {
            // From which string should I omit the characters?
            // I will delete characters from str1 starting from beginning till I match the length to str2
            // If str2 length is x -> I should get last x characters from str1
            int lengthOfStr2 = str2.length();
            String str1Omitted = str1.substring(str1.length()-lengthOfStr2);
            System.out.println(str1Omitted.concat(str2));
        }else{
            int lengthOfStr1 = str1.length();
            String str2Omitted = str2.substring(str2.length()-lengthOfStr1);
            System.out.println(str1.concat(str2Omitted));

        }


    }
}
