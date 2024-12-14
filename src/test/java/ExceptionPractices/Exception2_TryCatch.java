package ExceptionPractices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2_TryCatch {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index number to see matching value with the index");

        try{
            int indexNumber = s.nextInt();
            System.out.println("Your value for the index is " + nums[indexNumber]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You have entered an invalid index number.");
        }catch (InputMismatchException e1){
            System.out.println("You have not entered a valid format index, index number should be a whole number.");
        }

    }


}
