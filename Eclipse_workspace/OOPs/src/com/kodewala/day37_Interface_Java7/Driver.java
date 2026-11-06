package com.kodewala.day37_Interface_Java7;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDiscount disc = new FlightBooking();
		
		int discount = disc.calculateDiscount(200, 10);
		System.out.println(discount); //180 (10% percentage discount)
	}

}
