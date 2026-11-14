package com.kodewala.day44_MemoryManagement;





public class Employee {
	
	String name;  
	String empCode; 
	
	Address address; //reference field or variable (which is pointing to 'address' object)

	public Employee(String name, String empCode, Address address) {
		
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	

}
