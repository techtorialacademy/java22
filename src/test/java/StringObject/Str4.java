package StringObject;

import java.util.Scanner;

public class Str4 {
    public static void main(String[] args) {
 /*
        	 Ask user to provide his/her full name  and birth year in following format:
	        John Meza - 1999
           -check if the input string starts with >> your name
            -check if the input string ends with >> your birth year
            -check if the input string contains your full name with space between name and last name >> your full name
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your full name and birth year in following format: \nJohn Meza - 1999");
        // In a string value, if there is \n rest of the string will be on the next line.
        String userInput = sc.nextLine();

        boolean doesStart = userInput.startsWith("Yusuf");
        System.out.println("Does it start with my name? " + doesStart);
        boolean doesEnd = userInput.endsWith("2024");
        System.out.println("Does it end with my birth year? " + doesEnd);

        boolean doesContain = userInput.contains("Yusuf Turan");
        System.out.println("Does it contain my full name? " + doesContain);





    }
}
