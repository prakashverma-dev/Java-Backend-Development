package com.kodewala.constructor.day16_SuperClass;



// Netflix OTT : When a user is signup, his object get created with his/her details -


/**
 * 
 *  This class represent the Netflix User -
 */


public class User {

	
	String name;
	String type;
	String country;
	
	// Creating the constructor for initialize the above values -
	User(String _name, String _type, String _country) {
		
		this.name = _name;
		this.type = _type;
		this.country = _country;
	}
	
	// Creating a default Constructor -
	User(){
		
		//calling above constructing with this with passing default arguments -
		this("user12334", "Guest User", "IN"); // calling User class constructor with passing default values 
		// System is setting or Initializing the default values.
	}
	
	
	
	
	
}
