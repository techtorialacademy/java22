# Set 
1. **HashSet**
- A **HashSet** is an implementation of the `Set` interface backed by a hashtable.
- It uses a `hashing mechanism` to store elements, which makes its operations like
add,remove, and contains very efficient. 
* *Key Characteristics*
    * Does not guarantee the order of elements.
    * Doesn't allow duplicates
    * Allows a single `null` element
    * Fast for remove, add, search methods. 
* Use hash set when you need fast set for storing unique 
elements and order doesn't matter.

2. **LinkedHashSet**
* A `LinkedHashSet` is an implementation of the `Set` interface backed by linked list.
* It **maintains** the insertion order of elements.
* *Key Characteristics*
    * Maintains the order in which elements were inserted.
    * Doesn't allow duplicates. 
    * Allows a single `null` element. 
    * Slightly slower than `HashSet` due to maintaining order of elements. 
* Use it when you need to store unique elements with their orders preserved.

3. **TreeSet**
* A `TreeSet` stores elements in sorted order ascending by default. 
* *Key Characteristics*
    * Maintains the elements in sorted order.
    * Doesn't allow duplicates. 
    * Doesn't allow `null` values.
    * Slower than `HashSet` and `LinkedSet`. 
  











