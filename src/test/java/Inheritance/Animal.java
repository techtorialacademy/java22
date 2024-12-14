package Inheritance;

public class Animal {
    void eat(){
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("This dog barks!!");

    }
}

class runner{
    public static void main(String[] args) {
        // I will create a dog object
        Dog dog = new Dog();
        // is there an eat() method in Dog class?
        // No, however the Dog class gets eat method(this behavior) from Animal class as it inherits.
        dog.eat(); // Dog class inherits this method from the Animal class.
        dog.bark();

        // Inheriting only happens one way top to bottom. Parent class doesn't get child class behaviors.

        // is a and has a relation?
        // A child class is a specific type of the parent class.
        // Since the Dog class extends(inherits) the Animal class, we could say,
        // Dog is an Animal.


    }
}

