package Primitives.BooleanComparison;

import java.util.Scanner;

public class Bool4 {
    /**/ // /**/ -> symbol is used for commenting  out everything in between them.
    /*   create a program that asks user to enter their 3 exam results.
         Find the average of 3 exam results with decimal points.
         Passing grade for the exam is 75. If user passes print true, print false if user fails.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your 1st exam result on next line. ");
        int ex1 = scanner.nextInt();
        System.out.println("Please enter your 2nd exam result on next line. ");
        int ex2 = scanner.nextInt();
        System.out.println("Please enter your 3rd exam result on next line. ");
        int ex3 = scanner.nextInt();

        // To find the average find sum of all the exams and divide by 3.
        double avg = (ex1 + ex2 + ex3)  /  3.0 ; // Result will always end with .0
        System.out.println(avg);
        // double avg = (double)(ex1 + ex2 + ex3)  /  3 ;
        // double avg = (ex1 + ex2 + ex3)  /  (double)3 ;
        // double avg = (ex1 + (double)ex2 + ex3)  /  3 ;
        // Note: Division of any numerical primitive type other than float,double will calculate
        // the result without a decimal point. So if we want to get decimal point out of a division
        // we have to use double or float somewhere in the operation.






    }

}
