package com.kodewala.day27_Prerequisite;

/*
 * 
 * # Concept of Prerequisite In Java : Whatever language we learning there are some common Activity to perform.
 * 
 * Ex: For every user, connection with Database will be common. 
 * 
 * 
 * 
 * # Initialization Blocks/ Init Blocks : -
 * 
 * 	i. Static Init Block : executes only once just after loading the class for first time for first object creation, After then Constructor get called.
 * 
 * Before the main method execution, Static Init Block executes only once.
 * 
 * WE use this, when have some task which could be common for all the objects creation, but we want only once it should display..we use static block to achive this.
 * 
 * If you want any activity perform before executing the main method, static init block can use.
 * 
 * 	Syntax : static {
 * 
 * 				}
 * 
 * ORDER : We we create object : Instance Class Loads --> All Init Block Execute Once --> At End COnstructor get called.
 * 
 * Purpose : Some activity which could be common for all the objects.
 * 
 * ii. Instance Init Block : It executes for every Object creation. Syntax of this with just two currly braces {} .
 * 
 * 	Syntax  : {
 * 
 * 			  }
 * 
 * 
 * # Static vs Dynamic Class Loading : -
 * 
 * 
 * Static Class Loading : When we creating object using new keyword, we loading static class.
 * 
 * 		We cannot change the object after its creation at run-time. 
 * 
 * Dynamic Class Loading : During JDBC, We load the Driver Class at run time by calling it and supply driver name at the run time.
 * 
 * 
 * 
 * */

public class Driver {
	

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
