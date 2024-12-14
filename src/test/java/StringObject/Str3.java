package StringObject;

import java.util.Scanner;

public class Str3 {
    // Ask user to enter a password.
    // If this password consists of only lower case letters print `invalid response all lower case`
    // If this password consists of only upper case letters print `invalid response all upper case`
    // If the password contains both upper and lower case then print `valid password`.

    // You will use toUpperCase(), toLowerCase(), equals() methods from the string.
    // If else statement.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a passw with both upper and lower case chars.");
        String pass = scanner.nextLine();

        // How can I understand if there is a lower or upper case at the same time?
        // All lower case version of the user's input
        String lower = pass.toLowerCase();
        // If the original string equals to its lower case version, it means
        // original string consists of only lower cases.
        boolean isAllLower = pass.equals(lower);

        // All upper case version of the user's input
        String upper = pass.toUpperCase();
        // If the original string equals to its upper case version, it means
        // original string consists of only lower cases.
        boolean isAllUpper = pass.equals(upper);

        if(isAllLower){
            System.out.println("invalid response all lower case");
        }else if(isAllUpper){
            System.out.println("invalid response all upper case");
        }else{
            System.out.println("valid password");

        }




    }




}
