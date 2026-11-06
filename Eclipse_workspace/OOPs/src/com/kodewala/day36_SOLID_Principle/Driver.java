package com.kodewala.day36_SOLID_Principle;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeliveryProcessor dp = new DeliveryProcessor();
		
		
		//Will pass user selected delivery Type here -
		dp.process(new EKart() ); // EKart ek =  new EKart();
		dp.process(new ExpressBee() ); // ExpressBee eb =  new ExpressBee();
		
		//A new delivery Partner want to join to us/ SO mY Design is open for Extension as Per 'O' in SOLID principle -
		dp.process(new ShipRocket());
		
		
		

	}

}
