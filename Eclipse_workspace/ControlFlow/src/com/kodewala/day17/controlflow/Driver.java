package com.kodewala.day17.controlflow;


//This class is responsible for accepting booking from user / booking system -

public class Driver {

	public static void main(String[] args) {
		
		
		// For Booking System DRIVER -

		Booking bk = new Booking();
		
		String pnr = bk.doBooking("BRL", "KOL", 4);
		
		System.out.println("PNR is "+ pnr);
		
		
		// For TripPlanner Driver -
		
		TripPlanner planner = new TripPlanner();
		
		String response = planner.suggestPlan("BLR", "GOA", 3200 );
//		System.out.println(response);
		
		
		// TASK GIVEN BY SIR DRIVER -
		
		System.out.println("=========================");
		
		MakeMyTripDiscount disc = new MakeMyTripDiscount();
//		double discount = disc.discount(5000); 
//		double discount = disc.discount(6000); 
//		double discount = disc.discount(10000); 
//		double discount = disc.discount(12000); 
//		double discount = disc.discount(20000); 
		double discount = disc.discount(-10); 
		System.out.println("Discount amount : "+discount);
		
		
		
	}

}
