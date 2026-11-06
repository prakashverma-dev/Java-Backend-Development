package com.kodewala.day32_Overriding;

public class Driver {

	public static void main(String[] args) {  
		
		//
	SavingBank sb = new SavingBank();
	
	System.out.println("Saving bank Min Balance : "+sb.minBalance);
	sb.openAccount("Prakash Verma", 2333);  // Over-riding method called.
	sb.openAccount("Prakash Verma");  // Over-loading method called.
	sb.openAccount( 2333, "Prakash Verma");  // Over-loading method called.
	
	
	/// For overloading method - Client Calling the login 
	  Login lgin = new Login();
	  
	  lgin.doLogin("prakash@gmail.com", "prakash@1222"); // called the right method
	  lgin.doLogin("google.come"); // called the right method
	  
//	  lgin.doLogin("34344444", 444); /// as method is private canot call.	  

	}

}




