package Abstraction.Vehicles;

public class CarManagement {

    public static void main(String[] args) {
        Vehicle car = new Car("RFT4983","Tech",7);

        ElectricVehicle electricCar2 =
                new ElectricCar("ELT8153","Tech",6,90);

        car.start();

        car.stop();

        electricCar2.charge();
















    }




}
