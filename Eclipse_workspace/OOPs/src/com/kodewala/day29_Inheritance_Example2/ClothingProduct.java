package com.kodewala.day29_Inheritance_Example2;

public class ClothingProduct extends Product {
	
	String size;
	String color;
	
	
	public ClothingProduct(String productName, String description, int quantity, String status, String size,
			String color) {
		
		super(productName, description, quantity, status);
		
		this.size = size;
		this.color = color;
	}
	
	public void showClothingProducts() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(size);
		System.out.println(color);
		
	}
	
	

	
	

}
