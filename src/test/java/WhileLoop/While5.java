package WhileLoop;

import java.util.Scanner;

public class While5 {
    // Ask user to enter a string, and ask user to enter the number of the letter that they
    // would like to see.
    // If they enter invalid letter number keep asking if they want to try again.
    // If they want to try again, they could, but up to 3 times total.
    // You should assume that users don't know indexes, so they will be entering regular counting numbers.
    // if user enters 1 -> it means they would like to see first letter in string.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner forNextLine = new Scanner(System.in);
        System.out.println("Enter a text ");
        String text = forNextLine.nextLine();

        int attemptNum = 0;
        // What are the conditions that I can ask user again?
        // 1st one is the attempt number should be less than 3
        // if the user enters correct position should I ask for another attempt?
        // When they enter an invalid position how can I ask user if they want to continue?

        boolean isValidPosition = false;
        while (attemptNum < 3 && !isValidPosition){
            System.out.println("Enter the position of the letter you would like to see.");
            int position = sc.nextInt();
            attemptNum += 1;
            int indexPos = position -1;
            isValidPosition = indexPos >= 0 && indexPos < text.length();
            if (!isValidPosition)// If it is not a valid position
            {
                System.out.println("Invalid position. Attempts left " + (3 - attemptNum));
                System.out.println("Do you want to continue? yes/no   and default answer is no.");
                String answer = forNextLine.nextLine();
                if(!answer.equals("yes")) // if the answer does not equal to yes
                {// I should stop the loop.
                    System.out.println("Your session is ended!!! ");
                     break;
                }
            }else{
                System.out.println("You have entered a valid position and the letter is -> "+ text.charAt(indexPos));
            }
        }

    // Whenever you need to stop the loop under a certain circumstance then use a break statement.
        // break statement will stop the loop.


    }



}
