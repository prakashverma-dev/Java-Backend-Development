package com.kodewala.day40_Marker_Interface;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Account acc = new Account("Kodewala Academy", "BTM layout", "234243444");
		System.out.println(acc);
		System.out.println(acc.accNo);
		
		
		// We trying to clone the object 'acc' : We need to take permission of inbuilt 'Cloneable' marker Interface.
		
		
		
		//Let's Check cloning of this object 'acc' is allowed or not using 'instanceOf' Operator -	
		//instanceOf : It checks the object is instance of given class or provided Interface or not -

		if(acc instanceof Cloneable) {
			System.out.println("Clonable allowed ");
		}else {
			System.out.println("Clonable denied.");
		}
		
		//For Class lets check -
		if(acc instanceof Account) {
			System.out.println("It is object of Account Class");
		}else {
			System.out.println("It is not object of Account Class");
		}
		
		
		//Let's now clone it -
		
		Account clonedObjOfacc = (Account) acc.myClone(); //myclone() method will return a Clonned object.
	
		System.out.println(clonedObjOfacc);
		System.out.println(clonedObjOfacc.accNo);
		
		
		// Why we use Cloning of an object : Instead of calling constructor again and again we can clone it. OR to avoid creating multiple objects for same data  --> no need to call the Account() constructor method again.

	}

}
