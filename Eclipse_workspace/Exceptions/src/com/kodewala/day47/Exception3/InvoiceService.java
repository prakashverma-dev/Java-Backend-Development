package com.kodewala.day47.Exception3;


// finally block will not execute when one and only when JVM will stopped or crash or no more or out of memory error.

// System.exit(0)  -->Killing JVM Intentionally.

public class InvoiceService {
	
	public void generateInvoice() {
		
	
		try {
			
			connectDatabase();
//			String name = "abcd_232";
			String name = null;
			name.lastIndexOf("a"); // Here Exception Occured.
			
			System.out.println("generating an Invoice for user..."); // It will be skipped.
			
			//We need to close the DB connection -
//			closeDbConnection(); // It will be skipped.(MUST PUT IN FINALLY BLOCK).
			
		}catch (Exception e) {
			// handling the exception
			
			System.out.println("Some Exception Occured..");
			e.printStackTrace();
		}finally {
			
			// It will execute always irrepective of try and catch block -
			System.out.println("I will execute always...inside finally block");
			closeDbConnection();
			
		}
		
		
		
		
		
		
	}
	
	// method for connection DABABASE -
	private void connectDatabase() {
		System.out.println("Connected with DB..");
	}
	
	// method for close connection DABABASE -
	private void closeDbConnection() {
		System.out.println("CLosing the Connection with DB..");
	}

}
