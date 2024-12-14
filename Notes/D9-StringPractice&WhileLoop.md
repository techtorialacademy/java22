## Common String Methods
1. **Trim** Method
* **Return Type**: String
* **Description**: Removes whitespaces from the beginning and end of the string. 
* **Example**
```java 
String textDisplayedOnWebPage = " Software Testing   ";
// Whitespaces at the start or end of the string might cause unexpected validation results for
// our testing. 
String expectedText = "Software Testing";

// If we compare expected and actual text displayed on web page
boolean validationResult = textDisplayedOnWebPage.equals(expectedText); // Value of validationResult -> false

// Since the spaces at the beginning and end of the string is not making a difference for a user
// we could disregard whitespaces at the beginning and end. 
boolean validationText = textDisplayedOnWebPage.trim().equals(expectedText); // value of this validation is -> true
```

# While Loop
- The `while` loop is a control structure in *Java* that allows you to **repeat a block of code** as long as 
a specified condition is `true`. It's useful when the number of iterations isn't known beforehand,
allowing flexible, condition based repetition.
- **Syntax**
```java 
while(condition){
    // Code to be executed repeatedly as long as the condition is true
        } 
```
* **Condition**: A boolean expression that controls the loop's execution. If `true`, the loop body
execute; if false, the loop stops. 
* **Loop Body**: The code inside the `{ }` is the block that runs repeatedly.
## Key Points
1. **Condition Based Execution**
    * The `while` loop check the condition before entering the loop. 
2. **Infinite Loops**
    * If the condition is not updated in the loop body(if the condition never becomes false), the loop will 
   continue indefinitely. 
3. **Flexible Iterations**
    * **Iteration**: One execution of a loop body is called `one iteration.`
    * Useful for where you don't know exact number of iterations in advance.
    * **Example**: Continuously asking for valid input until the user provides a correct value. 
   
# Post/Pre Increment/Decrement

## Post-Increment and Post-Decrement
* In java **post-increment** and **post-decrement** are operators that **modify the value of a variable by 1**
but return the original value before the **change**. 
### Post-Increment
* **Syntax:** `variable++`
* **Effect**: The variable's value increases by 1, but the original value is used first in the expression
where `variable++` is called. 















