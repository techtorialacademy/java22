package ForLoop.PrePost;

public class PrePost1 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a++);  // 5 // -> increase the value of the a by 1\
        // post increment original value is used in `a++` then in the next usage the value is increased.

        System.out.println(a); // 6

        System.out.println(a == a++); // true
        int b = 8;
        System.out.println(b++ == b); // false
        // Post Decrement
        // It uses the current value where the `variable--` is called. and in the next usage value of
        // `variable` will be decreased by 1

        int num1 = 10;
        System.out.println(num1);
        System.out.println(num1 - num1--);
        System.out.println(num1-- - num1);

      // Pre Increment and PreDecrement
      // We change the value at the spot.
        int number = 10;
        System.out.println(++number); // 11
        System.out.println(number); // 11
        System.out.println(--number); // 10

        number = 1001;
        System.out.println(number-- == ++number); // Regardless of the value of number, this statement will
        // always be true.
    }

}
