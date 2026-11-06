package com.kodewala.constructor.day13;


/*

	Class --> blueprint
	Object --> real entity/instance of class.  --> Data(variable) + methods(behavior or act)
	
	Constructor : To initialize the state means to initialize the instance variables for objects from class.
	
	To create constructor - constructor name must same with the class name.
	
	ClassNAme(){   --> to call this constructor in the same package only.
	
	}
	
	public ClassName(){   --> to call this constructor by anywhere.
	
	}





# Inbuilt 'Object' Super Class : -
 


	Inbuilt 'Object' is the top most class or super Class in java.
	
	public class Object{
	}
	
	If your class doesn't have any parent class, then 'Object' class consider as Parent class.


Example -

class A extends Object {  // By default top class has Parent Class as 'Object' i.e SuperClass.

}

class B extends A{

}

*/

class Account {
	
	int amount; // person1 --> 200; person2 --> 300
	String name;
	
//	To Initialize the above instance variable, we will use Constructor -
	
	Account(){
		
		System.out.println("Constructor Get called without any Arguments..");
		
	}
	
//	OR, Constructor with 'public' access modifier -
	
//	public Account(){
//			
//	}
	
	

	public Account(String _name, int _amount){
		
		System.out.println("Constructor Get called with Arguments..");
		
		 this.name = _name;
		 this.amount = _amount;
				 
		
	}

}


/*  
   
Task : Write a program to create Product Object and consider the following scenario -

Product Could be : Mango, banana, fan, headphone etc.


Attributes of Product : 

	Product name
	Price
	Description
	Quantity
	
Scenario :

	a. User should be able to create the product with product name, price, description and quantity.
	b. User should be able to create the product with product name and description.
	c. User should be able to create the product without any attributes.
	 
	 
Hints : So here we need to create three Constructor could be with same name but different arguments or with no arguments.
	


   
   
   
   
   
   
   
   
   */


 
 
 
 
 
 
 
 
 
 















