package com.kodewala.day29_Inheritance_Example2;

public class ElectronicProduct extends Product {
	
	
	// All product class attributes will be here with this class specific attributes also -
	boolean isWarranty;
	int warrantyYear;
	
	
	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarranty, int warrantyYear) {
		
		super(productName, description, quantity, status); // to call the Parent class constructor here i.e Product Class constructor 
		
		this.isWarranty = isWarranty;
		this.warrantyYear = warrantyYear;
	}
	
	
	public void viewElectronicProducts() {
		
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);  
		
		   
		System.out.println(isWarranty);   
		System.out.println(warrantyYear);
	}


	
	
	
	
	
	
	

}
