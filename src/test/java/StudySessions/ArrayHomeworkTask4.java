package StudySessions;

public class ArrayHomeworkTask4 {
//    Write the application to find the second largest value from given array.
//    Example:
//    Given array value: 3,2,8,9,1,5,4,3,7,8,5,9,9
public static void main(String[] args) {
    int[] numbers = {40,11,10,21,30,7,40,8};
    int largest =  Integer. MIN_VALUE; // lowest integer value
    int secondLargest =  Integer. MIN_VALUE; // lowest integer value

    for (int i = 0; i < numbers.length; i++) {
        if(numbers[i] > largest){
            // THis if means that I found a larger value in the array
            // than what I assumed so far as largest.
            secondLargest = largest;
            // I will assign what I assumed as larges to the second largest value
            // then I will change largest value with bigger value I found in the arrray
            largest = numbers[i];
        }else if(numbers[i] < largest && numbers[i] > secondLargest){
            secondLargest = numbers[i];
        }

    }
    System.out.println(largest);
    System.out.println(secondLargest);
}
}
