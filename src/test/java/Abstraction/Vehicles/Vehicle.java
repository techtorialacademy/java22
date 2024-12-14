package Abstraction.Vehicles;

public abstract class Vehicle {
    // Two fields that will be used by all vehicle types
    private String registrationNumber;
    private String brand;

    // Constructor to assign instance variables
    public Vehicle(String registrationNumber,String brand){
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    // Let's create some common method that should be implemented by subclasses(childclasses).
    public abstract void start();

    // Concrete method
    public void stop(){
        System.out.println(brand +" vehicle with registration " + registrationNumber + " is stopping.");
    }

    // Let's create getter and setter methods for encapsulation.
    public String getRegistrationNumber(){ return registrationNumber; }
    public String getBrand(){ return brand; }
    public void setRegistrationNumber(String registrationNumber){ this.registrationNumber = registrationNumber; }
    public void setBrand(String brand){ this.brand = brand; }












}
