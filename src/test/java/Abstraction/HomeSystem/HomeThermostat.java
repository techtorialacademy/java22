package Abstraction.HomeSystem;

public class HomeThermostat implements SmartHomeDevice{
    private boolean isOn;
    private int currentTemperature;

    public HomeThermostat(){
        this.isOn = false;
        this.currentTemperature = 70; // current temperature value
    }

    @Override
    public void turnOn(){
        isOn = true;
        System.out.println("Thermostat is on.");
    }

    @Override
    public void turnOff(){
        isOn = false;
        System.out.println("Thermostat is now off.");

    }

    @Override
    public void deviceStatus(){
        if(isOn){
            System.out.println("The thermostat is on.");
        }else{
            System.out.println("The thermostat is off.");
        }
    }
}
