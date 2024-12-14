package ClassObjectMethod;

public class AnimalTest {
    public static void main(String[] args) {
        Animal monkey = new Animal();
        System.out.println(monkey.color); // null
        System.out.println(monkey.age); // 0
        System.out.println(monkey.numberOfLegs); // 0

        // Instance variables(Object attributes)(Class variables), take
        // default value when they are unassigned.
        // For every object -> null
        // For int,long,byte,short -> 0
        // For double,float -> 0.0
        // For char -> '' (empty char)
        // For boolean -> false
        // we could assign values to instance variables.
        monkey.color = "brown";
        monkey.age = 13;
        monkey.numberOfLegs = 2;
        System.out.println(monkey.color); // brown
        System.out.println(monkey.age); // 13
        System.out.println(monkey.numberOfLegs); // 2

        Animal lion = new Animal();
        lion.color = "light brown";
        lion.age = 7;
        lion.numberOfLegs = 4;
        // You could see that lion and monkey are both animal and
        // they share the same properties(color,age,numberoflegs) however,
        // the value of these properties will(might) be different for
        // each animal object.

        // Calling a method for an object.
        lion.sleep();

        lion.move(11);

        lion.move(2);

        lion.move(9); //

        lion.sleep(); // raises to hundred
        lion.move(9);












    }
}
