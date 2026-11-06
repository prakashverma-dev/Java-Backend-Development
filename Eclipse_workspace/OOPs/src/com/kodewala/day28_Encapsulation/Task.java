package com.kodewala.day28_Encapsulation;

/*  
  
 
  
  
  
  Task: Write a program to manage the fund transfer

Attribute:

1. Account holder Name
2. Account number
3. Balance

4. Amount

Requirement:

1. User should be able to transfer the fund
2. Othe classes should not able to modify the data directly
3. Other classes should be able to read the balance
4. Only positive amount transaction allowed.
5. Transaction amount should be less than or equal to current balance
6. Classes should be well encapsulated.

I
  
  

  
  
  
  */

class FundTransfer {
	
	private String holderName;
	private String accNumber;
	private double accBalance;
	
	// constructor
	public FundTransfer(String _holderName, String _accNumber, double _accBalance) {
		super();
		this.holderName = _holderName;
		this.accNumber = _accNumber;
		this.accBalance = _accBalance;
	}
	
	//To tranfer the fund -
	public void doTransaction(double amount) {
		
		if(amount > 0 && amount <= accBalance) {
			
			accBalance = accBalance + amount;
		}else {
			System.err.println("Transaction Amount should less than or qual to current Balance");
		}
		
	}
	
	
	//Setter to read the current account Balance -
	public double getBalance() {
		return accBalance;
	}
	
	

	

}
