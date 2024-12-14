package Primitives.ArithmeticOperators;

public class Ex4 {

    // Create an integer variable and regardless of the value
    // your code should print the last digit of that number.
    public static void main(String[] args) {
        int number =  43215;
        // finding a remainder with 10 will give us the last digit
        // from a number.
        int lastDigit = number % 10;
System.out.println("The last digit of the number is "+ lastDigit);
    // From a given number lets remove the last digit of the
    // number
    // Dividing number by 10 will remove the last digit of
    // a number
    int lastDigitRemovedVersion = number / 10;
System.out.println("When last digit is removed: "+ lastDigitRemovedVersion);

// Assume that you will always be given a 5 digit number. Using the operations above
// find each digit of a number then display them from last digit to first digit.
// if a number given is 67823
// Display: 3
//          2
//          8
//          7
//          6

    }
}
