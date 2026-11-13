package com.kodewala.day42_ShallowCopy;



/*
#1. In Java Copy Object i.e Creating new Object : We can create Object in Java -
*
* 
* a) using new keyword : using constructor
* b) using serialization : Converting to bytes and again converting back to Object.
* c) using cloning : using .clone() method of 'Object' class 
* 
*  
*  # We can do cloning iN Java :  Cloning means copying the objects of Class, It is done using two ways -
* 
* 
* a) Shallow Copy/Cloning : When we perform the shallow copy, It copies Only one level of Objects with pointing different memory address in Heap, and Rest nested level Objects they do not get copied and they points to original memory address in Heap.
* 
* In Shallow Copy, ONE LEVEL Object get copied with completely new memory address for that object in HEAP, But Nested Object doesnot get copied to that new Object in HEAP with its memory Address.
* 
*  Nested Object DOensot copy, its points to Original Object memory Address.
*  
*  Child Object or Nested Object will not get copied to copied Object.

  By default <obj>.clone() method of 'Object' class will perform shallow copy in java.
*  
*  
*  A shallow copy creates a new object but It does not copy 'referenced objects' or nested Objects; instead it copies their reference address from Original Object. As a result, both the original and copied objects point to the same memory location for reference fields.

Default behavior of the Object.clone() method is shallow Copy.
Primitive fields are copied, while reference fields are common in both Objects.
Fast and memory-efficient since no deep object creation occurs.
Risk of unintended side effects due to shared references.
Changes made through one object are reflected in all copies sharing the reference.
It is Faster and uses less memory.




*  b) Deep Copy/Cloning : It copies all the level of Objects or All nested Object with a complete different object having a new memory address in the HEAP memory where all objects along with nested, pointing to new memory address in HEAP.
*  
*  Since, By default <obj>.clone() method of 'Object' class will perform shallow copy in java. So we need to add some custom copying logic inside .clone() method for all nested objects.
*  
*  A deep copy creates a new object along with separate copies of all referenced objects, ensuring complete independence between the original and copied objects. Any change made to one object does not affect the other.

Achieved by writing custom copying logic for .clone() method.
When cloning is used, all referenced objects must also be cloned.
Provides a safe and fully independent copy of the object.
Requires higher memory usage compared to shallow copy.
It is safer but Slower coz uses more memory due to recursive instantiation.
More complex to implement due to recursive copying of references.
*  
*  
*  

* 
* 
* 
*  #2. Inbuilt 'Object' Class : In 'Object' Class, Mostly all methods are public, except one and two.
*   .clone() and .finalize() --> protected method (methods shows in Yellow Color are Protected)
*   .wait0()  --> private (methods shows in Red Color are Private)
*   
*   Rest all methods are Public. -->  methods shows in Green Color are Public.

* 
*  .clone() method of 'Object' class is Protected. SO we cannot access this to any object call.
* 
*  If .clone() method was public, anybody easily start cloning the JAva Objects. They could missuse it.
* 
*  'native' keyword in clone() method  --> Written in other than Java Lang. Java Supports other language as well, To use that we use native keyword.
* 
* 
* 
*   Ctrl + shift + T ---> Open Type(Search for all Inbuilt Class)
	Ctrl + O  --> Opened Class, Look All methods Available Here.
	

	
* */



// Example : We will Perform Shallow Copy and Deep Copy over Object of Nested Objects -





 // Consider a 'Employee' class containing a primitive/immutable fields (name, empCode) and a mutable reference field (address).
//Here, 'address' is 'reference object' which has 'Address' as its type. 


public class Employee implements Cloneable { //  We need to give permission of clone by implements it to 'Cloneable'.
	
	String name; //copied  - LVL1 Object
	 
	String empCode; // copied -  LVL1 Object
	
	//Reference Type or User-Defined Datatype 'Address' : So While passing the address, we need to create Object of 'Address' Class with its value to pass in, which object here we pass to 'adress' --> The Reason 'address' is here nested Object Here when we call it. 
	Address address; //  'HAS-A' - Nested object - LVL2 Object// Not copied, point to same reference and object will not get copy.

	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	
	
	
	//As bydefault .clone() method is protected in 'Object' Class, so to use it in our objects, we need to explicitly make it public - 
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Employee empObj = (Employee) super.clone(); // It gives 'empObj' of Employee type
		
		return empObj;
		
//		OR, USE Directly - 
		
//		return super.clone(); // all attributes gets cloned, only 1-Level.
		
		// To get clone of this class Objects (only Level-1 Objects)
		
	}
	


	
	
	
	

}
