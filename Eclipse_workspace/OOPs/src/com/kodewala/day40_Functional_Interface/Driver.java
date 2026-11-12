package com.kodewala.day40_Functional_Interface;


// We define a class which implements the 'IAccount' Interface Rules -
// we used to do this : This has been replaced by 'Lambda Expression' with help of anonymous method -
class SavingAccount implements IAccount  {
	
	@Override
	public void openAccount() {
		System.out.println("SavingAccount.openAccount().......");
	}
	
}






// To Call the above class which implements the Functional Iterface Rules -
public class Driver {

	public static void main(String[] args) {
		
		SavingAccount sacc = new SavingAccount();
		
		sacc.openAccount();
		
		
		
//		OR, We can use the Parent 'Type' for the object creation of the class -
		
		IAccount sacc2 = new SavingAccount();
		
		sacc2.openAccount();

	}

}
