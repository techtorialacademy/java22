package Abstraction.Vehicles;

public class ElectricCar extends Car implements ElectricVehicle{
    private int batteryPercentage;

    public ElectricCar
            (String registrationNumber,String brand, int seatingCapacity, int batteryPercentage){
              super(registrationNumber,brand,seatingCapacity);
              this.batteryPercentage = batteryPercentage;
    }

    @Override
    public void charge(){
        System.out.println("Electric vehicle is charging.");
        batteryPercentage = 100;
        System.out.println("Electric vehicle is charged.");
    }





}
