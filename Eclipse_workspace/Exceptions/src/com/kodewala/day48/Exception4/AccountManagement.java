package com.kodewala.day48.Exception4;

import java.io.IOException;

public class AccountManagement {
	
	void openAccount(String accNo) {
		
		System.out.println("AccountManagement.openAccount()...START");
		
		activateAccount(accNo);
		
		System.out.println("AccountManagement.openAccount()...END");
	}
	
	
	private void activateAccount(String accNo) {
		
		System.out.println("AccountManagement.activateAccount()....START");
		
		
		
		
		try {
			
//			checkAccountStatus(null); // Negative Scenario
			checkAccountStatus(accNo); // Positive Scenario
			
		} catch (NullPointerException e) {
			
			System.out.println("This is Null Pointer Exception");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("This is IO Exception");
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("AccountManagement.activateAccount()....END");
		
				
		
	}
	
	
	
	
	
	
	
	
	
	private boolean checkAccountStatus(String accNo) throws NullPointerException, IOException {
		
		try {
			
			System.out.println("Recived accNo :  "+ accNo);
			boolean check =	accNo.startsWith("SBI"); //Risky Code --> NPE
			
			System.out.println(check);
			
		} catch (NullPointerException e) {

			//throw : 
			throw new IOException("Account number is not starting wih SBI");
		}
		
		return false;
		
	}

}
