package Primitives.BooleanComparison;

import java.util.Scanner;

public class Bool8 {
//Multiple of 3 and 5
// Write a program that takes a number as input and prints
//true if the number is a multiple of both three and five,
// false otherwise.
// Note: Multiple of 3 and 5 means that it could be
// divisible by both 3 and 5.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number in the next line. ");
    int number = sc.nextInt();

    boolean isDivisible = number % 3 == 0 && number % 5 == 0;

    System.out.println("Is the number divisible by both 3 and 5 -> " + isDivisible);
}
}
