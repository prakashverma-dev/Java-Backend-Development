package com.kodewala.day42_U_DeepCopy;



//To do DeepCopy for Nested object, we need to write custom logic for .clone() method to get copy for Nested Objects, as By default <obj>.clone() method perform Shallow copy  - 




// Consider a 'Employee' class containing a primitive/immutable fields (name, empCode) and a mutable reference field (address).
//Here, 'address' is 'reference object' which has 'Address' as its type. 


public class Employee implements Cloneable { //  We need to give permission of clone by implements it to 'Cloneable'.
	
	String name; //copied  - LVL1 Object
	 
	String empCode; // copied -  LVL1 Object
	
	//Reference Type or User-Defined Datatype 'Address' : So While passing the address, we need to create Object of 'Address' Class with its value to pass in, which object here we pass to 'adress' --> The Reason 'address' is here nested Object Here when we call it. 
	Address address; //  'HAS-A' - Nested object - LVL2 Object// Not copied, point to same reference and object will not get copy.

	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	
	//As bydefault .clone() method is protected so to use it in our objects, we need to explicitly make it public 
	//For deep cloning for 'Address' Object -
	
	// We need to write code for Deep Cloning, in .clone() method to perform nested objects all cloned -
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Employee empObj = (Employee) super.clone(); // It gives 'empObj' of Employee type
		
		empObj.address = (Address) address.clone(); // we set the 'address' Object explicityly.
		
		return empObj;
		
	}
		

	
	
	
	

}
