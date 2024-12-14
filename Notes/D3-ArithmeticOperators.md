# Arithmetic Operators In Java
- Arithmetic Operators are symbols used in Java to perform 
basic math operations.
## Types of Arithmetic Operators
* Addition
    - Add two values to each other
```java
System.out.println(5 + 3);     // 8
```
    - Assigning value of the addition to a variable
```java
int sum = 6 + 7;
System.out.println(sum); // 13
```

* Subtraction
    - Subtracts the second value from the first
```java
int debt = 1000;
int earnedMoney = 4000;
// finding the money after the debt is paid
int leftMoney = earnedMoney - debt;
System.out.println(leftMoney); // 3000
```
* Multiplication
    - Multiplies the two value
    - Multiplication is always done before subtraction
  and addition.
```java
int numOfComputers = 3;
double priceOfComputer = 7;
int numOfScreens = 2;
double priceOfScreen = 4.5;
// How could we calculate the total price paid for 
// all computers and screens? 
double totalPrice = 
        numOfComputers * priceOfComputer + 
        numOfScreens * priceOfScreen;
System.out.println(totalPrice); // 30
// Multiplication is always calculated before addition or
// subtraction.
```
```java
int result = 5 + 3 - 6 * 3 + 2 * 8;
//           5 + 3 - 18 + 2 * 8
//           5 + 3 - 18 + 16
//           6
Sytem.out.println(result); // 6
```
* Division
- Divide the first value by second.(quotient)
- Division is always done before the subtraction and addition.
- If there is both multiplication and division in the
calculation, we are going to start from left to right.
```java 
// If there is 10 kids in the house and we have 
// 20 chocolate for them. Let's calculate how many 
// chocolate each kid will get.
int numberOfKids = 10;
int numOfChocos = 20;

int eachKidWillGet = numOfChocos / numberOfKids;
System.out.println(eachKidWillGet);
```
```java
// Each family will bring 3 kids and there is 
// 10 family coming to the party. 
// There is total 60 candies. How many candy each kid
// will get if they are given equally? 
int numOfKidsInFamily = 3;
int numTotalFamily = 10;
int numOfCandies = 60;
int candyForEachKid = 
  numOfCandies / (numOfKidsInFamily * numTotalFamily);
System.out.println(candyForEachKid); // 2
```
* **NOTE!**: Using parentheses add priority to that operation,
so always operation in parentheses done first. If there is more
than one parentheses we do left to right.

* Remainder Operator In Java
  - Remainder operator is used to determine what is left over 
  when a number is divided by another. 
  - It gives use the leftover part after performing a division. 
  For example,if you divide the 10 by 3, the quotient is 3, 
  but the remainder is 1. 
```java
int num1 = 67;
int num2 = 7;
int result = num1 % num2;
System.out.println(result); // -> 4
int result2 = num2 % num1; // 7 % 67
System.out.println(result2); // 7
```
* **NOTE**: If you find a remainder of a big number from a small number
the result will be small number itself. Such as;
5 % 11 -> 5, 13 % 14 -> 13 etc.
* Remainder operator has a same precedence as multiplication, and division.
If there is multiplication, division and remainder operator present
in same arithmetical operation they will be done from left to right.













