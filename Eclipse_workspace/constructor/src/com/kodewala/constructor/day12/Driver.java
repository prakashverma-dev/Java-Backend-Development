
package com.kodewala.constructor.day12;

// Driver : To starts execution of my Program /Entry Point of Code -

public class Driver {

	
	public static void main (String[] args) {
		
		// a) Default Constructor Calling -
		
		// In other way, To call Instance Method, we need to first create an Object of that class -
		Algebra alg = new Algebra(); // Since we didnot create Constructor still we calling coz Class 'Algebra' creates default constructor like Algebra(){} 
		
		System.out.println("Addition is : "+ alg.add(5, 10));
		
		
		
		// b) Parameterized Constructor Calling -
		
		Algebra1 alg1 = new Algebra1(5 , 6);
		
		System.out.println("Addition : "+ alg1.add());
		System.out.println("Substraction : "+ alg1.sub());
		
		
		// Creating another object with different values providing to Constructor -
		Algebra1 alg2 = new Algebra1(15 , 12);
		
		System.out.println("Addition : "+ alg2.add());
		System.out.println("Substraction : "+ alg2.sub());
		
		
		// c) Parameterized Constructor with Same Names for Instance and Local variable ssssssCalling
		
		 Algebra2 alg3 = new Algebra2(5, 1);
		 
		 System.out.println("Intance Variable Accessing :"+ alg3.a); // We get 5 as first first argument.
		 System.out.println("Addition : "+ alg3.add());
		 System.out.println("Substraction : "+ alg3.sub());
		
		
		 
		 
		 
		 
		
		
		// To create object of AccountHolder class -
		// int amount = 200;
		// type name = <value>;
		
		// Object of 'AccountHolder' type -
		_1_AccountHolder acc1 = new _1_AccountHolder(2000, "123433444", "7278322323", "Prakash Kumar Verma");
		
		// Now we access one customer data/variable with dot operator -
		System.out.println("name :"+ acc1.name);

		
		// Creating one more object for customer2 -
		_1_AccountHolder acc2 = new _1_AccountHolder(4334, "4533444", "98322433", "Priyanshu Dev");
		System.out.println("name : "+ acc2.name);
		
		
		
		}
		
//		Note : In Heap when we acc1 object get created and its value store in Heap, and acc2 object created and its value stores in the heap. 
		
	

}



 
 
 
 