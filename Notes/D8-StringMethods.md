# String
## Common String Methods 

1. **IndexOf* Method
* **Return Type**: Integer Value
* **Description**: Returns the index of **first occurrence** of the specified string. Returns `-1` if the substring
is not found. 
```java
String s = "Java";
System.out.println(s.indexOf("a")); 
// 1 -> because the first `a` in the string is located at index `1`. 
System.out.println(s.indexOf("b")); 
// -1 -> because the given string value `b` doesn't exist in a string variable `s`. 

String s2 = "Programming";
System.out.println(s2.charAt(s.indexOf("a"))); 
// First the inner parentheses calculated, so first result we get is 
// s.indexOf("a") -> equals to 1
// We put the value 1 in the s2.charAt(1) method
// And the final result is  -> `r` <-

```

2. **ToLowerCase** && **ToUpperCase** Method
* **Return TYpe**: They return another string value
* **Description**: They will give us the uppercase or lowercase version of the string. 
* **Example**
```java 
String drink = teA; 
String lower = drink.toLowerCase();
String upper = drink.toUpperCase();

// Let's also look at the immutability
System.out.println(drink); // teA -> No change in original string because it is not reassigned with any value.
System.out.println(lower); // tea
System.out.println(upper); // TEA
```
3. **StartsWith** && **EndsWith** Method
* **Return Type**: Boolean value
* **Description**: They will check if the string ends with/starts with given sequence of characters.
* **Example**
```java 
// Both starts and ends with method is case sensitive.
String s = "Java Programming";
System.out.println(s.endsWith("ing")); // true
System.out.println(s.endsWith("Ing")); // false -> this method is case sensitive

System.out.println(s.startsWith("Java ")); // true

System.out.println(s.startsWith("Java Programming")); // true -> string starts with itself.
System.out.println(s.endsWith("Java Programming")); // true -> string ends with itself.
```
4. **Contains** Method
* **Return Type**: Boolean Value
* **Description**: It will check if the string contains given sequence of characters.(case-sensitive.)

5. **SubString** Method
* **Return Type**: It returns another string
* **Description**: Extracts a part of the string starting from `beginIndex` up to 
`endIndex`. However, the `endIndex` will not be included in final result. 
```java 
//             0123456789012345
String text = "Java Programming";
System.out.println(text.substring(2)); // Starting from index 2 to the end of string. -> va Programming
System.out.println(text.substring(0,8)); // Java Pro
```
6. **Replace** Method
* **Return Type**: String value
* **Description**: Replaces **all** occurrences of the target sequence with the replacement sequence.
* **Example**
```java
// Syntax
String s = "anything";
String newStr = s.replace("targetSequence", "replacementSequence");
```
```java
String str = "Java Programming";
System.out.println(str.replace("java","Python")); // "Java Programming" -> str has `Java` not `java`

System.out.println(str.replace("a","e")); // "Jeve Progremming" -> all the a's replaced with e

```






