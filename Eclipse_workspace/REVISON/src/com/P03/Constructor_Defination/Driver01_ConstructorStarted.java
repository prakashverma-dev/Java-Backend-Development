package com.P03.Constructor_Defination;


/*
 * 
 * 
 5. Constructor : Constructor is a special type of method which doesnot have any return type, It used to initialize objects at the time of object creation.

 When we create object, at tht time we use constructor to initlize the initial value for object.
 
 Each class has its default constructor if we dont create. It creats empty constructor which call even if we didnt create inside the class.


We used to crrate object with 'new Account()'; Here Account() is default consturctor.

how to create Construtor Inside Class : -

**Constructor name must be same with Class name.

**Constructor doesnt have any return type.
*
**Constructor may have paramters called as Parameterized constructor.


Syantx :  

	class Account{
		
		//Default Constructor
		Account(){
			
			System.out.println("Default Constructor of Account Class Called!");
		}
		
	}



There are two Types of Constructor We have -
a) Default COnstructor
b) Parameterized Constructor


# Parameterized Constructor : It is use when we want to supply input to object creation for 'Instance Variables' of class.

Parameterized Constructor use when we working on Class Level i.e on 'Class Attributes' as input to all the methods present in the Class. Rather using 'Local Variables' for methods.

A key note, when we using 'Instance Variables' over 'Local Variables' for taking input to methods, we use Parameterized constructor to inittialize the object value for that class.

Instance Variables or Class Attributes accessible to all members of the class.












Note1 : While running code, JVM calls only the classes which having the 'main' method inside as entry point of program execution. We can keeep JVM calling in seperate class as 'Driver' Class for only calling.

Note2 : In Java, We can provide inputs to a method via three ways -
	a) Via method calling using local variables
	b) Via Object creation using 'instance variables'
	c) Via command Line Arguments or Scanner Class object.
	
Note3: While defining the parameters for methods we can use same variabels names from Class as well as Different -

class Algebra{
	 
 	int a;
 	int b;
 	
// 	Can use same variable Name -
 	int add(int a, int b){
 		
 		int p = 10; // local variables 'p' and 'q' or Method level scope
 		int q = 20;
 		return p + q;
 		

 	}
}


Note4: while defining the parameters, If we use passed paramters with its type measn the two variables get decared as method scole varibles which is  local variables. Hence, we canot again initialiaze the same variables inside the method -
class Algebra{
	 
 	int a;
 	int b;
 	
// 	Can use same variable Name -
 	int add(int a, int b){
 		
// 		int a = 10; // We alreading initilizied the local variable while decaring the this method as Parameters -
// 		int b = 20; // We alreading initilizied the local variable while decaring the this method as Parameters -
 		
 		 a = 10; // As variable declared in this scoep, we can update the value.
 		 b = 20;  
 	return a + b;
 		

 	}
}



 
 

 */

//i. Default Constructor Class - 
class Account{
	
	// Default constriutor 
	Account(){
		
		System.out.println("Default Constructor of Account Class Called!");
	}
	
}

//ii. With Example -

//To Calculate the sum of two number - 

//a) Way1  : We could directly use 'local variables' as input paramters and call the method inside the main method after creating object of the class -
class Calculate{
	
	int sum(int a, int b) {
		return a + b;
	}
	
	// main method for 'sum' method call -
	public static void main(String[] args) {
		
		Calculate cal = new Calculate();
		
		System.out.println(cal.sum(5, 10));

	}
}

//Way2 : We could use Paramertized constructor for class Level : We will use 'Instance Variables' a and b for the class to pass as input while creating object of this class. It by creating the Parameterized Constructor -
class Calculate1{
	
	//Class Level Attributes or Intance Variables -
	int a;
	int b;
	
	int sum() {
		return a + b;
	}
	
	// Creating Parameterized constructor for Assigning Init Value for Object creation for this 'Instance variables' -
	public Calculate1(int x, int y) {
		
		System.out.println("Parameterized Constrictor Called..");
		
		// We assigned recived value to the 'Class variables' -
		a = x; // a gets the value of  x
		b = y; // b gets the value of  y
	}
	
	
	// main method for 'sum' method call -
	public static void main(String[] args) {
		
		Calculate1 cal = new Calculate1(5, 6);
		
		System.out.println(cal.sum());

	}
}


