# Exception Hierarchy
1. **Throwable**
* The base class for **all** exceptions and errors in Java.
* Every **error** or **exception** we encounter is part of this family. 

2. **Error**
* Error is a direct subclass of Throwable, represents critical issues in the JVM, 
like running out of memory or a stack overflow.
* These are problems we **cannot** or **should not** handle in our program.
They usually mean something is very wrong at the system level. 
* **Examples**
    - **OutOfMemoryError**: Happens when the program runs out of memory to allocate objects.
    - **StackOverflowError**: Occurs when a program keeps calling itself too many times.
  
3. **Exception**
* Exception calss is a direct subclass of Throwable represents problems in the code
we **can/should** handle.
* It has two types:
    1. **RunTime Exception**:
        * Runtime problems caused by bad code logic.
        1. **NullPointerException**
            * Happens when you try to use a `null` value as if it were an object.
            ```java 
            String s = null;
            System.out.println(s.length());
           ```
        2. **ArithmeticException**
           * Happens when you try to do an illegal math operation, like dividing by 0.
            ```java 
            int a = 10/0; // ArithmeticException: You can't divide by 0.
           ```
        3. **ClassCastException**
            * Happens when we try to cast an object to another type it is not compatible with.
            * For example, in Java we could cast objects because everything is an object 
            however, the values should be compatible.
            ```java 
            Object o = new ArrayList<>();
             String s = (String)o;
           // this will throw classcast exception because even though I could cast
           // parent object to child object value should be compatible. In here the 
           // value of the object is not compatible to string type.  
            ```
        4. **IndexOutOfBoundException**
            * Happens when we try to acces an index that doesn't exist. 
            ```java 
            int [] nums = {1,2,3};
            System.out.println(nums[4]); 
            // ArrayIndexOutOfBound exception: Index 4 is out of bounds. 
           String s = "Hello";   System.out.println(s.charAt(11));// StringIndexOutOfBounds exception. 

           ```
        5. **NumberFormatException**
         * Happens when we try to convert a string into a number, but string is not in the right
          format.
          ```java 
          String s = "h";
          int num = Integer.parseInt(s); // NumberFormatException.
       ```
    2. **CheckedExceptions**
        * Things that java forces us to handle.
       
## Try-Catch Blocks
* Java uses `try-catch` blocks to protect parts of code that might fail.
* The `try` block contains the code that could throw exceptions.
* The `catch` block handles the exception, prevent the program from crashing.
* **How Does It Work?**
    - When an exception occurs in the `try` block, Java immediately jumps to `catch` block.
    - If there is no exception, or catch block is not looking for that specific exception
     then the catch block is skipped.
* **Finally Block**(Optional)
    * Code inside the `finally` block **always runs**, whether an exception occurs or not.
    * Useful for cleanup tasks(like closing files or connections).
```java 
    try{
    // Code that might throw an exception
        }
        catch(SpecificExceptionType e ){
    // handle the exception
        // we can decide what we are going to code, when there is exception here.
        }
        finally{
          // Optional Block: Executes Always.
        }
```
       