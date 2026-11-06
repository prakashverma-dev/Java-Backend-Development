package com.kodewala.constructor.day14;

/*  

Note : If our class doesnot have any parent class then we have 'Object' class as Parent class -

Ex1: Here, Driver class no parent class, then 'Object' class is the parent class.

public class Driver Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



Ex2:

class Invoice {


}

class Invoice extends Object {


}

Here, 'extends' keyword is use to build the relation between two class. Here, Invoice class become child of 'Object' Class.



*/

// TO generate INvoice for customer -
class Invoice extends Object{
	
	
	// Instance variable : belongs to object and created object will get new copy.
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	//Static variable - Belong to class and created object will get same copy.
	static int gst = 18; // static is common for all objects created. That is fixed for all object.
	
	
	// to Initialize class variables to object, we need to provide the constructor method -
	
	Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName){
		
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress= _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}
	
	
	
}
