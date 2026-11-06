package com.kodewala.constructor.day13;

public class Driver {

	public static void main(String[] args) {
	

		// To create object : type refName = new ConstructorName();
		
//		Account acc = new Account(); // Account() --> calling the constructor without creating the constructor then compiler will put default constructor as no args constructor, and we dont get error here.
		
		
		// Calling the constructor which does not except arguments.
		
		Account acc = new Account();// Account() --> 
		
		System.out.println(acc.amount);  // 0 default value
		System.out.println(acc.name);  // null default value
		System.out.printf("The amount is %d and Name is %s%n", acc.amount, acc.name);
		
		
		// Calling Same constructor name which except arguments -

		Account acc1 = new Account("Prakash", 200); // Account() --> calling the 
		
		System.out.println(acc1.name);
		System.out.println(acc1.amount);
		
		
		
		// In heap, there two object get created i.e acc and acc1 with different its respective values.
//		amount--> 0 and name -> null stores in heap for 'acc' object. 
//		amount -> 200  and name -> Prakash stores in heap for 'acc1' object. 
		
		
		
		
		
		
		
		
		
		// Calling the Product method -
		
		// a) Constructor with all parameters passed -
		Product pd1 = new Product("Mango", 80, "a fresh mango product", 5 );
		System.out.println(pd1); // Object 'pd1' get called. // com.kodewala.constructor1.Product@74a14482 from heap memory.
		
		System.out.println(pd1.productName);
		System.out.println(pd1.price);
		System.out.println(pd1.description);
		System.out.println(pd1.quantity);
		
		
		// b) Same Constructor name but expect different parameters -
		Product pd2 = new Product("Banana", "from tree fresh..");
		
		System.out.println(pd2.productName);
		System.out.println(pd2.description);
		
		
		// c) Same Constructor with no arguments : Here it will print default value for all these fields -
		Product pd3 = new Product();
		
		System.out.println(pd3.productName); // null
		System.out.println(pd3.price); // 0.0
		System.out.println(pd3.description); // null
		System.out.println(pd3.quantity); // 0
		
		
	

	}
	
	
	
	

}
