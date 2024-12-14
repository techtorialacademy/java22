class Car{
    String color; // Attribute (Property of the class) (Class Variable)
    void drive(){ // Method for the Car class(behavior for the object)
        System.out.println(" The car is driving. ");
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