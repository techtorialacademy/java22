package ClassObjectMethod;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // Let's create a public method that will take 2 double numbers as parameters.
    // This method will return the sum of numbers as double.
    // Name of the method will findSum.
    // Create a main method below in this class and test your method.
    public double findSum(double num1, double num2 ){
        return num1 + num2;
    }
    // What if I want to create a method to findSum of all the values in an integer list.
    public int findSum(List<Integer> nums){
        // We are already given a list of integer values.
        int sum = 0;
        for(int element : nums){
            sum += element;
        }
        return sum;
    }



    // In this class we have overload findSum method.
    // THere is 2 ways to use findSum method.
    // If we give 2 double values for find sum method it will return sum of 2 doubles as a double value.
    // If we give List<Integer> to findSum method, it will return sum of all the values in the list as an integer.


    // Let's create a public method that will take single int value and
    // will return the square of the given integer. Name of the method square.
    public int square(int num){
        return num * num;
    }



    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 11.5;
        double b = 0.5;
        double sum = calculator.findSum(a , b);
        System.out.println( sum);

        // calculator.square(a); // Won't compile, as square method strictly expects an integer value to be passed.
        System.out.println(calculator.square(4));

        System.out.println(calculator.findSum(3.2,2.9));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(11);
        numbers.add(56);
        System.out.println(numbers);
        System.out.println(calculator.findSum(numbers));
        // findSum method is overloaded in calculator class.
        // To overload any method, use the same method name in the class with different parameters.

        // From any of the object types that we learned(List and String)
        // give me a method example that is overloaded.
        String test = "doesn't matter";
        test.substring(1);
        test.substring(1,3);

        test.replace('o','n');
        test.replace("doesn't", "does");
        // Same class same method name, different parameters.
        // Difference could be number of parameters, data type of parameters.

    }

}
