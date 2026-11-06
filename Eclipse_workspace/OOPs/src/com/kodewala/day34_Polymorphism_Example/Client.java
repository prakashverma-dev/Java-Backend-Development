package com.kodewala.day34_Polymorphism_Example;



// The Class which will call Payment Mechanism / Driver Class -


//This class only exposed to the client only -

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	
	//For CreditCard Payment - User#1 selected payment method as CreditCard, so we will supply object of credit card -
	CreditCardPayment cp = new CreditCardPayment();
//	cp.doPayment(); // Rather calling here, passing 'cp' object as argument to another method i.e processPayment() to call 
	
	//For DebitCard payment - User#2 selected payment method as DebitCard, so we will supply object of Debit card -
	DebitCardPayment dp = new DebitCardPayment();
//	dp.doPayment();
	
	//For NetBanking Payment -
	NetBankingPayment np = new NetBankingPayment();
//	np.doPayment();
	
	PaymentProcessor p = new PaymentProcessor();
	p.processPayment(cp);
	p.processPayment(dp);
	p.processPayment(np);

	
	// User#3 selected payment method as UPI, so we will supply object of UPI -
	UPIPayment up = new UPIPayment();
	p.processPayment(up);
	
	}

}
