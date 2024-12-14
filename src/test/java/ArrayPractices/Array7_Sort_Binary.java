package ArrayPractices;

import java.util.Arrays;

public class Array7_Sort_Binary {
    public static void main(String[] args) {
        // Sort method from Arrays class arranges elements in a specific order, typically ascending.
        // Sorting makes data easier to manage, search, and analyze.
        //Syntax
        // Arrays.sort() is a built in method to sort an array in ascending order.
        // Ascending order means -> lower value to higher value or alphabetically a -> z.
        // Upper case letters will always be put before lower case letters.

        int[] numbers = {10,3,7,1,9,5};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));


        String[] words = {"Cloud","API","Testing","arm64", "cpu","testing" };

        // Sort the words array in ascending order
        Arrays.sort(words);

        System.out.println("Sorted array: "+ Arrays.toString(words));

        // Binary Search
        // It is an efficient algorithm for finding a target value within a sorted array.
        // It works by repeatedly dividing the array in half, comparing the middle element with target.

        // How it works?
        // 1. Start with middle element
        // 2. If the middle element is equal to target, search is complete.
        // 3. If the target is smaller than the middle element, discard the right half and focus left.
        // 4. If the target is bigger than the middle element, discard the left half and focus right.
        // 5. Repeat until element is found or the range is empty.

        int[] nums = {20,2,15,5,8,12};
        int target = 12;
        // In order for binary search to perform array must be sorted.


        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int indexNumber = Arrays.binarySearch(nums,target);



        if(indexNumber >= 0){
            System.out.println("Binary search has found the element in the array. ");
            System.out.println("And, the index number of the element in sorted array is "+ indexNumber);
        }else {
            System.out.println("When binary search is performed and, the element is not found binary ");
            System.out.println("search returns negative value.");
            System.out.println("Returned index number from binary search is " + indexNumber);

        }




    }

}
