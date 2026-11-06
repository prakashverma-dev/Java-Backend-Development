package com.kodewala.day37_Interface_Java7;

// Here, This class is signing a contract with Interface, so now it will implement all guidance i.e methods from Interface in this class -
// concrete Part
public class FlightBooking extends Object implements IDiscount { //Agreeing Inteface Rules and Implementing Here
	
	@Override // For safer side we use @Overide
	public int calculateDiscount(int amount, int rate) {
		
		int finalFare = amount - (amount * rate) / 100 ;
		
		return finalFare;
	}

	@Override
	public void calculateDiscountOnTax(int tax) {
		
		System.out.println("FlightBooking.calculateDiscountOnTax()");
	}

}
