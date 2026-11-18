package com.kodewala.day47.Exception3;


// Exceptions are always raised at the run time only**.







public class CheckedException {

	public static void main(String[] args) {
		
		//1. UnChecked Exception/RUn Time Exception -
		
		String name = null;
		name.length(); // Null Pointer Exception --> NPE
		
		
		
		
		
		
		//2. Checked Exception/Compile Time Exception -
		
		
		
//		String className = "com.kodewala.day47.Exception3.CheckedException"; // Positive Scenario -> Class Exist
		String className = "com.kodewala.day47.Exception3.CheckedExceptionn"; // Negative Scenario --> Class Doesnot Exist
		
		try {
			
			Class.forName(className); // It may throw Exception that Class might be not present i.e 'className'. SO JAVA decided this type of Exception to Put into the 'Compile TIme Error or Checked Exception' that must be handled before running the program.
			System.out.println("Class loaded Successfully.");

			
		} catch (ClassNotFoundException e) {
			
			System.out.println("Class Loading Failed or Not Present...");
			e.printStackTrace();
			
		} 

	}

}
