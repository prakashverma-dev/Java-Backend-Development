package com.kodewala.day27_static_instance_initBlock;



class AccountManagement{
	
	
	//Constructor -
	public AccountManagement() {
		System.out.println("AccountManagement.AccountManagement()...Constructor");
	} 
	
	{
		
		System.out.println("Intance Init Block of AccountManagement Class..");
	
	}
	
}






//This Class use for testing 'Instance Init Block' -
public class Account extends AccountManagement {
	
	String accountNumber;
	
//	Note : All IIB block get executes once each time for each Object created by this class. It execute before the constructor call or before object creation.
	
	//First Instance Init Block/IIB -
	
	{
		System.out.println("Acount Instance Init Block 1 Executed..");
	}
	
//	//Second Instance Init Block -
//	{
//		System.out.println("Acount Instance Init Block 2 Executed..");
//	}


	public Account(String accountNumber) {
		
		
		super(); // 1st line
		// Call to init Block each time --> 2nd line 
		System.out.println("Account.Account(String accountNumber)...Constructor get called");		
		this.accountNumber = accountNumber;
	}
	
	//IIB(Instance Init Block) : 
	{
		System.out.println("Acount Instance Init Block 3 Executed..");


	}
	

	
	

	


}
