package ArrayPractices;

import java.util.Arrays;

public class Array1_Intro {
    public static void main(String[] args) {

        // Syntax for creation
        double[] numbers = new double[4];
        // We created an array that holds 4 elements in it.
        // Since we have not yet initialized each elements' value, they will take the default value.
        // All numeric types: -> 0 or 0.0
        // Char -> empty char.
        // For every other thing it is going to be null.
        // How could we see what is inside the array?
        System.out.println(numbers); // Location of the array in memory
        //
        System.out.println(Arrays.toString(numbers));

        String[] texts = new String[2];
        System.out.println(Arrays.toString(texts)); // [null, null]

        // How could we access the individual elements from an array?
        int[] nums = new int[]{10,20,30,40,50};
        // We have created an array with size 5, and assigned values to each element for array.
        // Let's print first element from array nums
        // I need to use index number 0
        System.out.println("First element from array nums -> "+ nums[0]);
        System.out.println("Second element from array nums -> "+ nums[1]);

        // ArrayIndexOutOfBounds Exception
        // System.out.println("10th element from an array -> "+ nums[9]);

        // How can I learn the size of an array?
        // To learn the size of an array we could use length variable of array.
        System.out.println("Size of array nums is "+ nums.length); // 5

        // Find the last index of array nums?
        System.out.println("Last index of array nums is "+ (nums.length-1));

       // We could individually reassign elements of the array.
        nums = new int[]{10,20,30,40,50};

        // Let's reassign first element of array with 100.
        nums[0] = 100; // Now the value of first element is changed.
        System.out.println(Arrays.toString(nums)); // [100,20,30,40,50]

        // Value of the 4th element is entered 5 times less than what it should be.
        // let's fix the problem.
        nums[3] *= 5;
        System.out.println(Arrays.toString(nums)); // [100,20,30,200,50]













    }
}
