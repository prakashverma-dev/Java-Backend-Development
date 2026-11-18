package com.kodewala.day47.Exception3;

/*
 * 
 * 1. 'return' keyword behaviour defferenly with 'finally' block in complete programming / One Exception: try-finally Blocks -
 * 
 * 
 *  Normally, encountering a return statement immediately stops the method, skips any remaining code below it, and sends control back to the caller. 
 *  
 *  However, Java enforces strict cleanup rules when 'try-finally' blocks are involved in the code, Then  Java pauses the return to run the finally block first.

 Note : If a return statement runs inside a try or catch block, Java pauses the return to run the finally block first -

 
	 public static int testReturn() {
	 
	    try {
	    
	        return 1; // 1. Prepares to return 1, but pauses
	        
	    } finally {
	    
	        System.out.println("This still runs!"); // 2. Executes before leaving
	        
	    }
	    
	    // Any code down here is still skipped
	}

 
 
 
 
 
 
 
 * */


//Checking 'return' keyword Different Behaviour only in case if used -

class Foo{
	
	public static void main(String[] args) {
		
		
		int result = Foo.test();
		System.out.println("result: " + result);


		
	}
	
	// a method that return a value -
	private static int test() {
		
		try {
			
			return 1;
			
		}catch (Exception e) {
			
			System.out.println("I'm inside Finally Block..");
			return 5;
		} 
		
		
	}
}










public class Discount {

	
	public int calDiscount(int amount, int disc) {
		
		int finalAmt = 0;
		
		try {
			
			finalAmt = amount - (amount * disc / 100); // RISKY 
//			return finalAmt; // OPTIONAL
			
		}catch (Exception e) {
			// handling the exception
			
			System.out.println("Some Exception ...");
			e.printStackTrace();

		}finally {
			//Used for clean-up
//			finalAmt = 110; // Will over-ride the above updated 'finalAmt'
//			return finalAmt; // again returning the value.
		}
		
		return finalAmt;
		
		
	}
}
