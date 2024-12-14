package WhileLoop;

import java.util.Scanner;

public class While4 {
    // The product price for the screen is 239.41 cents.
    // Print user to enter money, if user enters less than the product amount
    // display them how much more they should enter and ask money until they reach product price or more.
    // if their total comes up more than product price, give them an exchange.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double productPrice = 239.41;
        double userMoney = 0;
        while (userMoney<productPrice){
            System.out.println("Please enter the $"+ (productPrice -  userMoney));
            userMoney = userMoney + sc.nextDouble();
        }
        // When the loop ends we know that user enter more or equal to the product price
        if (productPrice<userMoney){
            System.out.println("Your change is being prepared: $"+(userMoney - productPrice));
        }else {
            System.out.println("You entered the exact balance have a good day!");
        }


    }


}
