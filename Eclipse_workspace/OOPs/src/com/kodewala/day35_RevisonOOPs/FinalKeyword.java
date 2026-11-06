package com.kodewala.day35_RevisonOOPs;
/*
 * 
 * 
 * Note : final keyword : It can be used with class, method, variables.
 * 						  Anything final cannot modify further.
 * 
 * i. final class : 
 * 
 * We modify class using Inheritance by using extends keyword.
 * If we declare a class with final, we stopped the inheritance there.
 * 
 * public final class Account{   // we stopped the inheritance here.
 * 
 * }
 * 
 *  This can not be possible, we canot extends after final class -

 * public class SavingAccount extends Account {
 * 
 * 
 * }
 * 
 * ii. final method : With declaring final method, we canot override the method. in child class i.e Once we declare the method as final no on can able to modify it or override it in other class. 
 *   
 * 
 * 
 * 
 *class Account{ //final class : final class cannot be extends to other child class.
	
	public final void credit () { //final method : final method cannot be override in child class.

		System. out.println ("Account.credit () ... doing fund transfer .. ");
	
	
	}
}


iii. final variable : When putting final with variable that variable is const now and assigned value canot be changed. Naming Convention for final or constant varibale is UPPER_CASE always.

Note : Final variable doensot called as variable, It is now called as constant.

 If we able to change the variable value, we call it variable -
 
 	public int Max_Txn_Amt_In_24_Hrs = 100000;
 
    Max_Txn_Amt_In_24_Hrs = 200000; //changed to 2 lakh
    
    
 * 

 * 
 * 
 * 
 * */



final class Accounttt{ //final class : final class cannot be extends to other child class.

	private int balance;  
	public final int MAX_TXN_AMT_IN_24_HRS = 100000; // final variable : The variable value is fixed we canot change.
	
	public final void credit () { //final method : final method canot be override.
	
		// check the balance of sender
		checkBalance();
		// check the pin of sender
		validatePin(null);
		// debit the amount
		// credit the amount -- > 0 --- > 100
		System. out.println ("Account.credit () ... doing fund transfer .. ");
	
	
	}
	
	
	//Core Functionalities
	private int checkBalance() {
	
		System.out.println("Account.checkBalance()");
		return 2000;

	}
	
	private boolean validatePin(String userId) {

		System.out.println("Account.validatePin() .... ");
		return true;
	
	}

}

//i. final class example -

// We canot extends as class is final -
//class SavingAccount extends Accounttt{
//	
//	
//}


// //i. final method and final variable example -

//class SavingAccount extends Accounttt{
//	
//	@Override
//	
//	public void credit() {
//		
//		System. out.println ("We modifying Logic.. ");

//		Max_Txn_Amt_In_24_Hrs = 200000; // we can not change.
//	
//	}
//	
//}