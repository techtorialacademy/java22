package ClassObjectMethod;

public class StaticNonStaticBlock {
    // Static variable
    static String staticMessage;

    // Non-static variable
    String instanceMessage;

    // Let's give a message to a user every time a class loads.
    static{
        staticMessage = "This is initialized in static block";
        System.out.println("Static block is executed."+staticMessage); // 1
    }
    // Let's give a user a message every time an object is created.
    {
        instanceMessage= "This is initialized in non-static block.";
        System.out.println("Non-static block is executed"+instanceMessage); // 2
    }

    public static void main(String[] args) {
        StaticNonStaticBlock test = new StaticNonStaticBlock();
        System.out.println("Hello World!"); // 3
    }
}
