package ExceptionPractices;

public class Exception1_Intro {

    public static void main(String[] args) {
        String s = "Hello";

        // What is the value of s?
        // Although instance variables take default values, local variables doesn't take default values.
        // Local variables are, variables that are defined in methods.
        // There is no value for s not even null.
        try {
            System.out.println(s.charAt(1));   // StringIndexOutOfBoundsException
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(" !!!!  EXCEPTION  !!!! ");
            System.out.println("We used an invalid index, we should be more careful");
        }
        System.out.println("This is a very important message that should be shown every time");

      // We could cast objects to each other
        // Since everything is an object
        // We could cast parent objects to child objects as long as the value of the parent object
        // is compatible with child object.















    }

}
