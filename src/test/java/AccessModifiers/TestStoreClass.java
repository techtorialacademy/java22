package AccessModifiers;

public class TestStoreClass {
    public static void main(String[] args) {
        Store dtStore = new Store("DN5178","Downtown");

        // dtStore.storeSecretCode; // No, storeSecretCode is private variable, which could only be accessed in same class.

        dtStore.updateSecretCode("UW6823");// The method has no access modifier which could be accessed
        // only in the same package. Since this class is in the same package as Store class we could access this method.

        dtStore.displayDetails();

    }
}
