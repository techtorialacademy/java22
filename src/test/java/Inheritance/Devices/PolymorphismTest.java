package Inheritance.Devices;

public class PolymorphismTest {
    public static void main(String[] args) {
        // We will practice polymorphism using SmartDevice -> WearableDevice -> SmartWatch
        // Is-A Relationship
        // Since SmarWatch extends to Wearable device, SmartWatch is a WearableDevice
        // Since WearableDevice extends to SmartDevice, WearableDevice is a SmartDevice.
        // Since SmartWatch extends to Wearable device and WearableDevice extends to SmartDevice,
        // SmartWatch is technically a SmartDevice.

        // Regular SmartDevice object
        SmartDevice smartDevice1 = new SmartDevice("techno",21);


        smartDevice1.turnOn(); // turnOn method from SmartDevice will be called

        System.out.println("_________________________________________________________________________________________");

        // Polymorphic Object (Parent Reference, ChildObject/SubClassObject)
        SmartDevice smartDevice2 = new WearableDevice("WristInnovations",72,"Silicone");
        // A WearableDevice is a SmartDevice, therefore I could point(assign) SmartDevice object with WearableDevice.
        System.out.println();
        smartDevice2.turnOn(); // turnOn method from WearableDevice class will be called as
        // we always look at the object initation of the rightside.

        System.out.println("_________________________________________________________________________________________");
        // Polymorphic Object (Parent Reference, (GrandChildObject)
        SmartDevice smartDevice3 =
                new SmartWatch("WristInnovations",44,"Leather",false);
        // A SmartWatch is a SmartDevice, therefore I could point(assign) SmartDevice object with SmartWatch.

        smartDevice3.turnOn(); // turnOn method from SmartWatch class will be called.

        // We have created 3 smartdevice object.
        // For all 3 objects, we have called turnOn method.
        // Depending on their object values all 3 object called turnOn methods from different classes.
        // Event though all 3 object had the same reference(SmartDevice), they all called different
        // methods depending on the object type on the right.













    }
}
