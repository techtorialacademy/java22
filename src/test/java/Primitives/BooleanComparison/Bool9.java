package Primitives.BooleanComparison;

import java.util.Scanner;

public class Bool9 {

//  John wants to lose 10 pounds in one month.
// There are multiple conditions to lose 10 pounds in a mont.
// John needs to walk 10000 steps daily  OR needs to run at
// least 4 miles a day.  and Addition to these, John needs to
// eat less than 1500 calories daily. We should create a
// program to calculate if John can lose weight or not.
// daily steps, running distance and daily caloric intake
// will be given by user. Our goal is to print true when
//  John can lose weight and print false otherwise.
//    Note!
//    If && operator and || operator is used in same
//    operation, && operator will be calculated before || operator.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the daily caloric intake. ");
        int dailyIntake = scanner.nextInt();
        System.out.println("Enter the daily running distance in miles. ");
        int runningDistance = scanner.nextInt();
        System.out.println("Enter the the daily steps that you have completed. ");
        int stepsDaily = scanner.nextInt();

        // To lose 10 pound there is two condition: 1st is movement, 2. is caloric intake

        boolean canLose = (stepsDaily >= 10000 || runningDistance >= 4) && dailyIntake < 1500;
         // Since we would like to calculate movement as a single condition, to avoid && operation
        // being completed first, we are using parentheses to add precedence to or operator.
        System.out.println("Can lose the 10 pound? "+ canLose);



    }

}
