package StudySessions;

import Primitives.BooleanComparison.ScannerUsage.ScannerEx1;

import java.util.Scanner;

public class LoopHomeworkTask3 {
//    Create a Java program that computes the factorial of a given any number.
//    For example: Given number: 5
//    Factorial: 120
//    Explanation: The factorial of 5 (5!) is 1*2*3*4*5 = 120. The factorial of 6(6!) is 1*2*3*4*5*6 = 720.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    // I need to find multiplication of natural number from 1 to num
    // Let's print natural number from 1 to given number.
//    int factorial = 1;
//     for(int nn = 1; nn <= num ; nn++){
//
//         factorial = factorial * nn;
//
//         // Instead of printing I need to multiply in each execuiton.
//     }
//    System.out.println("Factorial for natural number " + num + " is " + factorial);

    int factorial = 1;
    int nn = 1;
    while ( nn <= num){

        factorial = factorial * nn;
        nn++;

        // Instead of printing I need to multiply in each execuiton.
    }
    System.out.println("Factorial for natural number " + num + " is " + factorial);

    // Ask user to enter a bigger number than 4, keep asking until they enter.

    boolean isLess4 = true;
    for (;isLess4;){
        System.out.println("Enter a number bigger than 4");
        int num1 = scanner.nextInt();
        if(num1 > 4){
            isLess4 = false;
        }
    }

}
}
