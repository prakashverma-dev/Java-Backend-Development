package com.kodewala.day45.Exceptions;


/*
 * 
 * 
  
  
   ##4.  Exception Handling : As we know, different types of Exceptions can occur while running a program. So we need to handle all those exception using try and catch blocks.
   
   
   
   When exception occured during the run-time execution, we need to handle all expected rishky code in try and catch block.
   
   We handle the exception with printing/sending meaningful message to the caller. 
  
  
  We handle the exception with try-catch-catch-finally block -
  
  
  try{
  
  // Wrap the risky code in try block.
  
  }catch{
  
  	// Risky Code handled here in catch block with sending a user-friendly message to the caller.
  
  }finally{
  
  
  }
  
  Exception e --> It will catch all types of Exception will arise in the try block. As Exception is top class in Exception Objects. It will catch Exception's Class Object and its Child Objects.
   
   
  NullPointerException e --> It is used to target only Null Pointer Exception to resolve or catch from try block if happened and It ignored other exception and move to next catch block. 
   
   
  e.printStackTrace();  --> It is use to print the run-time exception reason, used inside the Catch block.
  
  
  
  Note : During Exception Handling, At the line of code, when exception occurred, then program will not execute further and jump directly to catch block and ignores all the code after exception line in try block. Although Entire Program doesnot terminates midway it handles and shows message to developer and program executes till last line.
  
  Note : With Exception Handling, my program doesot terminates in abnormal casees. and We give user -frienldy message as well.
  
  
  Note : Suppoe, If more than two exceptions may happen in try block, then Only the first exception handled by the respective catch block or general class block. Coz as soon as an exception is thrown inside a try block, In flow of try-catch block, the normal execution of that block immediately stops after first exception occurance and program control jumps straight to the matching catch block, and print the message to user.
  
  
  
  
  
  
  
  
  Note : Developer must aware of which operation in the program can produce the Exception, then he need to handle the that exception in catch blocks. 
  

  
  Note : While e.printStackTrace() is great while learning or debugging locally, real-world Java applications use a logging framework (like SLF4J or Log4j) instead—such as logger.error("Operation failed", e). so errors are saved cleanly to log files rather than dumped to the console.
  
  
  
  
  
 */

class Driverr {

	// Caller for the Exception method -
	public static void main(String[] args) {


		System.out.println("Driverr.main()...START");

		Driverr dr = new Driverr();
		dr.doSomething(); //caller or END USER
		
		
		
		System.out.println("Driverr.main()...END");

	}
	
	
	
	
	// Some Exception may happen in this method -
	public void doSomething() {
		
		System.out.println("Driverr.doSomething()...START");
		
	
		
		
		String name = null;
		
		int amount = 200;

		
		
		try {
			amount = amount/0; // ArithmeticException
			//Risky Codes --> which may throw Exception.
			System.out.println(name.length());  // NullPointerException occured here --> It will create object of 'NullPointerException' Class and throw it here which will catch by respective catch block or in general catch block.
			
			System.out.println("Code after length()...... "); // Will be ignored.
			
			// some codes... // skipped.
			
			


		} catch (NullPointerException e) {
		
//			System.out.println("Exception Happened In the code!");
			
			System.out.println("name is Null"); // This is for the Caller 'a user-friendly message'
			
			e.printStackTrace(); // to trace the exception reason
			
		}catch (ArithmeticException e) {
			
			System.out.println("amount Dividing by zero");
//			System.out.println("ERROR : "+e); 

			e.printStackTrace();
			
		}catch (Exception e) { // Default case Exception Handling 
			
			//In General Exception Type Handling 
		}
		
		
		
		
		
		
		
		
		
		System.out.println("Driverr.doSomething()...END");
		
		
		
	}

}
