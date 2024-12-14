package StudySessions;

import java.util.Scanner;

public class LoopHomeworkTask4
{
    public static void main(String[] args) {
//        Display the Squares of Natural Numbers and Their Sum
//        Objective: Write a Java program to display the first N terms of square natural numbers and calculate their sum.
        // Print the square of the natural numbers till you reach the given number .
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        // Let's just print the natural numbers from 1 to given number
        int squareSum = 0;
        for (int nn = 1; nn <= number ; nn++ ){
            System.out.println("Natural number "+ nn);
            // Instead of printing the numbers, i have to find the square of it and display
            int squareOfNaturalNumber = nn*nn;
            squareSum += squareOfNaturalNumber;
            System.out.println("Square of the natural number is "+squareOfNaturalNumber);
            // On top of displaying the squares of the numbers I should find the sum of them.

        }
        System.out.println("Sum of all squares is "+ squareSum);



    }
}
