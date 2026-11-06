package com.kodewala.day38_Interface_Java8;

public class FlightBooking implements IBooking{

	@Override
	public Booking book() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelBooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Booking checkStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchResult search() {
		// TODO Auto-generated method stub
		return null;
	}

	
	//Common FUnctionality to achieve -
	void printTicket(String path, String content) {
		
		IBooking.printTicket(path, content);
	}



}
