package com.kodewala.day39_Interface_Java9;

import com.kodewala.day38_Interface_Java8.Booking;
import com.kodewala.day38_Interface_Java8.SearchResult;

/*
 * 
 * ONE RULE IN LIFE, ALL BEAUTIFUL THINGS COME WITH SOME PROBELM!
 * 
 * 
 * #1. PROBLEM with Java8 Version Interface :-
 * 
 * With Java8 Interface, the default method introduce the code duplicasy within the Interface, tht could be common in two or more default methods.
 * 
 * Java9 ---> Introduced private method in interface, It will help us to avoid code duplicacy.
 * 
 * private method : If you have some logic that can be use again and again in 'default method' then we create 	private method to reduce the duplicacy in the 'default method'.
 * 
 * 
 * 
 * Note : With Java9 version, we can able to write 4 type of methods  -
 * a) Abstract method ---> Java7
 * b) default method  --> Java8
 * c) private method  --> Java9
 * d) static method  ---> Java8
 * 
 * Note : we can make 'private method' with 'static' as well in order to use it inside the static method as well.
 * 
 * 	private void connectToDB() {
		
		System.out.println("IBooking.connectToDB()");
	}
	
	
	OR, Can -
	
	
		private static void connectToDB() {
		
		System.out.println("IBooking.connectToDB()");
	}
 * 
 * 
 * 
 * #2. Types of Interface In Java :
 * 
 *  a) Normal Interface : More than one abstract methods.
 *  b) Functional Interface/Single Abstract Method(SAM) Interface : Interface which got only one abstract method.
 *  c) Marker Interface/Tag Interface : Interface without methods i.e NO methods at well i.e empty Interface.
 *  
 *  Marker Interface help us to perform some special activity. Ex: Serialization, Cloning.
 *  
 *  
 *  Ex: Functional Interface -
 *  public interface IInvoice{
 *  
 *  		void doInvoice();  // Functional Interface(only one abstract method i.e public abstract void doInvoice() )
 *  
 *  }
 *  
 *  
 *  Ex: Marker Interface/Tag Interface : Marker interface to mark something.
 *  public interface IInvoice{
 *  
 *  
 *  }
 * 
 * 
 * */

public interface IBooking {
	
	
//	1. Abstract methods - doest not have the body
	
	/** 
	 * Developed In 2020 
	 * Product of MMT(Make of Trip)
	 * */
	public abstract void book();
	public void cancelBooking();
	public Booking checkStatus(); 
	public SearchResult search(); 

	
//  2. default methods : Optional methods to classes (In default method we see the code duplicay)


	public default void autoUpgrade() { 
		
		// 500 lines(checking Status, Connecting to DB(25 Lines), and then Upgrading)
		//Here conneting to DB is code duplicacy in two default methods 
		connectToDB();
		System.out.println("IBooking.autoUpgrade()..........");
		
	}
	
	//	Another default method - Optional method
	public default void sendNotification() {
			
		// 300 lines --> Connecting to DB(25 Lines), get user details and then send Notification 
		connectToDB();
		System.out.println("IBooking.sendNotification()");
		
	}
	
	
//3. private method : to avoid code duplicay inside the default method (Introduced in Java9)
	private static void connectToDB() {
		
		System.out.println("IBooking.connectToDB()");
	}
	
	
	

//4. static method : a method or Utility common for all classes 

	static void printTicket(String path, String content) {
		
		// 200 lines for printing the ticket --> Generate the PDF.
		connectToDB(); // to use here in static method, we need to private method as static.
		System.out.println("Printing Ticket... static method ");
	}
	

}