package com.kodewala.constructor.EcommerceProduct.day16;

public class Driver {

	public static void main(String[] args) {

		// Creating object for Electronic Product -
		ElectronicProduct ep = new ElectronicProduct("Iphone", 18000, "123423fd", "2 years");
		
		System.out.println(ep.name);
		System.out.println(ep.price);
		System.out.println(ep.product);
		System.out.println(ep.warranty);
		
		// Creating object for clothing Product -
		ClothingProduct cp = new ClothingProduct("T shirt", 799, "343dff", 42, "Black");
		
		System.out.println(cp.name);
		System.out.println(cp.price);
		System.out.println(cp.product);
		System.out.println(cp.size);
		System.out.println(cp.color);

	}

}
