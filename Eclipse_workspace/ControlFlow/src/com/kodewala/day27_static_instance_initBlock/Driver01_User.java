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
 * # Initialization Blocks In Java/ Init Blocks : - 
 * 
 * 
 * 
 * 
 * 	i. Static Initialization Block(SIB) or Static Block : It is use to perform a common one task for all the object creation by the class. 
 * 
 * static block {} executes only once when first time object created and the moment the class loaded in memory, all static block statements executes, its before the constructor execution of the object.
 * 
 * Remember, All static {} block executes firstly before execution of constructor for the class.
 * 
 * Note : cIf you using main method inside the class with all static blocks, then firstly all static blocks executes before execution of main method.  
 * 
 Syntax : static {
 * 
 * 				}
 * 
 * 
 * Purpose : WE use this, when have some task which could be common for all the objects creation, but we want only once it should display..we use static block to achieve this.
 * 
 * If you want any activity perform before executing the main method, static init block can use.
 * 
 * 
 * If there are multiple static blocks, It executes all static block first, Order of static block doesnot matter for its execution, it always executes all init block before the constructor call.

 * 
 * 
 * Flow : We we create object : Class Loads --> All Init Block Executes only for First Time Once --> After then COnstructor get called.

 * 
 * 
 * 
 * 

 * 
 * 
 * */

//static Block Example - Run all the static blocks only once when the first time class is loaded into memory by JVM via First time object creation from this class -
class User {
	
	
	  String userName;
	  String userId;
	  String mobileNo; 
	  	 
	  
	
	//Writing Static Block -I - execute when this class will be loaded --> class will be loaded when we try to create objects.
	static {
		System.out.println("I am in the static Init Block 1..");
	   
	}
	
//	Static Block - II
	static {
		System.out.println("I am in the static Init Block 2..");
	}
	
	//Para Constructor
	public User(String userName, String userId, String mobileNo) {
		
		super(); // First line of Constructor must be either super() or this(). By-default we get super() with No arguments, even though if we not writing.
		
		System.out.println("User.User(String userName, String userId, String mobileNo)... Para Constructor");
		this.userName = userName;
		this.userId = userId;
		this.mobileNo = mobileNo;
		
		
	
	}
	
	// static block - III 
	static {
		System.out.println("I am in the static Init Block 3..");

	}
	
	

}

public class Driver01_User {
	

  public static void main(String[] args) {
	  
	  System.out.println("Driver.main()..START");
	 
	  
	  // For all the users, Init Block will execute once, hence that is common for all users -
	 User u1 = new User("Prakash", "PRA1323", "73232432423"); // As soon as 'User' Class loads into memory, All Static Block get Executed only once before execution of constructor of this class and later static block will not execute even if we creating another objects of this class. 
	 

	 //Creating another object ===> static{} block will not execute -
	 User u2 = new User("Shravya", "JKR1323", "34245467643"); // Static block will not execute, Constructor will executes.
	 
	 
	 
	 System.out.println("Driver.main()..END");

	}

}


/*
 Output -
 
Driver.main()..START

I am in the static Init Block 1..
I am in the static Init Block 2..
I am in the static Init Block 3..
User.User(String userName, String userId, String mobileNo)... Para Constructor  --> For object 1
User.User(String userName, String userId, String mobileNo)... Para Constructor  --> For object 2

Driver.main()..END
  
  
 */
 


// Example2 : Usin main method insde the class and static blocks inside the same class -

//Note : as soon as class loads via object creation, all static blockx executes even before the main method call start and once all static block -

class A{
	

	 static {
	        System.out.println("1st static init");
	  }
	 
	 static {
		 System.out.println("2nd static init");
	 }
	 
	 A(){
		 System.out.println("A.A() Constructor ");
	 }
	 
	 static {
		 System.out.println("3rd static init");
	 
	 }
	 
	 public static void main(String[] args) {
		 
		 System.out.println("A.main()...START");
		
		 A obj = new A();
		 
		 System.out.println("A.main()...END");

	}
	 
	 static {
		 System.out.println("4th static init");
	 }
	
	 
}


/*
 
 1st static init
 2nd static init
 3rd static init
 4th static init
 A.main()...START
 A.A() Constructor 
 4th static init
 
 */



