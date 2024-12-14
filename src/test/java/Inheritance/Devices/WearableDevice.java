package Inheritance.Devices;

public class WearableDevice extends SmartDevice{
    String strapMaterial; // Every wearable device object, should have a strap material

    // create a constructor that matches, super/parent classes constructor
    public WearableDevice(String brand,int batteryLife,String strapMaterial){
        //  I would like to call constructor from the super/parent class.
        super(brand,batteryLife);
        this.strapMaterial = strapMaterial;


    }

    @Override
    void turnOn(){
        System.out.println("Please Wait Wearable Device To Load");
        System.out.println("Wearable device is turning on!!!");
        System.out.println("This turn on method is from WearableDevice class.");

    }

    @Override
    public WearableDevice returnObject(String brand, int batteryLife){
        return null;
    }

    void wear(){

        System.out.println("You are wearing a " + brand + " device with a " + strapMaterial + " strap.");
    }

    // Create a copy of given device and return it
    public WearableDevice copyOf(WearableDevice wearableDevice){
        WearableDevice wearableDevice1 = wearableDevice;
        return wearableDevice1;
    }
    // What is the return type of copyOf method?
    // WearableDevice
    // Let's override this method

    // Method hiding.
    static void deviceInfo(){
        // general message about all smart devices
        System.out.println("Smart devices are electronic devices with advanced features.");

    }

}
