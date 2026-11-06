package com.kodewala.day38_Interface_Java8;

public class Driver {
	
	public static void main(String[] args) {
		
		IBooking booking = new TrainBooking();
		
		booking.autoUpgrade();
		
		
	}

}


/*
 * Interface Revision : -
 * 
 * Java7 : 100% contract based --> PPROBLEM : In future, Interface is introducing functionality which is required for some of the classes.
 * 
 * 
 * Java8 : Introduced default method ---> which is optional ---> PROBLEM : Some child class may have same duplicate method to work. e.g : printTicket() reponsible for printing pdf.
 * 
 * 
 * Java8 also Introduced static method to write for performing same task or same functionality which is common for all classes. Coz In Java7 we could not implement the common requirement in Interface.
 * 
 * From Java8 Version We can write -
 * 
 * a) abstract method : Child class must implement as ordered by abstract method.
 * b) default method : child class can skip the methods, ordered by Interface.
 * c) static method : Some functionality common to all classes, so they do not need to implement that in each classes they can directly call it.
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 