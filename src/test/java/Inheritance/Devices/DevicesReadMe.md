# MultiLevel Inheritance
* `SmartDevice` is the parent class
* `WearableDevice` extends `SmartDevice` class. 
* `SmartWatch` class extends the `WearableDevice`

## Requirements
1. **Class1: SmartDevice**
    * *Attributes*
        * `brand`: The brand of the device
        * `batteryLife`: The device's battery life in hours.
    * *Methods(Behaviors)*
        * `turnOn()`: Print a message indicating the device is turning on.
        * `turnOff()`: Print a message indicating the device is turning off.
        * `static deviceInfo`: Print a general message about smart devices.
2. **Class2: Wearable Device**(ChildClass)
    * *Attributes*
        * `strapMaterial`: Material of the wearable strap
    * *Additional/Behavior*
        * `wear()`: Prints a message that devices is being worn.
3. **Class3 SmartWatch**
    * Inherits all attributes and methods from `Wearable Device Class`
    * *Additional Attributes*
        * `heartRateMonitor`: Boolean value indicating whether the watch has a heart rate monitor or not. 
    * *Additional Methods*
        * `checkHeartRate`: Prints a message simulating a heartrate check if the smartwatch has a heartRateMonitor.