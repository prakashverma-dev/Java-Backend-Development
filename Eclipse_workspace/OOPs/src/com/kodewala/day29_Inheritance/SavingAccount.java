package com.kodewala.day29_Inheritance;



//Develop the functionality to open SavingAccount - Either develop Functionality from scratch or use other class funtionality by extending child class with Parent Class by using 'extends' keyword -
public class SavingAccount extends Account{
	
	
	public void openSavingAccount(String name, String address, String type) {
		
		openBankAccount(name, address, type);
		
	}
	//Reusing the existing functionality
	

}
