package com.kodewala.day31_Abstraction;


/*
 * 
 * Revisions : -
 * 
 *  i. Encapsulation --> Hiding Data
 *  ii. Inheritance(Overriding and Polymorphism) --> Code Reusablity
 *  
 *  
 *  
 *  #iii. Abstraction : ---> Hide Core Functionalities with private keyword(so no class can use it) and Expose only Required Functionaliy with 'public' keyword. //Basically Achieving the modular functaionality.
 *  
 *  
 *  Hiding Implementation OR, Core functionalites and only expose the required functionalities to other class and hide the core functionalites.
 *  
 *  expose the required functionalities  --> Means tell what need to be done.
 *  
 *  e.g: openAccount()  ---> what part(only expose what part)
 *  		 core funtionalities ---> How Part(No need to expose how part)
 *  
 *  
 *  # if Developer not following the Asbtraction -
 *  
 *  i. Other developer can play with system i.e other classes which are not meant to be called or expose outside of class only Main class is responsible.
 * 
 * ii. If some some new feature has to add e.g : a pancard should not have more than 6 account. But as soon as develped and it doesnot get called indivisulay in Driver class then it will creeate bug as feature implemented but has not working. 
 * 
 * 
 * Note : Best Example of Asbraction is that : Suppose we have 6 doors in our home and we made all door upfront of main house to each room anyone can enter in any room directly that is not voilates the rule of Abstraction. So we just need to keep one main door and other doors could  in inside of main door, so it now follows the abstraction.
 * 
 * 
 * NOte : Similaries between Encapsulation and Abstraction is that in Encapsulation we makinng our members i.e data private but in Absraction we making our core logic private.
 * 
 * 
 * 
 * 

 * 
 * 
 * */




// Account Opening Functionality - We are try to achieve Abstraction - 
public class Account {
	
	// Responsible for Opening an Account - To Open account openAccount() only responsible i.e here it is called Abstraction rather looking into the core functionality.
	
	
	public boolean openAccount(String name, String address, String pan) {  // Abstract
		
		
		//Core Functionalities  - Implementation
		connectWithDB();
		
		validateNameandAddress(name, address);
		validatePanCard(pan);
		
		findAccountByPanCard(pan); // Further functionality. / New Requirement
		createUserID();
		
		notifyUser();
		
		return true;
	}
	
	
	// Core Functionality  - a Implementation
	private boolean validateNameandAddress(String name, String address) {
		
		System.out.println("Account.validateNameandAddress()... Validating name and address.");
		
		return true;
	}
	 
	// Core Functionality  - a Implementation
	private boolean validatePanCard(String panCard) {
		
		System.out.println("Account.validatePanCard()... Validating panCard.");
		
		return true;
	}
	
	  
	// Core Functionality  - a Implementation
	// to validate this, lets connect to DB -
	private void connectWithDB() {
		
		System.out.println("Account.connectWithDB().. DB Connection");
	}
	
	// Core Functionality  - a Implementation
	private String createUserID() {
		
		System.out.println("Account.createUserID()...creating user id");
		
		return "some user id..";
	}
	// Core Functionality  - a Implementation
	private void notifyUser() {
		System.out.println("Account.notifyUser()... sending notification to user");
	}
	
	// Further Requirement by RBI : one pan card should not have more than 5 account -
	private int findAccountByPanCard(String panCard ) {
		
		System.out.println("Account.findAccountByPanCard().. Finding total account by pan card");
		return 3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
