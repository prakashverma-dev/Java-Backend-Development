package com.kodewala.day27_static_instance_initBlock;

/*
   
 * ii. Instance Initialization Block(IIB) or Instance Block : We use IIB when we want to some task for each object creation. Syntax to define IIB just place two curly braces {} inside the class -
 * 
 * 	Syntax  : {
 * 
 * 			  }
 * 
 * when we create object of class, instance block {} executes each time for each object creation and it executes just after super() method statement (from the constructor) and just before constructor block execution. 
 * 
 * When we want to execute some activity for each Objects before execution of construtor or before creating object. We use intance init block. 
 * 
 * 
 * when we have multiple instance blocks 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
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
 * 
 */

//Example1 : 'Instance Init Block' - 

class AccountManagement{
	
	
	//Constructor -
	public AccountManagement() {
		super();
		System.out.println("AccountManagement.AccountManagement()...Parent Constructor");
	} 
	
	
}


class Account extends AccountManagement {
	
	String accountNumber;
	

	// Instance Init Block I -
	{
		System.out.println("Account Instance Init Block 1 Executed..");
	}
	
	// Instance Init Block II -
	{
		System.out.println("Account Instance Init Block 2 Executed..");
	}


	public Account(String accountNumber) {
		
		
		super(); // 1stly call the super() method to execute the Parent class default contructor -
		
		// <---- All Instance Init Blocks calls happen here ---> just after super() method and just before constructor block execution. 
		
		System.out.println("Account.Account(String accountNumber)...Child Constructor");		
		this.accountNumber = accountNumber;
	}
	
	// Instance Init Block III -
	{
		System.out.println("Account Instance Init Block 3 Executed..");


	}
	

	


}

public class Driver02_Account {

	public static void main(String[] args) {
		
		System.out.println("AccountDriver.main()... START");	
		
		
		//creating First object for 'Account' Class - all instance blocks executes just after super() method call and just before construction block execution.
		
		Account acc1 = new Account("3532342524323");
		
		//Creating another Object for 'Account' Class - again all instance block executes just after execition of super() method -
//		Account acc2 = new Account("3532342524323");
		
		
		
		System.out.println("AccountDriver.main()... END");
		

	}

}


/*

Output -

AccountDriver.main()... START

AccountManagement.AccountManagement()...Parent Constructor
Account Instance Init Block 1 Executed..
Account Instance Init Block 2 Executed..
Account Instance Init Block 3 Executed..
Account.Account(String accountNumber)...Child Constructor

AccountManagement.AccountManagement()...Parent Constructor
Account Instance Init Block 1 Executed..
Account Instance Init Block 2 Executed..
Account Instance Init Block 3 Executed..
Account.Account(String accountNumber)...Child Constructor

AccountDriver.main()... END


*/




//Example2 : 'Instance Init Blocks' in Child Class with Instance init Block in Parent Class -

//Note : It will follow the same rule in Parent Class as well when went inside the contructor inside the Parent clss firsly executes the super() method then executes all instance init block of Parent class then executes the contructor block -

class AccountManagement1{
	
	
	//Constructor -
	public AccountManagement1() {
		
		super(); //First Line of Execution 
		
		//<---- All Instance Init Block of Same Claas ---> Second Line of Execution
		
		System.out.println("AccountManagement.AccountManagement()...Parent Constructor"); //Third Line of Execution 
	} 
	
	//Instance Init Block for Parent class -
	{
		
		System.out.println("Instance Init Block In Parent Class..");
	
	}
	
	
}


class Account1 extends AccountManagement1 {
	
	String accountNumber;
	
	
	// Instance Init Block I -
	{
		System.out.println("Account Instance Init Block 1 Executed..");
	}
	
	// Instance Init Block II -
	{
		System.out.println("Account Instance Init Block 2 Executed..");
	}

	public Account1(String accountNumber) {
		
		
		super(); // 1stly call the super() method to execute the Parent class default contructor -
		
		//<---- All Instance Init Blocks calls happen here ----> just after super() method and just before constructor block execution. 
		
		this.accountNumber = accountNumber;
		System.out.println("Account.Account(String accountNumber)...Child Constructor");		

	}
	
	// Instance Init Block III -
	{
		System.out.println("Account Instance Init Block 3 Executed..");


	}
	

	


}

class Driver02_Account1 {

	public static void main(String[] args) {
		
		System.out.println("AccountDriver.main()... START");	
		
		
		//creating First object for 'Account' Class - all instance blocks executes just after super() method call and just before construction block execution.
		
		Account1 acc1 = new Account1("3532342524323");
		
			
		System.out.println("AccountDriver.main()... END");
		

	}

}


/*

Output -

AccountDriver.main()... START

Instance Init Block In Parent Class..
AccountManagement.AccountManagement()...Parent Constructor
Account Instance Init Block 1 Executed..
Account Instance Init Block 2 Executed..
Account Instance Init Block 3 Executed..
Account.Account(String accountNumber)...Child Constructor


AccountDriver.main()... END


*/


//Example3 : Mix of static blocks and instance blocks in the class -
//Note : It give prioritty to static blocks first then instance blocks and follow both block rules same.

class Demo0{
	
	// Constructor 
    Demo0() {
    	
    	super(); 
    	// <----instance init blocks --->
        System.out.println("Constructor of Parent Class executed");
    }
}

class Demo extends Demo0 {
	
	// 1. Instance Block
    {
        System.out.println("1. Instance block executed 1");
    }
	
    // 2. Static Block
    static {
        System.out.println("2. Static block executed 1");
    }

    // 3. Instance Block
    {
        System.out.println("3. Instance block executed 2");
    }

    // 4. Constructor 
    Demo() {
    	
    	super(); 
    	// <----instance init blocks --->
        System.out.println("4. Constructor of Child Class executed");
    }
    
    
    // 5. Static Block
    static {
    	
        System.out.println("5. Static block executed 2");
    }
    
    
}

class Driver02_Driver2{
		
    public static void main(String[] args) {
    	
    	System.out.println("Demo.main()... START");
    	
//        "--- Creating first object ---"
        new Demo();

//        System.out.println("--- Creating second object ---");
//        new Demo();
        
    	System.out.println("Demo.main()... END");
    	
    }
}

/*

 # Result -
 
 
 Demo.main()... START
 
 2. Static block executed 1
 5. Static block executed 2
 Constructor of Parent Class executed
 1. Instance block executed 1
 3. Instance block executed 2
 4. Constructor of Child Class executed
 
 Demo.main()... END
 
 
 
 */

//Example4 : using main method inside the class of all present instace init blocks -

class B1{
	
	B1(){
		System.out.println("B1.B1() Constructor");
	}
}
class A1 extends B1{
	

	 {
	        System.out.println("1st instance init");
	  }
	 
	 {
		 System.out.println("2nd instance init");
	 }
	 
	 //constructor -
	 A1(){
		 super();
		 // <--- Execution of all intance blocks ---->
		 System.out.println("A.A() Constructor ");
	 }
	 
	 {
		 System.out.println("3rd instance init");
	 
	 }
	 
	 public static void main(String[] args) {
		 
		 System.out.println("A1.main()...START");
		
		 A1 obj = new A1();
		 
		 System.out.println("A1.main()...END");

	}
	 
	 {
		 System.out.println("4th instance init");
	 }
	
	 
}

/*
 
 Result -
 
 A1.main()...START
 
 B1.B1() Constructor
 1st instance init
 2nd instance init
 3rd instance init
 4th instance init
 A.A() Constructor 
 
 A1.main()...END

 */
