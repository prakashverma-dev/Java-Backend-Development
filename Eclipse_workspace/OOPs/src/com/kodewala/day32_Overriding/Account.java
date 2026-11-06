package com.kodewala.day32_Overriding;

/*
 * # In Inheritance : All class attributes and methods are also present inside the child class who inherites the parent class.
 * 
 * # Method Overriding : During Inheritance, when you do not want the same attribute value or methods from parent class, then we use override to change the parent values in the child class.
 * 
 * 
 * # There are certains Rules of over-ride method -
 * 
 * i. Method name must be same from parent class method.
 * ii. No of Parameters(variable name could be different), Order of Parameters and Parameters type must be same. 
 * iii. Return type should be same except co-variant(means you can return the child of superclass varient e.g : for Object type in parent, String can be used in child as covariant).
 * 
 * iv. Access modifier should be same or widen.
 * 		Ex: parent class(public) --> child class(public)
 * 		Ex: parent class(protected) --> child class(public or protected)
 * v. Exception handling
 * 
 * 
 * 
 * Note : If the override method doesnot follow exact all as above rules, then java will treat a new method to child class.
 * 
 * There is technical annotation from java5 version onwards introduced, @Override , it will check did you properly followed the overriding rules or not.
 * 
 * 
 *# # how to follow Override : Method must follow above all rules and Explicity or even we dont write @Override still java compiler will check it as override method but we explicitly use @Override annoatation to check override metho all rules by java compiler.
 *
 *
 * 
 Note : if Parent class method is private we canot overide it in child class. as proviate is only accessible within in class.
 Note : if method is static we canot override, It will called method hiding. method override concept build for non static methods i.e instance methods not for static methods. If we do that it will call method hiding.
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class Account {
	
	int minBalance = 10000;
	
	public void openAccount(String name, int initBalance) {
		//some functionality -- 100 lines of code
		System.out.println("Opening General Account...");
		
		
	}

}


class SavingBank extends Account{
	
	//To change Parent attributes or methods we use 'overriding' concept of java : Child class got the ability to change the parent class method.
//	minBalance = 2000;
	
	
//	@Override  // Explicitly tell the java compiler that i am overriding the parent method, please check all rules.
	public void openAccount(String _name, int _initBalance ) {  // This is overiding method
		
		System.out.println(" Overriding method for Opening Saving Account...");
		
	}
	
	
	
	//If override method doesnot follow, it treated as new method with same name but different no of arguments -
	public void openAccount(String _name) { // This is overloading method i.e same method name with diffrent of arguments.
		
		System.out.println("a new method considered i.e Overloading method...");
		
	}
	
	//Another Overloading method : Changing the order of arguments -
	public void openAccount( int _initBalance, String _name) {  // This is overiding method
		
		System.out.println("a new method 2 considered i.e Overloading method...");
		
	}
	
	
}
