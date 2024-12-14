package Abstraction.HomeSystem;

public interface SmartHomeDevice {
    void turnOn();
    void turnOff();
    void deviceStatus();
    // All the methods above are public,and abstract.
    // Interface implicitly(automatically) makes methods public and abstract.
}
