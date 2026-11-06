
	
package com.kodewala.constructor.day12;


// Example pf Constructor -

class _1_AccountHolder {

	 
	// Data --> variables will hold the data.
	
	// Instance Variables - instance variable value specific to object.
	
	int amount;
	// int amount = 200; //Harcoding but object having different values.
	String account;
	String name;
	String phoneNumber;  // To Initialize all these instance variable we taking help of constructor to set these instance variable for object, when we will access these. 
	
	//Creating constructor for this class -
	// _amount, _account, _ etc are local variable to method. The reason we kept underscore same name for undertsanding.
	_1_AccountHolder(int _amount, String _account, String _phoneNumber, String _name){
		
		this.amount = _amount; // this.<instance_variable> = <local variable>;
		this.account = _account;
		this.name = _name;
		this.phoneNumber = _phoneNumber; // We initialized the value for objects.
		
		// here 'this' refers to object created, then we can access like same obj1.amount, the reason we kept here this.amount --> so it will refer to object.amount.
		
		
	}
	
	
	
	
	
	// Biz Logic --> methods will perform the business logic. 
	
	
}

























