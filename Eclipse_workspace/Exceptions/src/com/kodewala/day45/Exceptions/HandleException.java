package com.kodewala.day45.Exceptions;


/*
 * 
 * 
  		
  		
  		
  
  
  
  
  
   ##4.  Exception Handling : When exception occured during the run-time execution, we need to handle all expected rishky code in try and catch block.
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 */

public class HandleException {

	public static void main(String[] args) {

		System.out.println("HandleException.main()...START");
		String name2 = null;
		
		int age = 25;
		int divide = 0;
		
		
		try {
			
			//Risky Code -
			System.out.println(name2.length());  // NullPointerException
			System.out.println(age/divide); // ArithmeticException

		} catch (Exception e) {

			System.out.println("Exception Happened In the code!");
			
			System.out.println("name is Null");
			
			
			e.printStackTrace(); // tracing the exception
			
		}
		
		
		
		
		System.out.println("HandleException.main()...END");

	}

}
