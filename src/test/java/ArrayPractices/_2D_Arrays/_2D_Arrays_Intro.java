package ArrayPractices._2D_Arrays;

public class _2D_Arrays_Intro {
    // Storing array, inside an array.
    // A 2-dimensional array is like a table of data, organized into rows and columns. You can
    // think of it as an arrays, where each element in the main array  is itself a n arrays.
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        int[] array4 = {10,11,12} ;


        int[][] data = {
           array1,
           array2,
           array3,
           array4
        };
        // What is stored in the data array?


        // What is the length of array named data ?
        System.out.println(data.length); // 4

        // What is the output of the code below?
        System.out.println(data[0] == array1); // true
        // If data[0] equals to array1
        // can I write data[0] instead of array1?
        System.out.println(data[0][1] == array1[1]); // true
        System.out.println(data[0][1]); // 2

        int[][] table = {
                {1, 2, 3}, // index 0
                {4, 5, 6}, // index 1
                {7, 8, 9} // index 2 in the table array
              // 0  1  2
        };

        // How many elements does the table array store ?
        // 3
        System.out.println(table.length); // 3

        System.out.println(table[2][0]); // 7







    }


}
