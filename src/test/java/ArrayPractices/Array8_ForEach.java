package ArrayPractices;

public class Array8_ForEach {
    public static void main(String[] args) {
        // for each method is just a for loop with a different syntax.
        // When index number of element is not needed, and only important thing
        // is to reach individual elements from a collection/array we can use foreach loop.

        int[] numbers = {1,2,3};
        // Both when a regular loop might be better and when a for each loop would be better.


        // find the first odd number in array and return the index number of it.
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
            // Did we use index number for any other purpose than accessing the element?
            if(numbers[i] % 2 == 1){
                System.out.println("First odd number is found and index number is: "+ i);
                break;
            }
        }
        // numbers = {1,2,3};
        // print each number in the array
        for( int num : numbers  ){
            System.out.println(num);
        }

        String[] words = {"hello","world","Java","programming"};


        for(String aWord: words ){
            System.out.println(aWord);

        }


    }
}
