package com.kodewala.day34_Polymorphism_Example;

public class NetBankingPayment extends Payment {
	
	
	@Override
	public void doPayment() {
		
		System.out.println("NetBankingPayment.doPayment()... NetBanking Payment");
	}


}
