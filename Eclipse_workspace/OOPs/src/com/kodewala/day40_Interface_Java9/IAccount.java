package com.kodewala.day40_Interface_Java9;


//@FunctionalInterface // Optional - following all rules of functional Interface or not.// Explicitly specifying.
public interface IAccount {
	
	void openAccount(); // only one abstract method - SAM(Single Abstract method)

	
	//default method or any other methods but NOT more than one abstract method.
	default void addBeni() {
		
	}
	
	// private method --> Introduced in JAVA9.
	private String connectDB() {
		return null;
	}
	
	// static method -
	static void printMarkSheet() {
		System.out.println("IAccount.printMarkSheet()...Printing Marksheet");
	}

}

// Why we use Functional Interface to use Lambda method -
//Lambda method : without using the method name, you can implement the method.