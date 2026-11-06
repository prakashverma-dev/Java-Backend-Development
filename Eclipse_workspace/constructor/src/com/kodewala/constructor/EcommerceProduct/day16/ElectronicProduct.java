package com.kodewala.constructor.EcommerceProduct.day16;


// This is Child of Main Product -

public class ElectronicProduct extends Product{
	
	
	// this Attributes for only Electronic Products only -
	String warranty;

	
	
	// Constructor of this class : 3 attributes from its Parent class and 1 attribute from own class -
	public ElectronicProduct(String _name, int _price, String _productId, String _warranty) {
		
		
		// Initializing all these -- Not again using this. thhis. Calling the parent Consturtcor Initualization -
		super(_name, _price, _productId); // Calling the parent Constructor
		// Super use to initialize all the common fileds from parent.
		
		this.warranty = _warranty; // for this constuctor to initial local variable
		
	}

}
