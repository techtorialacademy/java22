package WhileLoop;

import java.util.Scanner;

public class While2 {
    // Ask user to enter a number
    // If user enters even number print that is correct, otherwise keep asking user till
    // they enter even number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // The loop should continue as long as the user enters odd numbers.
        boolean isOdd = true; // because I want to run the loop for the first time.
        while(isOdd){
            System.out.println("Enter an even number");
            int number = sc.nextInt();
            // I have to check if the given number is ood or even
            isOdd = number % 2 != 0;
        }
        System.out.println("That's correct");

    }


}
