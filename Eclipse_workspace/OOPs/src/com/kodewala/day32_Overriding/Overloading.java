package com.kodewala.day32_Overriding;


/*
 * # Method Overloading In Java :- Having multiple version of same method within same class, called method overloading with just following one rule must : Changed no of paramters, changed order of arguments or changed type of arguments.
 * 
 * Rules for Overloading : -
 * 
 * i. Works within the class
 * ii. you have multiple version of same method with same method name.
 * iii. Order of args, no of args and type of args should be different.
 * iv. There is no role of access modifier as, It is within same class.
 * v. There is no role of return type of method, It could be any.
 * vi. Overloading method can be static type as well.
 * 
 * FOr calling the overloading method : We pass the arguments based on overloading method defined, in order to call right overloading method.
 * 
 * Ex: string() and join() methods are inbuilt overloading methods in java and many more.
 * 
 * 
 * Why we do Overloading method -
 * 
 * i We want to give flexibility to the client or user. EX: we can login based on various ways available.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */


class Login {
	
	private void doLogin(String mobile, int otp) { //v1
		
		System.out.println("Login.doLogin()");
		
	}
	
	//If someone doesn't have mobile and otp -
	public String doLogin(String email, String password) {  //v2
		System.out.println("Login.doLogin()");
		
		return "some value";
	}
	
	//If someone doesn't have mobile and otp and email password -
	static void doLogin(String gmail) {  //v3
		System.out.println("Login.doLogin()");
		
	}
}
