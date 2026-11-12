package com.kodewala.day38_Interface_Java8;

public class Driver {
	
	public static void main(String[] args) {
		
		IBooking booking = new TrainBooking();
		
		booking.autoUpgrade();
		
		
	}

}



 