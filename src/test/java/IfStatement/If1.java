package IfStatement;

import java.util.Scanner;

public class If1 {
//Ask user to enter two equal integer variables,if user enters
//two numbers that are same we will print
//`You entered two equal numbers.`. If user enters two
//different numbers,  we will print `You didn't follow the
//instructions.`
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two equal whole number. ");
        System.out.println("Enter the number 1 on the line below.");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 on the line below");
        int num2 = sc.nextInt();

        if( num1 == num2 ){
            System.out.println("You entered two equal numbers.");
        }else {
            System.out.println("You didn't follow the instructions.");
        }
    }
}
