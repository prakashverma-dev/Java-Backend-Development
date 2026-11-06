package com.kodewala.day42_Interface_Marker;

public class Driver {
	
	public static void main(String[] args) {
		//user object -
		
		User u = new User("Prakash", "2344544");
		System.out.println(u.getUserName());
		
		DataCleaner cleann = new DataCleaner();
		
		cleann.deleteMyObject(u);
		
		
		
		
	}

}

/**
 * Gree
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
