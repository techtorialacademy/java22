package Inheritance.Flowers;

public class Rose extends Flower{
    // I want to call constructor of super|parent class
    boolean isThornsCleaned;
    public Rose(String color,String name, double price,int size){
      // How could I access my parent class instance variables
        super.color = color;
        super.name = name;
        super.price = price;
        super.size = size;



        this.isThornsCleaned = true;

    }
}
