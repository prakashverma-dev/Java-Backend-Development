package com.kodewala.constructor.day14;

public class Driver {

	public static void main(String[] args) {
	
		
		
		Invoice inv = new Invoice(18000, "iphone", "BTM 2nd Stage, Bangalore", "C42333", "PRakash");
		
		
		System.out.println("First Invoice --------");
		System.out.println(inv.amount);
		System.out.println(inv.billingAddress);
		System.out.println(inv.customerName);
		System.out.println(inv.itemName);
		System.out.println(inv.customerId);
		
//		Accessing Static variables -
		System.out.println(inv.gst);
		
//		OR, 
		System.out.println(Invoice.gst);  // accessig static variable with static way
		
		
		// For another customerINVOICE -
		Invoice inv1 = new Invoice(12000, "laptop", "Kolkata, Westbengal", "443ccc", "Priyanshu");
		
		System.out.println("Second Invoice --------");
		System.out.println(inv1.amount);
		System.out.println(inv1.billingAddress);
		System.out.println(inv1.customerName);
		System.out.println(inv1.itemName);
		System.out.println(inv1.customerId);
		
//		Accessing Static variables -
		System.out.println(inv1.gst);

	}

}








