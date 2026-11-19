package com.kodewala.day48.CustomeException;

/*
 
 
 step1 : create a class which extends 
 
 
 
 
 
 */

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("Driver.main()...START");
		
		PaymentManagement pm = new PaymentManagement();

		try {
			pm.doPayment("3534553554", 12000);
		} catch (FundTransferException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Driver.main()...END");

		
	}
	
	

}
