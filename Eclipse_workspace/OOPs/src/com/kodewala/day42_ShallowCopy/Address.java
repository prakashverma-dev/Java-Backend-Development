package com.kodewala.day42_ShallowCopy;

// 'Address' is a custom class you created, which is a reference type or user-defined datatype for creting address object, unlike primitive types like int or double.

// Creating our custom Type for Storing only the Address -
public class Address {
	
	String line1;
	String line2;
	String city;
	
	public Address(String line1, String line2, String city) {
		
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
	}
	

	
}
