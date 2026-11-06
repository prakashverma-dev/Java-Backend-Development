package com.kodewala.day36_SOLID_Principle;

//Suppose, A new delivery Partner 'ShipRocket' want to join to our company, so we need to onboard that curior partner to our system -

public class ShipRocket extends Delivery {
	
	@Override
	public void doDelivery() {
		
		System.out.println("ShipRocket.doDelivery().... ShipRocket Delivery..");
	}

}
