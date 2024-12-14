package WhileLoop;

public class While1 {
    public static void main(String[] args) {
//        while(true){
//            System.out.println("When the condition is true this will be printed");
//        } // Infinite loop
        // Execute the body of the while loop below 3 times
        // I want boolean expression in while to be true for the first 3 times, then be false
        int count = 0;
        while(count < 3){
            System.out.println("Winter is about to start.");
            // Every time this loop is executed I have to increase the count
            count += 1;
        }

        System.out.println(count); // 3
    }
}
