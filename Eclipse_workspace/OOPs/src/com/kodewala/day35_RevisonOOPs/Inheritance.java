package com.kodewala.day35_RevisonOOPs;


//Inheritance must exist in real-world remember -
// Object class : Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class. Object class have clone(), hashCode(), wait(), equals() and many more methods are there.



/**
* Represents a delivery partner responsible for handling delivery-related operations.
*
* @author Suresh
* @since 1.8
* 
*/





class DeliveryPartner extends Object{  // Object is superclass by-default.
	
	// funtionality
	
	/**
	* Executes the delivery process by coordinating the necessary steps
	* required to deliver the order to the customer.
	* <p> This method contains the complete delivery workflow, including
	* delivery processing and related business logic .</p>
	* @implNote Contains the implementation of the delivery workflow.
	* 
	*/
	public void doDelivery() { // 500 lines of code (tested and use
		
		System.out.println("DeliveryPartner.doDelivery()");
	}

}


class XpressBee extends DeliveryPartner{
	
	// funtionality  can use here + can override the method of parent class using @Override.
	@Override
	public void doDelivery() { // 500 lines of code get copied with modification
		
		System.out.println("DeliveryPartner.doDelivery()");
	}
}


class Ekart extends DeliveryPartner{
	
	
}
