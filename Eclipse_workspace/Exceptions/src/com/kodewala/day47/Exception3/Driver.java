package com.kodewala.day47.Exception3;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Driver.main()...START");
		
		InvoiceService invservice=  new InvoiceService();
		
		invservice.generateInvoice();
		
		// For Discount Cal -
		Discount dis = new Discount();
		
		int result = dis.calDiscount(100, 10);
		System.out.println(result);
		
		System.out.println("Driver.main()...END");

	}

}
