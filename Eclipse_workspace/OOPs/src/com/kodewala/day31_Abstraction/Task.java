package com.kodewala.day31_Abstraction;

/*
 * 
 *  Task: Write a program and achieve abstraction.

	Requirement:
	
	- Place order will be used by other classes to place an order
	- Hide the core functionalities and expose only required functionality
	- Explore if core functionalities are exposed to other classes and do the impact
	analysis.


 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Tips : When building an order placement system, the core functionalities revolve around data validation, business logic execution, and system updates. In a software architecture, these steps are typically orchestrated in a specific sequence behind the abstract placeOrder() method. 
 * 
 * 
 * */






class Order {
	
	
	public boolean placeAnOrder(String phoneNumber, String address, String paymentMethod  ) {
		
		validatePhoneNumberandAddress(phoneNumber, address);
		choosePaymentMethod(paymentMethod);
		
		connectWithDB();
		createOrderID();
		notifyUser();
		
		
		return true;
	}
	
	
	// Core Functionality  -
	private boolean validatePhoneNumberandAddress(String phoneNumber, String address) {
			
			System.out.println("Account.validatePhoneNumberandAddress()... Validating phoneNumber and address.");
			
			return true;
	}
	
	private boolean choosePaymentMethod(String paymentMethod) {
		
		System.out.println("Order.choosePaymentMethod().. selecting Payment Method");
		return true;
		
	}
	
	//Connect with DB -
	private void connectWithDB() {
		
		System.out.println("Account.connectWithDB().. DB Connection");
	}
	
	
	// Core Functionality  - a Implementation
	private String createOrderID() {
		
		System.out.println("Account.createUserID()...creating Order id");
		
		return "some order id..";
	}
	// Core Functionality  - a Implementation
	private void notifyUser() {
		
		System.out.println("Account.notifyUser()... sending notification to user");
	}
	
	
	

}
