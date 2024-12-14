package Primitives.BooleanComparison;

import java.util.Scanner;

public class Bool6 {
//
//    Scenario: A sports shop offers a buy-one-get-one-half-off deal. The user inputs
//    the price of the first item and the price of the second item. The goal is to calculate the
//    total cost under the deal and determine if the total cost exceeds $50.

//     Take two inputs for the item prices.
//    Calculate the total cost, applying the discount on the second item (half off).
//    Print true if the cost is below $50, otherwise print false.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // What data type could be fit for item prices?
    // double
    System.out.println("Please enter the price of the first item on the next line.");
    double firstItem = scanner.nextDouble();
    System.out.println("Please enter the price of the second item on the next line.");
    double secondItem = scanner.nextDouble();

    // %50 of second item -> secondItem/2 -> secondItem * 0.5
    double totalCost = firstItem + secondItem / 2;

    boolean isTotalBelow50 = totalCost < 50;

    System.out.println("Is the cost less than 50? "+isTotalBelow50 );



}

}
