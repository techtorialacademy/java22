package IfStatement;

import java.util.Scanner;

public class If4 {
//    In the factory we need to create a program that can find if we can do the shipment and, if we can do the shipment
//    it will tell us how many small package we should ship. First we need to get total kilogram of the shipment,
//    to reach this total kilogram of shipment we can use small and big packages. Every big package is 5 kilogram
//    and every small package is 1 kilogram. We have limited amount of small and big packages.
//    Ask user how many big and how many small package they have.
//    Ask user what is the total goal kilogram of the shipment.
//    Print whether they can ship, if they can ship print how many small packages they need.
//    Assume big packages is used before small packages.
//    To ship we need to reach exact number of shipment kg.
//    Use small and big packages small pack = 1kg big pack = 5kg
//    Use big packages before small packages If we can do the shipment print how many small pack needed.
    // Can I do the shipment? If I can, how many small package will be used?
    // There is two ways to ship -> ideal way (Enough big package) -> 2. non-ideal I don't have enough big package
    // but I do have extra small package to complete.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to be shipped. ");
        int shipmentGoal = s.nextInt();
        System.out.println("Enter the number of big packages in inventory.");
        int numBigPack = s.nextInt();
        System.out.println("Enter the number of small packages in inventory.");
        int numSmallPack = s.nextInt();
        // How can I find out the number of big packages I need ideally?
        int idealBigPackNeed = shipmentGoal / 5; // because the one big pack is 5 kg.
        int smallPackNeed;
        if(idealBigPackNeed <= numBigPack){
            // In this if block, I know that I have enough big packages
            // How can I calculate number of small pack needed?
            // We could just find the remainder with 5 to calculate number of small pack needed.
          smallPackNeed = shipmentGoal % 5;
            // At the end we will come to see how to calculate whether we have enough small pack.
        }else {
            // In this else block there is not ideal amount of big package.
            // calculate how much you can ship with all big packages.
            int totalBigPack = numBigPack * 5;
             smallPackNeed = shipmentGoal - totalBigPack;
        }
        // I know how much smallPack I need.
        if(smallPackNeed <= numSmallPack){
            System.out.println("Yes you could do the shipment and you will use "+smallPackNeed+" small packs.");
        }else {
            System.out.println("You cannot do the shipment.");
        }

    }

}
