# Class & Object

## What is a Class? 
* A class is a blueprint for creating objects in Java. It defines properties(variables) and 
behaviors(methods) that the objects of the class will have. 
* Think of a class as a template. For example, a `Car` class might define attributes like `color`, 
`model`, and behaviors like `drive()` or `stop()`. 

## What is an Object? 
* An object is an instance of a class. When you create an object, you are bringing the blueprint(class)
to life. 
* Each object can have its own value for the attributes defined in the class. 

#### Example
```java
class Car{
    String color; // Attribute (Property of the class) (Class Variable)
    void drive(){ // Method for the Car class(behavior for the object)
    System.out.println("The car is driving. ");
    }
    
}

public class TestCars{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Black";
        // Now the color of the myCar object is Black
        Car yourCar = new Car();
        yourCar.color = "Red";
        System.out.println(myCar.color); // Black
        System.out.println(yourCar.color); // Red
    }
    
}
```