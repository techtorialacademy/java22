package IfStatement;

import java.util.Scanner;

public class If2 {
// Create program that calculates the grade letter of a student.
// Ask user their grade as an integer number.Print `Not a valid grade` if
// the grade is lower than 0 or bigger than 100.
// Print A+ if the grade is higher than 94
// Print A if the grade is in between 85 and 94 inclusive.
// print B if the grade is in between 75 and 84 inclusive
// print C if the grade is in between 65 and 74 inclusive.
// print grade doesn't meet expectations when the grade is
// lower than 65.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int grade = scanner.nextInt();

    if(grade < 0  || grade > 100){
        System.out.println("Not a valid grade");
    }else if ( grade > 94 ){
        System.out.println("Your grade is A+");
    }else if (grade >= 85) {
        // will the code evaluate this line if
        // a grade is higher than 94?
        System.out.println("Your grade is A");
    }else if(grade >= 75 ){
        // If the grade is higher than 84 the conditions above will catch it.
        System.out.println("Your grade is B");
    }else if(grade >= 65){
        System.out.println("Your grade is C");
    }else{
        // Anything above 0 including 0 and below 65 will be considered in this else
        System.out.println("Your grade doesn't meet expectations.");
    }

}
}
