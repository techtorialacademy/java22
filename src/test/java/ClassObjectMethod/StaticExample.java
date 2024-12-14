package ClassObjectMethod;

public class StaticExample {
    static String staticVariable;
    String str; // non-static variable

    public static void main(String[] args) {
        StaticExample firstObject = new StaticExample();
        StaticExample secondObject = new StaticExample();
        StaticExample thirdObject = new StaticExample();
        // What happens when a non static variable is assigned for one object?
        firstObject.str = "This is the value assigned for first object.";
        thirdObject.str = "This is for third object.";
        System.out.println(firstObject.str);
        // How about the value for non static variable for the second object.
        System.out.println(secondObject.str); // null // because value for nonStatic is not assigned for second
        // object. nonStatic variable can have different values among objects from that class.
        System.out.println(thirdObject.str); // This is for third object.
      // Non static variables(instance variables without a static keyword) could have different
        // values among objects.

        // STATIC variables share the same value among ALL objects.
        System.out.println(secondObject.staticVariable); // null // because we haven't assigned this value yet.

        thirdObject.staticVariable = "Shared Value";

        System.out.println(firstObject.staticVariable); // Shared Value
        System.out.println(secondObject.staticVariable); // Shared Value

        secondObject.staticVariable = "Hello";

        System.out.println(thirdObject.staticVariable); // Hello
        System.out.println(firstObject.staticVariable); // Hello

        // Once a value of a static variable is changed, it is changed for all objects of the class.
        // Static variables usually called using class name.
        System.out.println(StaticExample.staticVariable); // Hello







    }

}
