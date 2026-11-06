package com.kodewala.day34_Polymorphism_Example;

public class DebitCardPayment extends Payment {
	
	
	@Override
	public void doPayment() {
		
		System.out.println("DebitCardPayment.doPayment()... DebitCard Payment");
	}


}