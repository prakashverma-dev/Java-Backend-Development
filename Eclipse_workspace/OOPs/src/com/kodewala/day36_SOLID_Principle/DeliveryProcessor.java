package com.kodewala.day36_SOLID_Principle;

public class DeliveryProcessor {
	
	public void process(Delivery deliveryType) {
		
		deliveryType.doDelivery(); //Polymorphism
	}

}
