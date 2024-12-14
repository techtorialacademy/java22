package Primitives.Casting;

public class CastingEx1 {
// Create a  package under primitives called Casting and
    // create this class
    public static void main(String[] args) {
        // Implicit casting happens small data type to higher data type
        float f = 41;
        // What is the data type of variable f?
        // float
        int num = (int)f; // The variable f is explicitly cast to integer type.
        // Explicit casting used when converting larger data type to smaller data type.
        System.out.println( "The variable f is -> " + f); // 41.0
        System.out.println("The variable num is -> " + num); // 41

        // Casting from decimal number to a whole number will always
        // get rid of all the decimal part. No rounding will happen.

        double d1 = 47.99;
        byte b = (byte)d1;
        System.out.println("double variable with value 47.99 casted to byte -> "+b);
        // It will get rid of the decimal point so, it will be 47.

    }
}
