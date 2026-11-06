package com.kodewala.day37_Interface_Java7;
/*  
 * 
 * #1. RIVISION So Far...
 * 
 * Class : Blueprint for Object creation.
 * 
 *		   Class got Data and Methods(using Data method will do Business)
 *
 *		Business Problem : Rapido 
 *
 * Rapido Have data : a. Source --> feed to method
 * 					  b. Dest  --> feed to method
 * 					  c. Fare --> result from method (vary INR 100 to 200)
 * 					  d. Waiting Time   --> result from method
 * 					  e. Captain
 * 
 * 
 * 
 * 
 * 
 * #2. Fundamental of Interface/Java7(1.7) Version & Before/Interface will not have any logic :-
 * 
 * 
 * # Interface Java7 Version : Interface will tell other classes what need to be done. It depends on classes, 	how it is getting/being implemented.
 * 
 *  Interface restrict classes what need to done rather developer developing its own way.
 *  
 *  Interface : A central controller which will force what child class needs to be done.
 * 
 * 	Interface tells What?(to be done) and How ?(to implement) 
 * 
 * 	Example :
 * 	void calculateDiscount(int amount, int rate){   // ---> What part--> Abstract
 * 
 * 		// logic to calculate discount  --> HOW part
 * 
 * 
 * 	}
 * 

 * 
 * Note : Java Interface from Version 7(1.7) --> 8 --> 9 All these all seperate improvement in Interface.
 * 
 * How to Declare Interface  :
 * 
 * public interface <Interface_Name> {
 * 
 * 
 * }
 * 
 *  Note: As per Industry standard, Naming Convention for creating Interface, it starts with Capital I then followed by Interface name, in order to distingues from class name in the package from other classes.
 *  
 * 
 * Some KeyPoints Inside Interface :-
 * 
 * All Abstract methods in Interface are 'public abstract' by default if we writing or not.
 * Abstracts method does not have body.
 * All variables in Interface are 'public static final' i.e constant by default.
 * In Interface, we cannot declare any variable except final or constant variable.
 * We cannot create object of Interface. -> IDiscount discount = new IDiscount(); Coz
 * Interface doesnot have its own default constructor like class bydefault empty constructor. Hence not possible -> 		IDiscount disc = new IDiscount();
 * Interface can refer to all the child class. Hence -> IDiscount disc = new FlightBooking();
 * 
 * Class     <-------extends----------- Class
 * Interface <-------implements----------- Class
 * Interface <-------extends----------- Interface
 * 
 * Here, A class can extends another class and implements another Interface but a Interface can only extends another Interface.
 * 
 * 'extends' means ---> You got something I am adding to it. Use other class features and adding some new.
 * 'implements' means --->  not adding something, just implementing whatever there in interface.
 * 
 * 
 * At a time, One class can extends another class as well as implements an interface together.
 * Example: 
 * 
 * public class FlightBooking extends Object implements IDiscount{
 * 
 * 
 * }
 * 
 * 
 * # Advantage of Using Interface In Class : -
 * 
 *   a) Implementation of class gets uniform.
 *   b) Each class follow the guidance of Interface defined methods as it is.
 *   c) If new requirement comes, I'll add into interface, which all child class have to implement.
 *   d) All the developer use the same method name, told by Interface to match.
 * 
 * 
 * #3. Abstract Meaning In English : It doensot exist, It is just a thought/Idea which doesnot exist..
 * 									Ex: Abstract Idea
 * 
 * Meaning existing only as an idea, not as a physical thing/विचार या कल्पना मात्र में न कि कोई भौतिक वस्तु अमूर्त.
 * Ex: It is hard to imagine an abstract idea like ‘eternity’.
 * 
 * 
 * Abstract Existing as an idea: It describes things you can think about or feel, but not physically hold 	(such as love, freedom, justice, or beauty). It is the opposite of concrete.
 * 
 * concrete meaning in English : exist in real or definite; not only existing in the imagination./यथार्थ प्रत्यक्ष 	ठोस मूर्त (काल्पनिक नहीं)
 * 	Ex: Can you give me a concrete example of what you mean?
 * 
 * 
 * 
 *   
 *
 *   
 *   
 *  
 * 
 * */








//Let's take an Example of Interface of Discount on various Booking Platform : -



public interface IDiscount { // What Part
	
	
	//i. Abstract Methods -
	
//	int calculateDiscount(int amount, int rate); // abstract --> Idea or thought //What I want.
	
	public abstract int calculateDiscount(int amount, int rate); // bydefault public abstract is there if we dont write as well.
	
	
	public abstract void calculateDiscountOnTax(int tax);
	
	
	//ii. Abstract variables/data -
	
//	int max_value = 100; // 'public static final' bydefault i.e constant 
	public static final int MAX_VALUE = 100;
}


//There will be class, who will be implementing the what of Interface -

//Check in Same package other classes - 





