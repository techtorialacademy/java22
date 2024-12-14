package Primitives;

public class ByteShortType {
    // Shortcut to create a main method in Intellij is to write
    // main or psvm
    public static void main(String[] args) {
        // Create a byte variable
        byte batchNumber = 5;
        // In Intellij Shortcut to write a print statement is -> sout
        System.out.println(batchNumber);

        // 22
        // Creating a variable allows us to store
        // values with a names. Whenever that name is called(used)
        // java will recognize the given value.

        // 8 bit means that there is binary digits that this
        // data type can store. Binary digits are 1's and 0's.
        // 8 bit is the size of the byte data type which means
        // there is 8 bit numbers in byte data type.
        // 11111111 -> 255
        // Largest value a byte data type can take is 127 and
        // lowest it can take is -128.
        byte var1 = 127;
        byte var2 = -128;
        System.out.println("=====================================");
//        Creating a Short Variable
        short number1 = 11500;
        System.out.println(number1);
// You don't have to memorize largest and minimum value for any
// primitive type. There is a shortcut to learn for each type:
        System.out.println("Max. short value " + Short.MAX_VALUE);
        System.out.println("Min. short value " + Short.MIN_VALUE);

//        If you want to learn the min value for byte as above?
        System.out.println("Min. byte value " + Byte.MIN_VALUE);




    }
}
