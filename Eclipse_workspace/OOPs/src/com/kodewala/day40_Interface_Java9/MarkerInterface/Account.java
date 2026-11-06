package com.kodewala.day40_Interface_Java9.MarkerInterface;

public class Account implements Cloneable{  // We giving permission To get clone/copied of this class object, we need to give permission from existing marker interface 'clone' to get copy of this class object by implements to 'Cloneable' -
	// Tells JVM please allow to clone object of this class.
	
	String name;
	String address;
	String accNo;
	
	
	public Account(String name, String address, String accNo) {
		super();
		this.name = name;
		this.address = address;
		this.accNo = accNo;
	}

	//creating my clone Method for this account -
	public Object myClone() throws CloneNotSupportedException {
		
		return super.clone(); //cloning is just xerox of the object.
		
	}

}
