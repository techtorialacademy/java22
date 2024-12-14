package ForLoop;

public class ForLoop2_Practice {

    // Find the sum of numbers between 1 and 20. inclusive(all numbers).
    // Find the sum of odd numbers between 10 and 100.

    public static void main(String[] args) {

        int sum = 0;
        for( int n= 1; n < 21 ; n++ ){
            // System.out.println(n);
            // n represents the numbers between 1 and 20.
            // Instead of printing n, we could add n to the sum.
            sum += n;
        }
        System.out.println(sum);

        // Find the sum of odd numbers between 10 and 100.

        int sumOdd = 0;
        for( int num = 11; num < 100; num+=2){
            sumOdd += num;
        }
        System.out.println("Sum off all odd numbers is "+ sumOdd);

        int sum1 = 0;
        for (int i = 10; i < 100 ; i++) {
            // You have to check each iteration if the i is odd.
            if (i % 2 != 0){
                sum1 += i;
            }
        }
        System.out.println("Sum off all odd numbers is "+ sum1);

    }

}
