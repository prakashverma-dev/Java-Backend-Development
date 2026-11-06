package com.kodewala.day34_Polymorphism_Example2;

public class Client {

	public static void main(String[] args) {

		
		//This is client Machine -
		ProcessOrder pro = new ProcessOrder();
	
		//If user1 selected Economy Class -
		EconomyClass ec = new EconomyClass();
		pro.order(ec);
		
		//If user2 selected Business Class -
		BusinessClass bc = new BusinessClass();
		pro.order(bc);
		
		
		//In Futher two more classes Introduces i.e FirstClass and Premium EconomyClass -
		FirstClass fc = new FirstClass();
		pro.order(fc);

	}

}
