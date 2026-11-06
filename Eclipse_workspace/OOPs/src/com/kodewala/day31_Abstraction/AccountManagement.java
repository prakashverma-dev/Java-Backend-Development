package com.kodewala.day31_Abstraction;

public class AccountManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account acc = new Account();
		
		
		// Calling as per Abstraction Following(Core implementation should not be visible here) - If anybody wants to open the Account, pass the information to it and it will do this -
		acc.openAccount("Kodewala", "BTM Bangalore", "HDLK3434"); 
		
		//If core functionalities made with public then it someone can call directly these rather following the abstraction -
		// If person is not following Abstraction(means calling only top methods) then has to call each and every core functionality one by one that is not following the OOPs -
		
//		acc.connectWithDB();
//		acc.validateNameandAddress("Kodewala", "BTM Bangalore");
//		acc.validatePanCard("HGJT6543RG");
//		acc.createUserID();
//		acc.notifyUser();
		
	}

}
