package Abstraction.HomeSystem;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {

    public static void main(String[] args) {
        HomeThermostat thermostat = new HomeThermostat();

        thermostat.deviceStatus();

        SmartHomeDevice thermostat1 = new HomeThermostat();

        thermostat1.turnOn();

        thermostat1.deviceStatus();

        SmartHomeDevice homeLight = new HomeLight();

        homeLight.deviceStatus();

        homeLight.turnOn();

        homeLight.deviceStatus();

        homeLight.turnOff();

        homeLight.deviceStatus();

        // Just like there is 2 ways to createa  list.

//        List<Object> list = new ArrayList<>();
//        ArrayList<Object> list2 = new ArrayList<>();


    }
}
