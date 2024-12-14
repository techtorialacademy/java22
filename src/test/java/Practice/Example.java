package Practice;

public class Example {
    public static String test;
    static String var2;
    String var3;

    static{
        test = "static block executed!";
        var2 = "static block is executed for var2 as well!";
        System.out.println("Variable test: "+ test);
        System.out.println("Variable var2: "+ var2);
    }

    public static void printTest(){
        System.out.println("Print test method executed!");
        var2 = "Change it here";

    }
    public void nonStaticPrintTest(){
        System.out.println("Non-static print test method executed!");
    }

    public static void main(String[] args) {
        System.out.println("Hello");

    }

}
// Compiling vs Executing
// Compiling happens before the execution and we could simplify it translation of the code from
// user-syntax version to computer understandable version.
// Everytime we run the code in Intellij, it automatically compiles the code, then it runs. So
// it would look like to us the code runs without compiling.
// Java compiles everything in order:
// 1st: Static variables
// 2nd: Static blocks
// 3rd: Static methods
// 4th: Non-Static variables
// 5th: Non-static methods
// Non-Static blocks-> Doesn't follow a specific order, they are executed as soon as an object created.