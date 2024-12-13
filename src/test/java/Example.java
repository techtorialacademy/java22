
// If I want to create a public class, that class must have the same name as the java file.
// What is the name of the java file?
class Something{

}
public class Example{
    // Classes help us to create behaviors and variables for the objects.



}

// How many class are there in Example.java file?
// -> 2 classes are in the Example.java file.

// We could create a class in another class
class Outer{
    class Inner{

    }
    class C{}
    // Class C is not accessible by other classes. Only class Example can acces the C.
    public class D{

    } // Even though class D is an inner class since it is public it is accessible everywhere.
}
// public is one of the access modifiers in java.
// Whatever is public, that is accessible everywhere in project.

// Inner classes are only accessible via outer classes.
