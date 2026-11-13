package com.kodewala.day42_ShallowCopy;



public class Driver { 

	public static void main(String[] args) throws CloneNotSupportedException {

		
		Address address = new Address("16th main", "27th Cross", "Bangalore");
		
		
		// I Want to clone the object of 'Employee Class' Let's create -
		Employee emp1 = new Employee("Prakash", "2334df", address); // It has one nested Object as 'address' and other two are normal values.
		
		//Let's try to clone -
		Employee copied_emp1 = (Employee) emp1.clone();  // By cloning .clone() method of 'Object' Class afer making it public in our 'Employee' Class.
		
//		Note :  Here we did the down-casting coz .clone() method returns the 'Object' Type but we here expecting the 'Employee' Type, So we need to change Upper Bound Target from 'Object' to our Lower bound Target 'Employee' by down-casting.
		
		//Let check -

		
		// Checking Level-1 Objects i.e name and empCode  -
		
		System.out.println("Original Object : "+emp1.name);	// 	Prakash
		System.out.println("Copied Object : "+ copied_emp1.name); // Prakash
		
		//lets change name or either Objects -
		emp1.name = "Rohit"; // changing for original Object 'emp1'
		
		//Let's check -
		System.out.println("Original Object : "+emp1.name);	// 	Rohit 
		System.out.println("Copied Object : "+ copied_emp1.name); // Prakash
		
		//Hence, Both Objects are pointing to two different memory address in HEAP MEMORY.
		
		
		// We could perform same for Copied Object as well -
		copied_emp1.name = "Shravya"; // Lets change the name for copied object
		
		System.out.println("Original Object : "+emp1.name);	// 	Rohit 
		System.out.println("Copied Object : "+ copied_emp1.name); // Shravya
		
		
//		Note : In Shallow Copy, Both Object Level-1 Objects works two different identity with different memory location in HEAP. WHere as Nest Object i.e LVELE2 and Inner Levels Get affected and referes to Orginal Memory Address - 
		
		// Checking Level-2 Object 'address' -
		
		System.out.println("Original Object : "+emp1.address.city); // Bangalore
		System.out.println("Copied Object : "+copied_emp1.address.city); // Bangalore
		
		
		//Let's Change Either one, To check Actual copied or not -
		emp1.address.city = "Kolkata"; // chaning Original Object nested Object.
		
		//Let's check now both Objects -
		System.out.println("Original Object : "+emp1.address.city); // Kolkata
		System.out.println("Copied Object : "+copied_emp1.address.city); // Kolkata
		
		
//Hence, Here both Object data get effected, so copied nested object still pointing to original nested object.
		
		

		
		
		

	}

}
