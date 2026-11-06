package com.kodewala.constructor.day15_SuperClass;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// In case i want to create an object of user class?

		User user = new User("kodewala", "U123", "09876545670");
		
		System.out.println(user.mobile);
		System.out.println(user.userId);
		System.out.println(user.userName);
	}

}
