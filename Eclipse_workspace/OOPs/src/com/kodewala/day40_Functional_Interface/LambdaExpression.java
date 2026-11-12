package com.kodewala.day40_Functional_Interface;


/*
 * Lambda Expression : You can implement a method/function without its name. It uses 'Anonymous Function to implement'. 
 * 
 * It is also called as Functional Way of Writing code.
 * 
 * Functional Way/In Lambda Expression : Interested in how part(logic), not in What part(declartion).
 * 
 * int add() // what part
 * {
 *    
 *    // how part(logic)
 *  
 *  }
 *  
 * From JAVA8 Functional programming supports In Java, that method can be implemented without its name, which possible using Function Interface.
 * 
 *  We need Functional Interface to achieve the Lambda expression.
 *  
 *  
 * * In lambda Expression, we dont give the name, so it catch the only one abstract method from the Functional Interface, so if we specify the more than one abstract method in functional Interface then while defining lamba expression, it will throw the error as it get confuse which abstract method to call. Hence, only one abstract method must be in ' Functional INterface'.

*   
* 
In String API, we will do all code will be do with lambda expression.
*  
*  Represent lambda Expression, we use -> 
Lambda Expression must need to close with (;) as we need to close the statement.
To implement the lambda Expression, method must be belong to Functional Interface.


		// Ealier -
	
		IAccount accObj2 = openAccount(){
			
			System.out.println("opening Account of openAccount() method, (Directly from the lambda expression).");
			
		};
		
		Without method name we have implement It will look like this -
		
			
		IAccount accObj2 = ()-> {
			
			System.out.println("opening Account of openAccount() method, (Directly from the lambda expression).");
			
		};

 * */ 







//Coding -->

// Note: To use Declared Interface method, we used to implements in our class and then we used to ovveride the method in order to define the functionality for that method and then We used to create Object of class and call in driver class but with help of 'Lambda Expression' we can define that method without using the method name from Functional Interface and It could skip two steps to call the method -


class WithoutLambdaExpression implements IAccount{
	
	@Override
	public void openAccount() {
		System.out.println("LambdaExpression.openAccount()");
	}

}



// With Lambda Expression -
class LambdaExpression {
	

	public static void main(String[] args) {
		
		
		//Lambda Expression : It allows use to skip two steps of tradition way of implments in the class and finally create object in driver and then call it. But with Lambda Expression, we can directly define the method as well as call the method in same place -
		
		//'IAccount' is type of Functional Interface. Here, We defining the method logic for 'IAccount' Interface declared method which is only one method name 'openAccount()' -
		//Basically, we defining method 'openAccount()' here -
		IAccount accObj = ()-> { System.out.println("opening Account of openAccount() method, (Directly from the lambda expression).");};
		
		
//		OR, 
		
		IAccount accObj2 = ()-> {
			
			System.out.println("opening Account of openAccount() method, (Directly from the lambda expression).");
			
		};
		
		accObj.openAccount(); // Here we dint define the method name i.e 'openAccount' but it is called.
		accObj2.openAccount(); 
		
		
		
		
		// Defining another lambda Expression where method from 'Function Interface' got parameters in that i.e 'accountDetails'  method -
		// We writing Lambda Expression for 'accountDetails()' method -
		IAccountManagement accMang = (name, add, amount) -> {
			
			System.out.println("Account Details with Parameters, Holder Name : "+name+", Address : "+add+" and Account Balance : "+amount);
			
			return "Account Details Fetched Successfully!";
			
		};
		
		String result = accMang.accountDetails("Kodewala", "BTM layout", 2000);
		System.out.println(result);

	}

}

