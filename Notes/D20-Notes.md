# Notes
- Method overloading is same class, same method name with different parameters.
Combination of method name and parameters is called method signature. 
- We CANNOT create more than one method with same name and same parameter list in the same class.
- Data hiding/Wrapping the data -> ENCAPSULATION ********* Implementation Hiding/Detail Hiding -> Abstraction
- Getter Method is used for -> returning the value of an instance variable(property). 
- Setter Method is used for -> Setting a new value for an instance variable(property).
- To create an object in Java you use a `new` keyword. 
- You could create as many objects out of class as your resources allow. You could create as many instance 
of a class as your resources allow.
- If your method return type is `void` **you cannot return any value**. If your return type is not `void`
you **MUST** return the value with return type.
- When an arithmetic operation is completed between two primitives result will be promoted to bigger data type. 
- When an `==` operator used between two objects it compares the value of the two objects as well as 
comparing the memory location of the two object. Therefore, it is most appropriate to use `.equals()` method 
when comparing objects. `==` operator can be used for primitive data types in java. 
- Substring method in String takes 2 parameters and first is the starting index and second is the ending index. 
Starting index is included but ending index is not included. 
- Return type of length() method of String is `int` and it returns the number of characters in the string. 
- Return type of indexOf() method from String is `int` and it returns the starting index of given character/s.
- When a polymorphic object is created, the method will be called from object side(right side). However a variable will be 
called from reference side(left side).
- A **subclass** is a class that extends another class
- A class declared in another class creates a nested class structure and it can be called inner class. 
- You **must** provide the size of an Array at the time of creation. 
- A **subclass** cannot access the **private members of its superclass**.
- A subclass **must override** all the abstract methods from its superclass.
- Constructors are not inherited, however a subclass must implement(call) at least one of the constructors from 
its parent class. Since the constructors cannot be inherited, they cannot be overridden.
- A method overriding happens when a subclass uses same method signature from a parent class. `@Override` annotation 
makes it easier to override by showing problems if overriding is not correct. **However,** this annotation is 
**NOT required** to override. 
- `super` keyword can be used to call both methods and constructors of the superclass.
`super()` calls the constructor, and it has to be used in the first line of the subclass constructor. `super` can be used 
to call methods from the super class(parent class. )
- An array can hold single data type. 
- The size of an array cannot be changed after creation. 
- The default values -> integer, byte, short, long->  `0` all objects -> `null` char ->`''` 
boolean -> `false`  float,double -> `0.0`
- Each time through a loop is called an iteration.