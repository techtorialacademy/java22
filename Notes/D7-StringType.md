# String Object

## What is an Object in Java? 
- An object in java is an instance of a class that has state(attributes,fields) and behavior(methods).
- String in Java is an **object** because it is an instance the `String` class, which has both
attributes(e.g., the character sequence it stores) and methods(e.g., length(),substring() etc.)

## What makes String an Object? 
- String is a reference type, created from `String` class, unlike primitives which are types directly 
representing values. 

## Features of String
1. **Immutable**
    * Once a `String` object is created, it cannot be modified. Any modification creates a new `String` object.
    * This immutability improves security, makes String objects `thread-safe`, and helps with memory optimization. 
   
2. **Methods For String Manipulation**
 
### Using String
1. Creating a String Object
```java
String school = "Techtorial"; 
```
2. String Object Uses **Indexes** To Access Each Element 
```java
//                    0123   // These are the index numbers of the characters.
String programming = "Java"; 
// First letter in string will have the index number as 0
// Last letter in string will have the index number as 1 less than total length of a string.
// Length of a string means total number of characters in a string.
String test = "Java Is Fun!";
// What is the length of a string above? 
// 12 -> spaces in string is also counted as characters.
```
## Common String Methods
1. **Concat** Method
* Concatenates(joins) the given string to the end of another string.
* Syntax Formula
```
stringObjectName.concat(anotherStringObject);
```
* Example Usage
```
String s = "Java";
String s2 = "Programming";
System.out.println(s.concat(s2));
// JavaProgramming
System.out.println(s);
// Java   // Did we re-assign the variable s above? -> No -> which means the s won't change its value.
System.out.println(s2);
// Programming  // Did we re-assign the variable s2 above? -> No -> which means the s2 won't change its value.
```
* **NOTE!**: Since the string object is immutable, it will never change its value **UNLESS** the string object 
is reassigned.

2. **Length** Method
* **Return Type**: integer value
* **Description**: Returns the total number of characters in a string. 
* **Example**:
```java
String s = " Java! ";
System.out.println(s.length()); // 7
```

3. **CharAt** Method
* **Return Type**: char value
* **Description**: Returns the character at specific **index**. 
* **Caution**: When index number that doesn't exist in string used it will throw
**StringIndexOutOfBoundsException**. 
* **Example**:
``` java
String text = "Hello Java!";
System.out.println(text.charAt(3)); // l
System.out.println(text.charAt(1)); // e

String s = 't';
System.out.println(s); // Compile time error
// Single quotation means that data type is `char`.
// `char` values cannot directly be assigned at String.
String character = text.charAt(6); // Output: compile time error
// because `charAt` method d gives us a char value which cannot be assigned String directly. 

// If you want to assign output of charAt method directly to a String object, you can add to empty string. 
text = "Hello Java!";
String ch = "" + text.charAt(4); // the value of ch will be o.



```








