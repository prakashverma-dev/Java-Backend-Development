package com.kodewala.day42_U_DeepCopy;

// 'Address' is a custom class you created, which is a reference type or user-defined datatype, unlike primitive types like int or double.

// Creating our custom Type for Storing only the Address -
public class Address implements Cloneable{ // we need to give permission to get clone of object of this class.
	
	String line1;
	String line2;
	String city;
	
	public Address(String line1, String line2, String city) {
		
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
	}
	
	
	// For Cloning this nested object as well -
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone(); // To get clone of this class Objects (only Level-1 Objects)
	}
	
	
	
	

}
