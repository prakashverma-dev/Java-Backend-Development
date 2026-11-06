package com.kodewala.day31_Abstraction;

public class TaskDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order1 = new Order();
		
		order1.placeAnOrder("7284548043", "32 Dharmatala Road North Bally", "UPI");
		
//		order1.validatePhoneNumberandAddress("7284548043", "32 Dharmatala Road North Bally"); // this is well Absracted so we canot access it or call directly core funtionalites.
		
		//Core Implemention are not exposed to other class. They come to proper channel ie by following absractiin to place an order.


	}

}











