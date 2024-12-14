package ForLoop;

import java.util.Scanner;

public class ForLoop5_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int number = scanner.nextInt();
//         # Ask user to enter an integer number and print if the given
//         # integer is a prime integer.
//         # Prime numbers can ONLY be divided by 1 and itself.
//         # Every number can be divided by one and itself,
//         # The distinct feature of prime numbers is that they can't
//         # be divided by any other number.
           // no number can divide 11 other than 1 and 11.
           // 9 is not prime because it could be divided by 3 which is not 1 or 9 itself.
          // 7 -> is a prime number -> no number can divide 7 other than 7 itself and 1.
          // 2 -> is a prime number -> no number can divide 2 other than 1 and 2 itself.

        // 1. I have to look through all the possible divisors of a number.
        // 2. What is the range of possible divisors for a number?
        //  Possible divisor of a number should be smaller than equal to number itself and bigger than equal
        // to number 1.
      // Range for a possible divisor of number -> 1 <= possibleDivisor <= number
        // 3. Since I am looking for a prime number which can be divided by 1 and itself
        // i could reduce my range to 1 < possibleDivisor < number
        boolean isPrime = true;
        for(int possibleDivisor = 2  ; possibleDivisor < number  ; possibleDivisor++){
            // How can I check if the current possibleDivisor divide the number perfectly?
            if( number % possibleDivisor == 0){
                // It means that number can be divided by a possibledivisor so
                // it is not a prime number.
                // Do I need to continue the loop?
                isPrime = false;
                System.out.println(number + " is not a prime number. ");
                break;
            }
// Now can I write faster by this way?
        }
        if(isPrime){
            System.out.println(number + " is a prime number. ");

        }


    }
}
