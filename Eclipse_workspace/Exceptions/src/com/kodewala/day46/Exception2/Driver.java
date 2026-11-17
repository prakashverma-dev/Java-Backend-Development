package com.kodewala.day46.Exception2;


//# Exception Propagation 

//Throwable is the top most Class of 'Exception' and 'Error' Class. 

// Thowable nullPointerException =  new NullPointerException();

public class Driver {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		String accNumber = "SBI_2424243534454";
		
		// In-case, null received -
//		String accNumber = null;
		
		acc.doActivate(accNumber);
		
		

	}

}





class Account{
	
	void doActivate(String accNo) {
		
		System.out.println("Account.doActivate()....START");
		
		validateAccountDetails(accNo); // calling another method which is private and non-static.
		
		System.out.println("Account.doActivate()....END");
	}
	
	
	
	private boolean validateAccountDetails(String accNumber) {
		
		System.out.println("Account.validateAccountDetails().. START");
		
		//Here, We doing operation on 'accNumber' which is 'String' Type ==> Which might leads to throw inbuilt Exception i.e Null Pointer Exception ==> So we need to handle it in advance -
//		boolean isValid = accNumber.startsWith("SBI"); //Some Operation --> Risky Line of Code(if accNumber is null, will throw NPE)
		
		// Handling 'Expected' Exception Here with try and catch block -
		boolean isValid = false; 
		
		try {
			
		  isValid = accNumber.startsWith("SBI"); // isValid only creates 'Null Pointer Exception' Object of Null Pointer Exception Class if accNumber is null.

			
		} catch (NullPointerException e) {

			System.out.println("Value is null");
			e.printStackTrace();
		}
		
		
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Unknown Error");
			e.printStackTrace();
		}
		
		
		
		System.out.println("Is Account Activated : "+isValid);
		
		
		System.out.println("Account.validateAccountDetails()... END");
		
		
		return isValid;
	}
	
	
	
}
