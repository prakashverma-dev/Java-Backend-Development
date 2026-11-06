package com.kodewala.day34_Polymorphism_Example;

//In this class, we will achieve the Polymorphism/ Basically a new method which client will call -

public class PaymentProcessor {
	
	public void processPayment(Payment paymentmethod) {
		
		//Polymorphism happen here -
		paymentmethod.doPayment(); //as per user passed which object created from class, it will work.
		
//		Payment paymentmethod = new NetBankingPayment();
//		Payment paymentmethod = new DebitCardPayment();
//		Payment paymentmethod = new CreditCardPayment();
		
		
	}

}
