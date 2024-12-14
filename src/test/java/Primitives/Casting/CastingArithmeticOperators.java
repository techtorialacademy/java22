package Primitives.Casting;

public class CastingArithmeticOperators {
    // When two data different primitive type is used in
    // arithmetic operation, result will automatically be promoted
    // to a larger data type.
    public static void main(String[] args) {
        double var = 4 + 4.0;
        // What data type can I use for the result of
        // arithmetic operation above?
        // Since java auto understands every decimal number as
        // double, the result of the arithmetic operation will
        // be promoted to double data type.\

        float f1 = 5;
        float var1 =  6.7f; // f at the end of the value
        // is a shortcut to casting double value to float.
        float f2 = (float)6.7;

        double d = 5;
        float f3 = (float)d;


        long l1 = 2;
        float result = f1 + l1;

        // Byte, short, char will always be promoted to
        // int data type when used in arithmetic operation.

        byte b = 10;
        byte b1 = 11;
        int result3 = b1 - b; //  will result in integer value.







    }

}
