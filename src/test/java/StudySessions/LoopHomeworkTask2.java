package StudySessions;

import java.util.Scanner;

public class LoopHomeworkTask2
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        // int rimainder = number % divider =0;
        //int  number = rimainder >= 100 && rimainder<=200;

        int sum = 0;
        System.out.println("Numbers between 100 and 200, divisible by "+number);
        for ( int i = 100; i <= 200 ; i++ ){
            if ( i % number == 0){
                // System.out.println(i);
                sum+=i;
                System.out.print(" "+i);
            }
        }
        System.out.println("");
        System.out.println("The sum: " + sum);
    }
}
