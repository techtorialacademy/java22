package Abstraction.HomeSystem;

public class HomeLight implements SmartHomeDevice{
    private boolean isOn;
    private String brightnessLevel;
    // Let's create a constructor that assigns default values for instance variables.

    public HomeLight(){
        this.isOn = false;
        this.brightnessLevel = "%50";
    }

    @Override
    public void turnOn(){
        isOn = true;
        System.out.println("Light is now ON.");
    }

    @Override
    public void turnOff(){
        isOn = false;
        System.out.println("Light is now off.");
    }

    @Override
    public void deviceStatus(){
        if(isOn){
            System.out.println("The light is ON.");
        }else{
            System.out.println("The light is OFF.");
        }
    }
}
