package com.kodewala.day34_Polymorphism_Example;

public class CreditCardPayment extends Payment {

	@Override
	public void doPayment() {
		
		System.out.println("CreditCardPayment.doPayment()...Credit Card Payment");
	}
	
}
