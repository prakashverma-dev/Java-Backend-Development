package com.kodewala.day37_Interface_Java7;

public class BusBooking implements IDiscount {

	@Override // For safer side we use @Overide
	public int calculateDiscount(int amount, int rate) {
		
		
//		return amount; // this class says I will not give any discount in Bus Booking.
		
		return IDiscount.MAX_VALUE; // we giving 100 rupees disount in Bus booking.
	}
	
	@Override
	public  void calculateDiscountOnTax(int tax) {
		
		System.out.println("BusBooking.calculateDiscountOnTax()");
	}
	
	
}
