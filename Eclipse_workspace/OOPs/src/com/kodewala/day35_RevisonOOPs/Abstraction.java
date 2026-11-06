package com.kodewala.day35_RevisonOOPs;

class Accountt{

	private int balance;  // coz balance can be modify by other classes.

	//Setter Method : this method will modify the balance, this method is only exposed -
	public void credit () {
	
		// check the balance of sender
		checkBalance();
		// check the pin of sender
		validatePin(null);
		
		// debit the amount
		// credit the amount -- > 0 --- > 100
		System. out.println ("Account.credit () ... doing fund transfer .. ");
	
	
	}
	
	
	//Core Functionalities - If we declare method with public, then we call it as "This class is not well Abstracted'.
	private int checkBalance() {
	
		System.out.println("Account.checkBalance()");
		return 2000;

	}
	
	private boolean validatePin(String userId) {

		System.out.println("Account.validatePin() .... ");
		return true;
	
	}

}
