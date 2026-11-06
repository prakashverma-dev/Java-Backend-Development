package com.kodewala.day29_Inheritance;

/*    
 * 1. Encapsulation : Data Hiding by making Fields or data private and providing 'public' setter method to modify the data and public getter method to access or read the data --> We achieving overall Security.
 * 
 * 
 * 2. Inheritance : Inheritance says that if one class developed a functionality and another class want the same functionality, then they can become child of that class by using 'extends' keyword and starts using all functionality of that class.
 * 
 * When we become child we get all properties of parent.
 * 
 * Functionalities developed by parent class can be re-used by child class.
 * 
 * Syntax : <ChildClass> extends <ParentClass> { 
 * 
 * 		//here 'extends' represent 'IS-A' relation between ChildClass with ParentClass.
 * 
 * }
 * 
 * 
 * Ex: Naming MUST NATURAL exist for Inheritance -
 * 	
 * 		Manager extends Employee
 * 	   Car extends Vehicle
 * 		SavingAccount extends Account  -->  SavingAccount is Account
 * 		cricket extends Sports   --> cricket is Sports
 * Manager IS-A Employee
 * Company HAS-A Employee 
 * 		
 * 
 * 		Engine extends Car --> Engine is Car(XXX) It doesnot exist.
 * 
 * 
 * 
 * Note : In object-oriented programming, inheritance represents an "IS-A" relationship. Ex: Motorola extends Android, Here Since a Motorola phone is a specific type of Android phone, it fits the concept of inheritance perfectly. Idealyy, In inheritance, IS-A relationalship must exist in real world and naturally it is.
 * 
 * 
 * Advantage of Inheritance : Re-using Parent Properties with some add-one rather developing from scratch everthing.
 * 
 * 
 * Why to use Inheritance : - 
 * 
 * Reusability -- > someone developed and you are using it.
 * 
 * Example : Can you implement notification functionalities > sending SMS and email
	
	1. Write the code from scratch(without Inheritance) : Take Time (2 months) > Trust > Money
	
	2. Check if similar kind of functionalities already exists in the system(With Inheritance) : 
			You will start reusing the existing notification functionalities
			Time reduced + testing effort reduced + Get trust > money saved + 7days to done.
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
 * 
 * 
 * 
 */




//Example : OPEN THE Bank Account -




// Existing Class in the system (Developed by somebody else) - use to open bank account
public class Account {
	
	
//	logic - 500 Lines of Code (tested and working)
	public void openBankAccount(String name, String address, String type) {
		
		System.out.printf(" Name : %s, Address : %s, Bank Type : %s",name,address,type);
		System.out.println(name);
		
		System.out.println(""); //sysou
		
		String course = "Ram SIta";
//		System.out.println("variable : " + variable);
		
		
		
	}
	



}













