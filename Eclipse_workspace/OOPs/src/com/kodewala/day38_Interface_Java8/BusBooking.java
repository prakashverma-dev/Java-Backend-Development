package com.kodewala.day38_Interface_Java8;

// this class must agree to implemente the IBooking Interface all abstract methods into the concrete method -
// 100% contract -
public class BusBooking implements IBooking {

	@Override
	public Booking book() {
		// TODO Auto-generated method stub
		System.out.println("BusBooking.book()");
		return null;
		
	}

	@Override
	public void cancelBooking() {
		// TODO Auto-generated method stub
		System.out.println("BusBooking.cancelBooking()");
	}

	@Override
	public Booking checkStatus() {
		
		Booking booking  = new Booking();
		
		booking.setBookingId("MMT256");
		booking.setStatus("CONFIRMED");
		
		return booking;
	}

	@Override
	public SearchResult search() {
		
		SearchResult result = new SearchResult();
		
		return result ;
	}
	
	
	//Common FUnctionality to achieve -
	void printTicket(String path, String content) {
		
		// We directly call the static method from Iterface as This functionalitu and logic is common for all classes -
		
		IBooking.printTicket(path, content);
		
		
	}

	

	

	
}
