package com.kodewala.constructor.day13;

public class Driver1 {

	public static void main(String[] args) {
		// Calling the Product with Simplified way  -
		
		
		// Calling Same Constructor for different different parameters accordingly -
		ProductSimplified pd1 = new ProductSimplified("Mango", 80, "a fresh mango product", 5 );
		ProductSimplified pd2= new ProductSimplified("banaa", "a fresh banana product");
		ProductSimplified pd3 = new ProductSimplified();
		
		//Calling only the method to display respective here object values -

		
		pd1.productDetails();
		System.out.println("-------------------");
		
		pd2.productDetails();
		System.out.println("-------------------");
		
		pd3.productDetails();

	}

}
