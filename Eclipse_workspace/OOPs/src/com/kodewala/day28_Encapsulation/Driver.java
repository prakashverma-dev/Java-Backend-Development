package com.kodewala.day28_Encapsulation;

public class Driver {
	
	  public static void main(String[] args) {
		  
		  
//		  Object of Payment class -
		  Payment py = new Payment(1000); // Initial Balance
		  
//		  py.balance = 2000; // somebody modified data from Payment class which is not well encapsulaed.
		  

		  
		  //Let's add some money -
		  py.doCredit(5000);
		  py.doCredit(-50);
		  System.out.println("Updated Balance : "+py.getBalance() );
		
	}

}
