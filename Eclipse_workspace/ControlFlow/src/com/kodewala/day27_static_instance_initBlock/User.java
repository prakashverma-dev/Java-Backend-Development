package com.kodewala.day27_static_instance_initBlock;


/*
 * 
 * # Concept of Prerequisite In Java : Whatever language we learning there are some common Activity to perform.
 * 
 * Ex: For every user, connection with Database will be common. 
 * 
 * 
 * 

 * 
 * 
 * # Initialization Blocks/ Init Blocks : - These are SIB(static init Block) and IIB(instance init Block) -
 * 
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
 * Note : Order of static block doesnot matter for its execution, it always executes all init block before the constructor call.
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
 * When we want to execute some activity for each Objects before execution of construtor or before creating object. We use intance init block. 
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

public class User {
	
	
	  String userName;
	  String userId;
	  String mobileNo; 
	  	 
	  
	
	//Writing Static Block - execute when this class will be loaded --> class will be loaded when we try to create objects.
	static {
		System.out.println("I am in the static Init Block 1..");
	   
	}
	
	static {
		System.out.println("I am in the static Init Block 2..");
	}
	
	public User(String userName, String userId, String mobileNo) {
		
		super(); // NOte : First line of Constructor must be either super() or this(). By-default we get super() with no arguments, even though if we not writting.
				// It will call 'Object' Super class.
		
		System.out.println("User.User(String userName, String userId, String mobileNo)... Constructor");
		this.userName = userName;
		this.userId = userId;
		this.mobileNo = mobileNo;
		
		
	
	}
	
	static {
		System.out.println("I am in the static Init Block 3..");
	
		 System.out.println("dff");





	}
	
	

}
