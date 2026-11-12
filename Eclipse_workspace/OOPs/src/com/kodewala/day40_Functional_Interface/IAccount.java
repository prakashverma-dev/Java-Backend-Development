package com.kodewala.day40_Functional_Interface;
/*
 * # Functional Interface/ Single Abstract Method(SAM) Interface : Interface which got only one abstract method.
*  
*  	  	It is Introduced in Java 8 Version with annotation @Functional, To Implement the 'Lambda Expression' In Java.
* 		 Why Functional Interface  --> To achieve the lambda Functionality, The reason Java Introduced a feature called 'Functional Interface'.
*  		Lambda Expression says Interested in 'how' part not what part; To Implement the method without its name.
*  		To achieve the lambda Functionality, 
*  		Functional Interface is use to achieve lambda function in Java.
*  
*   
 * 
 * From Java 8, Java Introduced a innotation ie @FunctionalInterface called Functional Interface, It force explicityly to check Functional Interface rules(means to have only one absract method check), if user makes some mistake. Without it can also work.
 * 
 * 
 * 
 * @FunctionalInterface   : To check explicitly that we are following all rules of Functional Interface or not.
 * 
 * 							When this is i.e @FunctionalInterface declare above Interface, It tells it is Functional Interface anyhow.
 * 
 * 
 * 

*  
*   Lambda Expression : To Implement function/method without its name, called Lambda Expression. It is possible only one method is there, The reason introduced FUnctional Interface which has only one abstract method.

 * 
 * 
 * */

@FunctionalInterface // Optional - To following all rules of functional Interface or not.// Explicitly specifying.
public interface IAccount {
	
	void openAccount(); // only one abstract method - SAM(Single Abstract method) //Bydefault there 'public abstract'
//	void closeAccount(); //If we add this It will become normal interface coz here one more abstract method. 
	
	//default method or any other methods but NOT more than one abstract method.
	default void addBeni() { //In Java 9 
		
	}
	
	// private method --> Introduced in JAVA9.
	private String connectDB() {
		return null;
	}
	
	// static method - In Java 9
	static void printMarkSheet() {
		System.out.println("IAccount.printMarkSheet()...Printing Marksheet");
	}

}

// IMP**
// Let's Check This Interface is Functional Interface or not after extending another Functional Interface -

@FunctionalInterface
interface IAccount2 extends IAccountManagement{
	
//	void openAccount(); // If I uncomment this, then We have total 2 abaract method here (1 own Absratct method + 1 PArent Absratct method)
	
	//Hence, this is Not Functional Interface.
	
}


//Note : After extending another Functional Interface here, Technically we got two absract methods inside the child Interface 'IAccount2'. 

















