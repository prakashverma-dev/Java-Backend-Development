package com.kodewala.day35_RevisonOOPs;


/*
 *   1. Encapsulation : Data Hiding(from other classes so they cannot modify it, to modify they come through proper channel i.e provided setter method and to get value through getterMethod.)
 *   
 *   2. Abstraction : Hiding the core functionalities and exposing only the necessary method to other class.E.g: Remote Control.
 *   
 *   3. Inheritance : One class re-use the funtionality of other class. We achieve inheritance by extending present class i.e child class to parent class with extends keyword. //. 
 *   
 *   	Advantage :  code reusability
 *   	DisAdvantage : Tightly Coupled and Heavy Loading 
 *   
 *   4. Polymorphism : Method behave defferently based on calling.
 *   
 *   
 *   
 *   

 *   
 *   
 *   Note : Java Comment: It is used to debug the system, and for other developers. A class can have missing java comments.Forward slash then two stars then close with one star and forward slash.
 *   
 *   In commment we use @auther <Name> : In order to catch the person who wrote the class.
 *   @author Prakash
 *   
 *   
 *   @since : to specify since which java version this class exist.
 *   
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 * 
 * 
 * */









// PROBLEM : This class is not well-Encapsulated ..
class Account{

	public int balance;  // coz balance can be modify by other classes.

	// this method will modify the balance
	public void credit () {
	
		// check the balance of sender
		// check the pin of sender
		// debit the amount
		// credit the amount -- > 0 --- > 100
		System. out.println ("Account.credit () ... doing fund transfer .. ");
	
	
	}

}


//SOLUTION : Making Class data Private and can modify through setter method -

//class Account{
//
//	private int balance;  // coz balance can be modify by other classes.
//
//	//Setter Method : this method will modify the balance
//	public void credit () {
//	
//		// check the balance of sender
//		// check the pin of sender
//		// debit the amount
//		// credit the amount -- > 0 --- > 100
//		System. out.println ("Account.credit () ... doing fund transfer .. ");
//	
//	
//	}
//
//}