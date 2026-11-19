package com.kodewala.day48.CustomeException;

public class PaymentManagement {
	
	public void doPayment(String account, int amount) throws FundTransferException{
		
		try {
			checkBalance(account, amount);
		} catch (InsuffientBalanceException e) {
			
//			e.printStackTrace();
			
			throw new FundTransferException("User account may have not been activated wait for 24hrs");
		}
		
		
	}
	
	private boolean checkBalance(String account, int amount) throws InsuffientBalanceException {
		
		boolean checkBalanceState = false;
		int balance = 1000; // user fixed balance in account, comming from Database
		
		if (amount > balance) { //Here, amount is which user want to perform fund transfer over his fixed money in his account
			
			throw new InsuffientBalanceException(account + " doesnot have enough money in the account and user current balance in account "+balance);
			
			
			
		} else {
			
			//Allowed to do Fund transfer
			checkBalanceState = true;

		}
		
		return checkBalanceState;
	}

}
