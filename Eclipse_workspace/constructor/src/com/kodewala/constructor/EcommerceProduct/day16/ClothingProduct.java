package com.kodewala.constructor.EcommerceProduct.day16;



// We have Another sub product i.e Clothing Product which has size and color attributes limited to only this class -
public class ClothingProduct extends Product {
	
	
	int size;
	String color;

	
	// Creating constructor for this class which also call constructor for its Parent class using super() -
	// 2 attribute belong to this class and 3 attributes belong to parent class -
	public ClothingProduct(String _name, int _price, String _productId, int _size, String _color) {
		
		
		// with super() we initialized the parent constructor all attributes -
		super(_name, _price, _productId);
		
		
		//Only Initializing constructor attributes for local variable only
		this.size = _size;
		this.color = _color;
	
	}
	

}
