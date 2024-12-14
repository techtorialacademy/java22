package ClassObjectMethod;

public class Animal {
    // What is an instance variable?
    // Instance variable is created in the class, and outside of every other code block in the
    // java class
    String color;  // Instance variable, attribute for Animal objects that will be created from this class.
                   // Value for the color is not assigned, so each animal color could be assigned their
                   // after the creation
    int numberOfLegs;
    int age;
    int energyLevel;

    // Methods
    // Methods in class is used to show which action the objects out of this class can take.
    // It defines the behaviors of the objects.
    // To create a method
        // 1. Access modifier (For now we'll use public only) accessible everywhere
        // 2. Return type (If you want to return a specific value you could, if not don't return anything(void))
        // 3. name of the method
        // 4. necessary parameters(values) that the method needs.
        // 5. Define the block of the method with curly braces
    public void sleep(){
        System.out.println("Now the animal is sleeping.");
        // Energy level of the animal will be increased to 100
        energyLevel = 100;
        System.out.println("Since the animal slept energy level of animal is "+energyLevel);
    }

    // Let's create a move method that will take number of moves as an int parameter.
    // For every move animal will lose 10 point of energy.
    // print out whether animal is able to complete the move,
    // if so, print out the level of energy left.
    public void move(int numberOfMoves){
        int maximumMov = energyLevel / 10;
        if(numberOfMoves > maximumMov ){
            System.out.println("Animal cannot complete this number of moves.");
            System.out.println("Animal can perform maximum "+ maximumMov + " moves.");
        } else if (numberOfMoves <= maximumMov) {
            energyLevel = energyLevel - (numberOfMoves * 10);
            System.out.println("Animall will complete this move and left energy is " + energyLevel);
        }
    }



}
