public class Vehicle {
    int numberOfWheels = 8;
    int numberOfOccupancy = 7;
    String brand = "Techtorial";
    boolean canRun = true;
    // To be able to run any java code we must use main method.
    public static void main(String[] args) {
        // Create an object from a class
        Vehicle vehicle1 = new Vehicle();
        // Let's find out how many wheels does the vehicle1 have?
        System.out.println(vehicle1.numberOfWheels);
        // What is the data type of vehicle1 object?
        // Vehicle
        System.out.println("Brand of the vehicle is " + vehicle1.brand);

        vehicle1.numberOfWheels = 4;
        System.out.println("Updated number of wheels is " + vehicle1.numberOfWheels);


    }


}
