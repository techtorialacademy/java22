# Logical Operators in Java

| Operator    | Symbol | Description                                                              |
|-------------|--------|--------------------------------------------------------------------------|
| Logical AND | `&&`   | Returns `true` if **both** conditions are true                           |
| Logical OR  | `\|\|` | Returns `true` if **at least one** condition is true                     |
| Logical NOT | `!`    | **Negates** the boolean value (inverts `true` to `false` and vice versa) |

## Logical Negation `!`
* The `!` operator negates or inverts the value of a boolean. If the value is `true`, 
`!` makes it `false`, and vice versa. 
```java
boolean isRaining = true;

boolean canGoOutside = !isRaining; // Negates isRaining

System.out.println(canGoOutside); // Output: false since the isRaining variable is true.
```

## Logical And `&&`
- The `&&` operator evaluates to `true` only if **all** the conditions in the expression are `true`.
If any one of the operand is `false` the result is `false`.
```java
// In order to enter a club, the customer needs to be over 21 and must have the ticket.
int age = 22;
boolean hasTicket = true;
boolean canEnter = (age >= 21) && hasTicket; // Both must be true
System.out.println(canEnter); // Output: true since both conditions given were true.
```
```java
// In order to enter a club, the customer needs to be over 21, must have the ticket and must have a partner.
int age = 22;
boolean hasTicket = true;
boolean hasPartner = false;
boolean canEnter = (age >= 21) && hasTicket && hasPartner; // All must be true to get true result
System.out.println(canEnter); // false -> since one of the operand is false all result will be 
// evaluated to false.
```

## Logical Or `||`
* The `||` operator evaluates to `true` if at least **one** of the operand is `true`. 
* Useful when only one of several conditions needs to be met. 
```java
// I could get a rest if it is weekend or if it is holiday or if the kids at grandparents.
boolean isWeekend = false;
boolean isHoliday = true; 
boolean kidsAtGrandP = false; 

boolean canRelax = isWeekend  ||  isHoliday  ||  kidsAtGrandP;
// the value of can relax is true since one of three given condition was true which isHoliday.

```
```java
// I could get a rest if it is weekend or if it is holiday or if the kids at grandparents.
boolean isWeekend = false;
boolean isHoliday = false; 
boolean kidsAtGrandP = false; 

boolean canRelax = isWeekend  ||  isHoliday  ||  kidsAtGrandP;
// the value of can relax is false since none of three given condition was true.
```           

### Summary: 
* **Logical And `&&`**: requires all conditions to be true.
* **Logical Or `||`**: requires at least one of the conditions to be true. 
* **Logical Not `!`**: inverts a boolean value. 

### Note!
- If `&&` operator and `||` operator is used in same operation, `&&` operator will be calculated before `||` operator.


# If Statement
* If statement is a conditional statement used to execute a block of code only if a specific condition is `true`.
It's a fundamental tool for decision-making in programming, allowing programmers to control the flow of program
based on different conditions.
```
if (condition){
    //inside of an if statement 
        } 
```
* **NOTE**: Code inside the curly braces could also be referred as a block of code. 
```java
public class test{
    public static void main(String[] args) {
      // If the person can buy the product let's print you could buy the product.
      double usersMoney = 2349.12;
      double theProductPrice = 110; // tax included.
        // Can user buy the product? 
        boolean canBuy = usersMoney >= theProductPrice;
        // The condition above will be true when the user has enough money to buy product, false otherwise.
        if (canBuy){
            System.out.println("Yes you could buy the product");
        }
        // If the variable canBuy is false, the code inside the if block won't be executed. 
        // Therefore, there will not be any output displayed. 
        
    }
}
```

# If Else Statement
* If...else statement allows programmers to specify and **alternative block of code** to execute
when the previous **condition is false**. 
* Syntax of 
```
if (condition){
  // Code to execute when the condition is true
}else{
  // Code execute if the previous condition is false
}
// Always only one of the blocks is executed. 
```
* Example
```java
public class test{
public static void main(String[] args) {
    // IF the weather outside is hotter than 85 print It's hot outside. 
    // otherwise print the weather is pleasant.
    int temperature = 85;
    if (temperature > 85 ) {
        System.out.println("It's hot outside.");
    }else{
        // This block of code will only be execute when the temperature is not above 85.
        System.out.println("The weather is pleasant.");
    }
    }
}
```

# Else If Statement
* Else if statement is useful when there is multiple conditions to check. You can add as many 
`else if` conditions as needed. In an if statement with multiple `else if`, the first condition 
that evaluates to `true` will execute, and the rest will be ignored.
* Syntax
```
if (condition1){
    // Code to execute when condition1 is true
}else if(condition2){
    // Code to execute if condition2 is true
}else{
    // Code to execute if none of the above conditions are true.
}
```
```java

public class question{
    public static void main(String[] args) {
        if (true){
       System.out.println("1"); 
        }
        else if(false){
        System.out.println("2");
        }
        else if(true){
         System.out.println("3");
        }
        else if(true){
        System.out.println("4");
        }
        else{ 
            System.out.println("5"); 
        }
        
        // The output of the code above is 1 because when we encounter a true statement rest of the conditions 
        // are ignored.
        
    }
    
}

```
```java

public class question{
    public static void main(String[] args) {
        if (false){
       System.out.println("1"); 
        }
        else if(false){
        System.out.println("2");
        }
        else if(true){
         System.out.println("3");
        }
        else if(true){
        System.out.println("4");
        }
        else{ 
            System.out.println("5"); 
        }
        
        // It will be only 3, as soon as we encounter a condition that evaluates to `true` rest will be ignored.
        
    }
    
}

```

```java

public class question{
    public static void main(String[] args) {
        if (false){
       System.out.println("1"); 
        }
        else if(false){
        System.out.println("2");
        }
        else if(false){
         System.out.println("3");
        }
        else if(false){
        System.out.println("4");
        }
        else{ 
            System.out.println("5"); 
        }
        
        // It will be 5, as none of the conditions above else statement is true
        
    }
    
}

```

```java

public class question{
    public static void main(String[] args) {
        if (false){
       System.out.println("1"); 
        }
        else if(false){
        System.out.println("2");
        }
        else if(false){
         System.out.println("3");
        }
        else if(false){
        System.out.println("4");
        }
        else{ 
            System.out.println("5"); 
        }else{
            System.out.println("6");
        }
        
        // Compile time error, `if-else` statement cannot have more than 1 `else`.
        // `else` statement must always be placed as a last block in the `if-else`. 
        
        
    }
    
}

```

```java

public class question{
    public static void main(String[] args) {
        if (false){
       System.out.println("1"); 
        }
        else if(true){
        System.out.println("2");
        }else{
        System.out.println("3");
        }
       
        if (false){
       System.out.println("4"); 
        }
        else if(true){
        System.out.println("5");
        }else{
        System.out.println("6");
        }
       
        
        //  output is 
        // 2
        // 5
         
    }
    
}
```







