package Homework;

import java.util.Scanner;

public class MusicBox {
    // There should be 3 different types of music available
    // 5 different songs for each type of music
    // Display available categories and ask user which one they want
    // Display which songs are available under the music type
    // And ask which song they want to listen
    // We will show the price for the song
    // implement a payment logic.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String availableTypes = "classical, pop, country";
        System.out.println("-------Welcome to the music box!!!-------");
        System.out.println("Here are the available music types in this music box: ");
        System.out.println(availableTypes);
        System.out.println("Please enter the music type for your mood");
        String userType = scanner.nextLine();
        String classicalMusics = "-Four Seasons- -Fur Elise- -Finlandia- -Vocalise- -The Planets-";
        String popMusics = "-Bad guy- -Talk- -Please Me- -7 Ring- -Without Me-";
        String countryMusics = "-Meant to Be- -Heaven- -Simple- -One Number Away- -Get Along-";
        String musicsToDisplay = "This string should not be displayed if the music type is not matching.";
        double countryPrice = 3.0;
        double classicalPrice = 2.0;
        double popPrice = 4.0;

        double priceToDisplay = 0;
        boolean isClassical = userType.equalsIgnoreCase("classical");
        boolean isPop = userType.equalsIgnoreCase("pop");
        boolean isCountry = userType.equalsIgnoreCase("country");

        while(!isPop && !isClassical && !isCountry){
                System.out.println("Unfortunately, "+ userType+" type of music is not available in this music box.");
                 System.out.println("Do you want to continue? y/yes or n/no");
                 String continueAnswer  = scanner.nextLine();
                 if(continueAnswer.equalsIgnoreCase("yes") || continueAnswer.equalsIgnoreCase("y"))
                 {
                     System.out.println("Please enter the music type for your mood");
                     userType = scanner.nextLine();
                   isClassical = userType.equalsIgnoreCase("classical");
                   isPop = userType.equalsIgnoreCase("pop");
                   isCountry = userType.equalsIgnoreCase("country");
                 }else {
                     System.out.println("Thank you for your time!!!");
                    System.exit(0);
                 }

        }
        if(isClassical){
                musicsToDisplay = classicalMusics;
                priceToDisplay = classicalPrice;
        } else if (isPop) {
                musicsToDisplay = popMusics;
                priceToDisplay = popPrice;
        } else if (isCountry) {
                musicsToDisplay = countryMusics;
                priceToDisplay = countryPrice;
        }
        System.out.println(musicsToDisplay);
        System.out.println("Please enter the name of the song you want to listen");
        String nameOfSong = "-"+scanner.nextLine()+"-";

        if(musicsToDisplay.toLowerCase().contains(nameOfSong.toLowerCase())){
            System.out.println("The song "+ nameOfSong +" is available.");
            System.out.println("You should insert $"+priceToDisplay);
            // payment logic
            double userMoney = scanner.nextDouble();
            while (userMoney < priceToDisplay){
                System.out.println("You entered $"+(priceToDisplay-userMoney) + "less" );
                System.out.println("Do you want to continue? Press 1 for yes, press 0 to exit");
                int userAnswer = scanner.nextInt();
                if(userAnswer == 1){
                    System.out.println("Please enter extra $"+(priceToDisplay-userMoney));
                    userMoney += scanner.nextDouble();
                }else{
                    System.out.println("Thank you for your time, you can't listen the song now.");
                    System.out.println("Maybe another time!!");
                    break;}

            }
            if(userMoney > priceToDisplay){
                System.out.println("Here is your change $"+(userMoney-priceToDisplay)+" ...");
                System.out.println("Enjoy your music, "+nameOfSong.toUpperCase()+" is playing!!");
            }else if(userMoney == priceToDisplay){
                System.out.println("You have no change ...");
                System.out.println("Enjoy your music, "+nameOfSong.toUpperCase()+" is playing!!");
            }
        }else{
            System.out.println("The song "+ nameOfSong + " is not available.");
        }



    }
}
