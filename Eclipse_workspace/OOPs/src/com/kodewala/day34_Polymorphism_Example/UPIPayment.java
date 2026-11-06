package com.kodewala.day34_Polymorphism_Example;

public class UPIPayment extends Payment {
	
	@Override
	public void doPayment() {
		
		System.out.println("UPIPayment.doPayment()... UPI Payment");
	}

}
