package Primitives;
public class IntegerLongType {
    public static void main(String[] args) {
        // Integer and Long
        // These data types are used for storing integer values.
        // ...-1,-2,0,1,2,....
        // By default java uses integer type for non-decimal numbers.
        // long is a larger data type than integer. Integer is 32, long is 64 bit.
        // Creating an integer variable
        int numberOfComputers = 41;
        System.out.println(numberOfComputers);
        // int averageGrade = 5.6;
        // the variable creation above won't work because
        // decimal numbers CANNOT be assigned to int or long data type.
        long numOfVariables = 90000;
        System.out.println(numOfVariables);

        // The main difference between long and integer is amount of memory
        // they use. Long use 64 bit of a memory while integer is using 32 bit.
        // Long is the larger data type of the two, long can store larger values.
        // Learn the maximum value for integer and long
        System.out.println("Max Value for Integer: " + Integer.MAX_VALUE);
        System.out.println("Max Value for Long: " + Long.MAX_VALUE);




    }




}
