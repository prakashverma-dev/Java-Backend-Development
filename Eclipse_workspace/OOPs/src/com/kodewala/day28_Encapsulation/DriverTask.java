package com.kodewala.day28_Encapsulation;

public class DriverTask {

	public static void main(String[] args) {
		// Let Do The First Fund Transfer with Initial Money as 2000 -
		FundTransfer ft = new FundTransfer("Prakash", "23453243344", 5000); // We set OPEN accound Initial balance is 5000.
		
//		System.out.println("Current Balance is : "+ft.getBalance());
		
//		ft.doTransaction(-2000);
		ft.doTransaction(5000);
		
		double balance = ft.getBalance();
		
		System.out.println("Current Balance is : "+balance);
		
		
		
		

	}

}
