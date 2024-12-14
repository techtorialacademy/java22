package Inheritance.Devices;

public class DeviceTest {
    public static void main(String[] args) {
        // Let's learn about all smart devices.
        SmartDevice.deviceInfo();

        SmartDevice genericDevice = new SmartDevice("GenericBrand",24);
        // What can I do with the generic Device object?
        genericDevice.turnOn();
        genericDevice.turnOff();

        System.out.println();

        // Creating an instance of the WearableDevice
        WearableDevice fitnessBand = new WearableDevice("FitBand",10,"Silicone");
        fitnessBand.turnOn(); // turnOn method is inherited from SmartDevice class
        fitnessBand.wear(); // This is a special behavior specific to WearableDevice Objects.
        fitnessBand.turnOff(); // turnOff method is inherited from SmartDevice class

        System.out.println();

        SmartWatch appleWatch = new SmartWatch("Apple",18,"Leather",true);
        appleWatch.turnOn(); // This is inherited from SmartDevice
        appleWatch.wear(); // This method is inherited from WearableDevice class
        appleWatch.heartRateCheck(); // This method is specific to smart watches.
        appleWatch.turnOff(); // This method is inherited from SmartDevice class.

    // Is-A relationship in Java
        // Is SmartWatch a SmartDevice? (Based on our implementation) // yes
        // Is SmartWatch a WearableDevice? (Based on our implementation) // yes
        // Is SmartDevice a WearableDevice? (Based on our implementation) // no

    // This relationship will help us understand polymorphism in java.
    // 3rd concept of OOP.






    }
}
