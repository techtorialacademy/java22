package Inheritance.Devices;

public class SmartDevice {
    String brand;
    int batteryLife;

    private void smartDeviceSpecial(){
        System.out.println("Thank you for using Smartdevice");
    }

    // Constructor
    public SmartDevice(String brand, int batteryLife){
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    // Instance Methods/Object Behaviors
    void turnOn(){
        System.out.println(brand + " device is turning on.");
        System.out.println("This turn on method is from SmartDevice class.");
    }
    void turnOff(){
        System.out.println(brand + " device is turning off.");
    }

    SmartDevice returnObject(String brand, int batteryLife){
        return new SmartDevice(brand,batteryLife);
    }

    // Static method
    static void deviceInfo(){
        // general message about all smart devices
        System.out.println("Smart devices are electronic devices with advanced features.");
    }



}
