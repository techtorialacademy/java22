package AccessModifiers;

public class Store {
    // Public variable
    public static String companyName = "Techtorial Stores";
    // Each store will have a secret code
    private String storeSecretCode;


    // Package protected instance variable for each store object
    String storeLocation; // Default access modifier(No modifier)

    // Constructor to initialize the store's location and secret code
    public Store(String storeSecretCode, String storeLocation) {
        this.storeSecretCode = storeSecretCode;
        this.storeLocation = storeLocation;
    }

    // public method to display store details.
    public void displayDetails(){
        System.out.println("Store Location: "+ storeLocation);
        System.out.println("Store Secret Code: "+ storeSecretCode);
    }

    // Let's create a package private method to update store's secret code?
   void updateSecretCode(String newCode){
        this.storeSecretCode = newCode;
   }
   // Create a public method to display company name.
    public static void displayCompanyName(){
        System.out.println("Company Name: " + companyName);
    }



}
