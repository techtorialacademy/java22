package ForLoop;

public class ForLoop1_Intro {
    public static void main(String[] args) {
        // Let's print numbers from 10 to 1 inclusive in a decreasing order.
        // First with while loop, then with for loop.
        int num = 10;
        while( num >= 1 ){
            System.out.println(num--);
        }

        // Let's print numbers from 10 to 1 inclusive in a decreasing order.
//
//        for( ; ; ){
//            System.out.println("Infinite loop");
//        }
        for(int number= 10; number >= 1 ; number-- ){
            System.out.println(number);
        }




    }

}
