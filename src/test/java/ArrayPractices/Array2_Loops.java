package ArrayPractices;

import java.util.Arrays;

public class Array2_Loops {
    public static void main(String[] args) {
        int[] zipCodes = new int[4];
        zipCodes[0] = 60654; // First element in array is initialized
        zipCodes[1] = 60650; // Second element in array is initialized
        zipCodes[2] = 60018; // Third element in array is initialized
        zipCodes[3] = 60173; // Fourth element in array is initialized

        System.out.println(Arrays.toString(zipCodes));

        // Let's print only even zipcodes from an array
        for( int index = 0; index < zipCodes.length ; index++ ){
            int currentZipCode = zipCodes[index];
            if(currentZipCode % 2 == 0){
            System.out.println(currentZipCode);
            }

        }











    }
}
