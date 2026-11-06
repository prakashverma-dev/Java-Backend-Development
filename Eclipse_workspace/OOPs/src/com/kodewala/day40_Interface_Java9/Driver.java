package com.kodewala.day40_Interface_Java9;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Lambda function defining -
		IAccount acc = ()  -> {
			
			System.out.println("opening Account (Directly from the lambda expression).");
			
		};
		
		acc.openAccount();
		
		
		// - Another lambda function 
		IAccount2 acc2 = (name,add, amount) -> {
			
			System.out.println("opening Account  with Parameters, Holder Name : "+name+", Address : "+add+" and Account Balance : "+amount);
			
			return "Account Opened Successfully!";
		};
		
		String result = acc2.openAccount("Kodewala", "BTM layout", 2000);
		System.out.println(result);

	}

}

/*
 * Lambda Expression : To Implement function/method without its name.
 * 
 * 
 * 
 * In Lambda Expression, We are Interested in How part(logic) rather than what part.
 * 
 * 
 * Functional programming from JAVA8 supports, that says focus in HOW part rather what part.
 * 
 * We need Functional Interface to achieve the Lambda expression.
 * 
 * In lambda Expression, we dont give the name, so it catch the only one abstract method from the Functional Interface, so if we specify the more than one abstract method in functional Interface then while defining lamba expression, it will throw the error as it get confuse which abstract method to call. Hence, only one abstract method must be in ' Functional INterface'.
 * 
 * int add(){  // what part
 * 
 *   // logic 
 * }
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
