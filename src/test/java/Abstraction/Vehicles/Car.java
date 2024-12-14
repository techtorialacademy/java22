package Abstraction.Vehicles;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String registrationNumber, String brand, int seatingCapacity){
        super(registrationNumber,brand);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void start(){
        System.out.println(getBrand() + " car with registration " + getRegistrationNumber() + " is starting. ");
    }

    public void showSeatingCapacity(){
        System.out.println("Seating capacity: " + seatingCapacity + " passengers.");
    }


}
