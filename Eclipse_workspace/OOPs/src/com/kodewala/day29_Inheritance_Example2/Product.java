package com.kodewala.day29_Inheritance_Example2;


/*
 * 
 * 
 * Let's Design the Ecommerce Product Part with achieving the Inheritance -
 * 
 * 
	Product --> Common functionalities
	
	Electronic Product --> electronic specific
	
	Clothing Product --> Clothing specific
	
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

// We basically now try to achieve Inheritance /We can make Class variable private for achieving encapsulation -
public class Product {
	
	
	//Generic Product Details(Common for all products) -
	String productName;
	String description;
	int quantity;
	String status;
	
	
	public Product(String productName, String description, int quantity, String status) {
		super();
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.status = status;
	}

	public void viewProduct() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
	}
	
	

}
