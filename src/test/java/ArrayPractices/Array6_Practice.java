package ArrayPractices;

public class Array6_Practice {
    public static void main(String[] args) {
        int[] numbers = {12 , 16 , 15 , 18, 14, 9 , 21, 7};
        // find out pairs of numbers from given array if they make 30 as total
        // 12 and 18 makes 30
        // 16 and 14 makes 30
        // 9 and 21 makes 30
        for (int i = 0; i <numbers.length ; i++) {

            for(int j = i+1; j< numbers.length ; j++){
                if(numbers[i] + numbers[j] == 30 ){
                    System.out.println(numbers[i] + " + " + numbers[j] +" is equal to 30. " );
                }

            }
        }






    }
}
