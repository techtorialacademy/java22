public class HelloWorld {

    public











    static void main(String[] args){
//      The line below is our first print statement
        System.out.println("Hello World!");
        System.out.println(2);
        System.out.println("2");

// In java "2" is not same as 2. "2" is considered as a text(string), and
// 2 is considered as a numerical data type(integer).

// Java is a case-sensitive language so System and system doesn't mean
// the same thing.
// Adding two Texts to Each Other(Concatenation)

    System.out.println("Java" + "Programming");
    System.out.println("Java"+" "+"Programming");
// Combine Text and Numbers in Arithmetic Operation

    System.out.println("We are batch " + 22);
    // We are batch 22
    System.out.println(5 + 4);
    // 9
    System.out.println("5" + "4");
    // 54
    System.out.println("Text" + 5 + 3);
    // Text53
    System.out.println(5 + 3 + " would be the result of 5 + 3");
    // 8 would be the result of 5 + 3
    // If you start an operation with a string, Java will concatenate(add) every thing
    // as a text(string) after encountering a text.
    System.out.println(1 + 2 + "Java" + 1 + 3);
    // 3Java13
    // java does it as a math operation till it sees the text(string), and then after
    // it encounters a text it will just add as a text.
        System.out.println("Text" + (5+3) );
        // Text8
        // Using parentheses adds priority to operation, so anything that
        // is inside parentheses will be done before every thing else
        // in print statement.
        System.out.println("Text" + (5+3) + (4+6) );
        // Text810
        System.out.println("Text " + (5+3+4+6));
        // Text 18

    }

}
