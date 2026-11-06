package com.kodewala.day29_Inheritance_Example2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generic Product Details -
		Product p = new Product("Samsung Galaxy 2", "samsung fold 2x", 1, "In-Stock");
//		p.viewProduct();
		
		ElectronicProduct ep = new ElectronicProduct("Iphone", "a good iphone", 2, "IN-stock", true, 2);
//		ep.viewElectronicProducts();
		
		ClothingProduct cp = new ClothingProduct("Jeans", "a slim fit", 4, "IN_STOCK", "32 inch", "Denim Black");
		
		cp.showClothingProducts();

	}

}
