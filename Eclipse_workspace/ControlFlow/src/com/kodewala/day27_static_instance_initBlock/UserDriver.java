package com.kodewala.day27_static_instance_initBlock;


public class UserDriver {
	

  public static void main(String[] args) {
	  
	  System.out.println("Driver.main()..START");
	 
	  
	  // For all the users, Init Block will execute once, hence that is common for all users -
	 User u1 = new User("Prakash", "PRA1323", "73232432423"); // As soon as 'User' Class loads, Static Block Executes only once after then Constructor get called. IF we create more object It will not executes for other object, It only executes for first object created and class loaded.
	 
	 User u2 = new User("Rohit", "RKA1323", "98794543465"); // Static block will not execute, Constructor will executes.
	 User u3 = new User("Shravya", "JKR1323", "34245467643"); // Static block will not execute, Constructor will executes.
	 
	 
	 
	 
	 
	 
		 // If We didnt Create the Object here then, Only This Class ie Driver class will be loaded and its call the Driver.main() method by JVM.
	 
	 System.out.println("Driver.main()..END");

	}

}
