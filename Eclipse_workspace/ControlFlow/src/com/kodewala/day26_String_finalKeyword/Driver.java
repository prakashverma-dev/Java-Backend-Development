package com.kodewala.day26_String_finalKeyword;

/*
 * # final keyword : - final means final we canot change the content of that part. 
 * 
 * we put final before class, method and varibles.
 * 
 * i) final class Account{}  --> if class is final, it cannot become parent or class canot extend it later.
 * 
 * Ex: inbuilt String class is final class, In order to not touch or change anything from String class by extending it to own class.
 * 
 * 
 * ii) final doSomething(){} --> if method is final, it cannot be 'Ovveridden' in any Child Classess.
 * 
 * final method is against the ovveriding and NOT overloading. 
 * 
 * iii) final int UPI_LIMIT_PER_DAY =  100000;  --> if variable is final, We canot change the value of variable in any stage of program.
 * 
 *  Ex: UPI limit for per day transaction is 1lakh, which we keep as final in order to not change this value anywhere in program.
 *  
 *  Note : There is Convention for declaring variable name for 'final' keyword is with all UPPER_CASE.
 *  
 *  'final' with variables called constant in Java.
 *  
 *  Naming convention for constant variables are CAPITAL_CASE. 
 *  
 *  If you writing variable name with Capital case, Developers assumes that It is constant variable.
 *  
 *  
 *  final keyword in java since java 1.0 i.e 1993.
 * 
 * 
 * 
 * 
 * 
 * 
 * */

//i. with final class keyword - when class is final, we canot extends it or it canot become the parent of some child class.

final class AccountManagement{ // now this class can not become parent. means no one can extend this class as this class is final.
	
	
}


//class Account extends AccountManagement{ // Account is child of 'AccountManagement'(Canot)
//	
//	
//}


//ii. with final method keyword - When inside Class some classes we do not want child class should change it via @Override then we make that method as final -

class MobilePhone{
	
	final int UPI_LIMIT_PER_DAY =  100000; 
	
	public void buyPhone(){
		
		// buy Any Android Phone
		System.out.println("MobilePhone.buyPhone()");
		
//		UPI_LIMIT_PER_DAY = 23444; // We canot change here, coz variable is final.
		
	}
	
	// I want this method should not be ovveridden or modify inside child class so I have made it final -
	public final void buyTV(){
		
		// buy TV
		System.out.println("MobilePhone.buyTV()");
	
	}
	
	// I want this method should not be ovveridden or modify inside child class so I have made it final -
	public final void buyHome(){
		
		// buy Any Home
		System.out.println("MobilePhone.buyHome()"); 
		
	}
	
	
	//Overloading method : One method(method name same) have different version to use as per no of arguments type etc -
	public final void buyHome(double price){
			
			// Another version of Overloading method 'buyHome'
			System.out.println("MobilePhone.buyHome().. Overloading method 2");
			
		}

	public final void buyHome(double price, String area){
		
		// Another version of Overloading method 'buyHome'
		System.out.println("MobilePhone.buyHome()... Overloading method 3");
		
	}
	
	
}

class Son extends MobilePhone{
	
	// Son is not happy with Parent decision, so he want to override it with its own decision by buying iphone -
	@Override  // changing or modifying superclass method inside child class.
	public void buyPhone(){
		
		// buy iphone Phone 
		
		System.out.println("Son.buyPhone()... buying iphone"); // Modified.
	}
	
//	@Override // cannot overridden final method
//	public void buyTV() {
//		
//		
//	}
}



public  class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
