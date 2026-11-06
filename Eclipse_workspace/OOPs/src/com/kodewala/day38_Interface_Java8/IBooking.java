package com.kodewala.day38_Interface_Java8;

/*
 * 
 * #1. Interface Java 1.0 to 1.7 :- 1993 to 2007(how INTERFACE USED TO WORK)
 * 
 * 
 * # Problem With Interface Java7 and Before : If we add a new feature to interface which could be applicable to only one class but as per Interface in java7 version, Interface force to implement all methods in all classes.
 * 
 * In Short, Iterface Java7 signs 100% contract with all classes.INteface force to implement in all classes.
 * 
 * Solution1 : We can write empty i.e dummy methods in all not required classes, we used to do this in java7 and before. 
 * Sulution2 : Take help of Inteface8 Version in java, to declare tht method as optional so only required classes can use it.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 
 * 
 * 
 * 
 * #2. Interface Java8 Version : Java Introduces the 'default method' in interface in java8 and that method can become optional to classes which implement the Interface contract.
 * 
 *  Here 'default' is keyword, not a access modifier.
 *  
 *  The default method in Interface would have the body.
 *  
 *  Any method with body can not be abstract method. So Default method is not used abstract keyword. Hence, Default method is not abstract method.
 *  
 *  From Java8 Version can have default method as well as absract method. (abstract method canot be default)
 * 
 * With Interface Java8 Version we are achieving Backward Compatibility.
 * Note : Backward Compatibility : If adding new feature, previous features or functinoality should not be broken, which solved by Interface Java8 version.
 * 
 * Ex: WhatsApp backend is backward Compatible.
 * */

//Interface : Articteck want to control the entire system, so He given in form of Interface.

// Interface : Inferface in the system.
// API(Application programming Interface) : If you exposing something that goes out of system, called Application programming Interface.


//# Advantage of Default method : In real world some of the functionality could only needs to implement in some classes so with default method we can skip in not required classes.



/*

* In This Example : We will develop the three classes as per Interface 'IBooking' which have 5 methods as of now -   a) Bus Booking Class
* 		b) Train Booking Class
* 		c) Flight Booking class  we need to implement based on 5 methods of Interface.
* 
* All three these classes would be develop by three different developers.
* 
* Further In 2020 year, IRCTC launch auto-upgrade feature(if you book seat in sleeper class and if seats are available in AC coaches, then it will get confirmed in AC coach.
* 
* 
*/
public interface IBooking {

//	1. Abstract methods - doest not have the body
	
	
	/** 
	 * Developed In 2020 
	 * Product of MMT(Make of Trip)
	 * */
	public Booking book(); // public abstract void book();
	public void cancelBooking();
	public Booking checkStatus(); // we added our custom Datatype i.e Booking Object.
	public SearchResult search();  // we added our custom Datatype i.e SearchResult Object.
	
	//All these methods have abstract keyword bydefault.
	
	
//  2. default methods : Optional methods to classes (In default method we see the code duplicay)	
	
	
	//This is Optional Method means Interface will not force -(We dont use in BusBooking and FlightBooking Classes) -- Added in 2020(not common requirement)
	public default void autoUpgrade() { // New feature added in Interface for only some of the classes only i.e TrainBooking.
		
		// 500 lines
		System.out.println("IBooking.autoUpgrade()..........");
		
	}
	

	
//3. static method : a method or Utility common for all classes 	
	
	//Common FUnctionality or Utility Functionality for all classes, so we write the logic here itself and we call it in all classes directly -
	static void printTicket(String path, String content) {
		
		// 200 lines for printing the ticket --> Generate the PDF.
		System.out.println("Printing Ticket... static method ");
	}
	

}



