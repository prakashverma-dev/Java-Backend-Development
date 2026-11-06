package com.kodewala.day42_Cloning;

public class Employee implements Cloneable { //LEVEL1 - Class
	
	String name; //copied
	 
	String empCode; // copied
	
	Address address; // Nested object  - 'HAS-A'  // Not copied, point to same reference and object will not get copy.

	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	
	//Since - inbuilt .clone() method is protected so to use it, we need to explicitly make it public.
	
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		
//		return super.clone();
//		
//	}
	
	
	//For deep cloning for 'Address' Object -
	
	//Deep cloning : Will copy the nested object as well.
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			
			Employee emp = (Employee) super.clone();
//			emp.address = (Address) address.;
			 
			return emp;
		}
	
	
	
	

}
