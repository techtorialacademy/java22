# Char Data Type
- In java a `char` is a short for 'character'. 
- This primitive data type is used to store single character. 
- Unlike other data type char can only hold single character.
- Size of this data type is 16-bit.
```java
char letter = 'T';
char num = '5';
char symbol = '&';
```
## Is `char` still used? 
* **Less Common Today**: It is still part of Java, however 
it is not necessary for modern applications. Nowadays 
string(text type) are more popular because it can hold
multiple characters and more versatile. 
## Why the `char` data type created? 
* When Java first created, `memory resources were 
very limited`, and it was efficient to store a single character
as a `char` data type, which only took 16 bits(2byte). 

## How is `char` related to ASCII and Unicode? 
1. ASCII(American Standard Code for Information Interchange)
    * ASCII is a 7-bit character encoding standard that represents 
   128 characters, including letters, digits and special symbols.
    * Each `char` in Java can represent characters from the ASCII
   table. For example, `A` has an ASCII value of `65`, and `a` 
   has a value of 97.
2. Unicode
    * Java char is based on `Unicode`, which is a more comprehensive
   version of ASCII table. 
    * Unlike ASCII, which is limited to 128 characters, Unicode
   supports 143000 characters, including symbols, emojis ...

#
**NOTE!**: `char` data type can be assigned with numerical value
or can be assigned with a value within single quotation. `''` 
When `char` data type is assigned with a numerical value, it 
finds the matching numerical value from `Unicode` or `ASCII` table
and then assigns itself with that character.
```java
char ch = 122;
System.out.println(ch); // This line will print letter `z`.
```

# Declaration, Initialization, Assignment, Reassignment, and Compound Assignment Operators
1. `Declaration`
   * Declaration is assigning data type to a variable. 
```java 
public class Test{
   public static void main(String[] args) {
      int var; 
      double number;
      char c1;
      long l2; 
      // All of the above is an example to declaration in Java programming.
      // These are called declaring a variable. 
   }}
```

2. `Initialization`
   * Initializing is assigning value to a variable.
```java 
public class Test{
   public static void main(String[] args) {
      int var; 
      double number;
      char c1;
      long l2; 
      // We are going to initialize the declared variables above. 
      var = 10;
      number = 17.9;
      c1 = '!';
      l2 = 456789876433333335678L;
      // variables are initialized above.
   }}
```
3. `Assignment, Reassignment` 
- The assignment operator `=` is used to store a value in a variable. It assigns the value 
on the right side of the operator to the variable on left. 
```java
int number = 6; // Variable number is assigned with value 6. 
int num1;
num1 = 8; // variable is assigned with value 8. Initialized the num1 with value 8.
```
- Reassignment is when we change the value of a variable after the first initialization. 
```java 
public class reassignment{

   public static void main(String[] args) {
      double d1 = 7;
      System.out.println(d1); // 7
      d1 = 19.8; // d1 is reassigned with value 19.8
      System.out.println(d1); // 19.8
      
      d1 = d1 + d1 + .4;
      
      System.out.println(d1);
      // The output will be 40.0
      
      d1 = 'y';
      System.out.println(d1);
      // The output will be 121.0
      // Since the char type has a numerical value, it assigns
      // double data type with its numerical value. 
      
      int num1 = 11;
      
      num1 = num1 + 4.0; // The compile time error

      System.out.println(num1);
      
      // We cannot change the data type of variable when reassigning.
      
      
      
   }
}
```

4. `Compound Reassignment Operators`
- Compound assignment operators are a shorter way of writing expressions where a variable
is modified and then assigned with a new value. 
   1. `+=`
      - This operator will add and then reassign.
      - `x += 5` is `x = x + 5`
   2. `-=`
      - This operator will subtract and then reassign.
      - `var -= 10` is `var = var - 10`
   3. `*=`
      - This operator will multiply and then reassign.
      - `x *= 5` is `x = x * 5`
   4. `/=`
     - This operator will divide and then reassign.
     - `var /= 10` is `var = var /= 10`
   5. `%=`
     - This operator will find remainder and then reassign
     - `var %= 3` is `var = var % 3 `












