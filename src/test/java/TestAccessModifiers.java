import AccessModifiers.Store;

public class TestAccessModifiers {
    // This class is outside the same package of Store class.
    public static void main(String[] args) {
        Store st1 = new Store("St123","Downtown");
        //System.out.println(st1.storeLocation); -> 'storeLocation' is not public in 'AccessModifiers.Store'.
        // Cannot be accessed from outside package

        // st1.updateSecretCode("test"); -> I cannot call this method because it is package protected.

        st1.displayDetails(); // This method can be called as it has public access modifier.

        // How do you call the static variables or methods?
        // You could use objects to call static variables or methods, HOWEVER, recommended way to call
        // static variables or methods is to use CLASS NAME
        Store.displayCompanyName(); // As the method is public we are able to call here.
        // Also method is static method, so we can call this using the class name.


    }
}
