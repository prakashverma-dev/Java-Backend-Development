package com.kodewala.constructor.day13;

// Example Solution -

class Product {
	
	// Defining the Instance variable -
	String 	productName;
	double price;
	String description;
	int quantity;
	
	
	// Creating Constructor with following Parameters -
	Product(String _productName, double _price, String _description, int _quantity ){
		
		this.productName = _productName;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;
	}
	
	// Creating Another Constructor with same name but with different no of parameters -
	Product(String _productName, String _description ){
		
		this.productName = _productName;
		this.description = _description;
		
	}
	
	// Creating Constructor with no arguments -
	Product( ){

	}
	
	

}
