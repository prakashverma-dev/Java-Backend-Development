package com.kodewala.constructor.day13;


class ProductSimplified {

	// Defining the Instance variable -
		String 	productName;
		double price;
		String description;
		int quantity;
		
		
		// Product having 4-attributes -
		ProductSimplified(String _productName, double _price, String _description, int _quantity ){
			
			this.productName = _productName;
			this.price = _price;
			this.description = _description;
			this.quantity = _quantity;
		}
		
		// Product having 2-attributes -
		ProductSimplified(String _productName, String _description ){
			
			this.productName = _productName;
			this.description = _description;
			
		}
		
		// 	Product having no-attributes -
		ProductSimplified(){
			
			System.out.println("This constructor doesnot have any parameters!");
		}
		
		
		// To Simply the product details when it get access with either of the above constructor we can create normal method which will print the product details(This helps to not print product details for each constructor created we can simply call this method display) -
		
		//this helps to not call or access product attributes again and again for each consructor get created, we simply call this method -
		
		void productDetails() {
			
			System.out.println(this.productName); 
			System.out.println(this.price); 
			System.out.println(this.description); 
			System.out.println(this.quantity); 
		}
		
		
	
	
}



