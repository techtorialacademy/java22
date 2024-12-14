package StudySessions;
// Ask user to enter a string, and ask user to enter the number of the letter that they
// would like to see.
// If they enter invalid letter number keep asking if they want to try again.
// If they want to try again, they could, but up to 3 times total.
// You should assume that users don't know indexes, so they will be entering regular counting numbers.
// if user enters 1 -> it means they would like to see first letter in string.

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner forNextLine = new Scanner(System.in);

        System.out.println("Please enter any word:");
        String word = forNextLine.nextLine();                //  Hemingway

        System.out.println("Please enter the number of the letter you would like to see:");
        int numberOfLetter = scanner.nextInt();           //3      (3-1)

        int lengthOfWord = word.length();                 //8     (8+1)

        // char letter = word.charAt(numberOfLetter-1);     //m

        int count = 1;

        while(numberOfLetter>lengthOfWord && count<3){
            System.out.println("This letter does not exist! Please Try one more time\nPlease note times to try left: "+ (3-count));
            numberOfLetter = scanner.nextInt();          //12 !!! no such letter
            count += 1;


        }

        if(numberOfLetter<lengthOfWord ){

            char letter = word.charAt(numberOfLetter-1);
            System.out.println("Letter number " + numberOfLetter+" is "+letter);
        }else {
            System.out.println("Wrong way!");
        }
    }}
