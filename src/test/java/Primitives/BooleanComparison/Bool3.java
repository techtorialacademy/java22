package Primitives.BooleanComparison;

import java.awt.*;
import java.util.Scanner;

public class Bool3 {
    //    Problem: Even or Odd
    // We will write a program that prints true when variable
    // `number` is  even, and prints false when the number is odd.
    // Odd num: 1,3,5,7,9,11,13 etc.
    // Even num: 2,4,6,8,10,12 etc.
    // Note that value of integer variable number is going to come from user.
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a whole number on next line. ");
        int number = scanner.nextInt();

        // Let's evaluate whether given number is even.
        // Even numbers are perfectly divisible by 2.
        // If a number is perfectly divisible by other number there wouldn't be any remainder.
        // If the number gives no remainder with 2, it means that number is even number.
        int remainderWith2 = number % 2;
        // If the remainder with 2 equals 0, it means even number.
        boolean isEven = remainderWith2 == 0;
        // Note: `==` signs compares the two value and gives true if the values are equal, false otherwise.
        // If no remainder with 2, isEven will be true. If there is a remainder isEven will be false.
        // So printing out the variable isEven will give me the answer of the question.
        System.out.println("Is the given number even? -> " + isEven);

    }



}
