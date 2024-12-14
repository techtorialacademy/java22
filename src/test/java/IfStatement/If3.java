package IfStatement;

import java.util.Scanner;

public class If3 {
//   Speed limit on highway is 70 and 45 on other roads.
//   When user exceeds the speed limit over 10 miles an hour
//  they get a ticket, when they exceed speed limit over
//  25 miles an hour they get their license withdrawn.
// Ask user their speed and which road are they going.
// And print whether they get ticket or other form of punishments.
// If they are going less than or equal to speed limit,
//  print you are driving safe, if they are driving over the
// speed limit but not high enough to get a ticket, then they
// will get a warning.
public static void main(String[] args) {
    // User will enter true if they are on highway, they will enter false
    // if they are on other road.
     Scanner s = new Scanner(System.in);
    System.out.println("Enter true if you are on highway, enter false otherwise");
    boolean onHighway = s.nextBoolean();
    System.out.println("Enter speed: ");
    int userSpeed = s.nextInt();
    int speedLimit;
    if(onHighway){
        // In this if block I will check for highway
         speedLimit = 70;
    }else {
         speedLimit = 45;
    }
    if(userSpeed <= speedLimit){
        System.out.println("You are driving safe.");
    } else if (userSpeed >= speedLimit + 10 && userSpeed <= speedLimit + 25){
        System.out.println("You will get a ticket.");
    } else if (userSpeed > (speedLimit + 25) ) {
        System.out.println("Your license will be revoked.");
    }else {
        System.out.println("you will get a warning.");
    }
}
}
