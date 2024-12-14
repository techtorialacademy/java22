package ArrayPractices;

import java.util.Arrays;
import java.util.Scanner;

public class Array4_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask user how many number they want to enter.
        // Ask them enter each value individually.
        // Store all the values that user entered, in an array.
        // Find sum of all the values from the array,
        // and find the average of the values in an array.

        System.out.println("Enter amount of numbers that you will give: ");
        int sizeOfTheNumbers = scanner.nextInt();
        int[] givenNumbers = new int[sizeOfTheNumbers];

        int orderNumber = 1;
        while(orderNumber <= sizeOfTheNumbers){
            System.out.println("Please enter the "+orderNumber+". number. ");
            int input = scanner.nextInt();
            // How could I add this input that I get from user to the array?
            givenNumbers[orderNumber-1] = input;
            orderNumber++;
        }

        System.out.println(Arrays.toString(givenNumbers));
        int sum = 0;
        for(int i = 0; i<givenNumbers.length; i++){
            sum += givenNumbers[i];
        }
        System.out.println("Sum of all the numbers in the array is "+ sum);

        // To find an average we will divide sum of numbers to length of numbers.
        double average = (double)sum / givenNumbers.length;
        System.out.println(average);



    }
}
