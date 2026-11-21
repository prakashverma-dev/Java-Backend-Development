package com.P04.Super_This_Methods;

/*
 
 
 # Inheritance : - Inherirance is a speical feature which helos copy all the features from upper class. 
 
 Inheritance has 'IS' A relation with parent Class.
 Ex: Fortunure is a Car
 	 Android is a MobilePhone
 	 Samsung is AndroidPhone  --> Samsung is Child and AndroidPhone is Parent 
 Class has 'HAS' relation with Class Attributes.
 
 
 // Parent Class or Super Class or Base Class -
 class calculator{
 
 
 add()
 sub()
 multi()
 div()
 
 }
 
 //Here by extending measn copy all features of Super Class 'Calculator' -  
  
 // Child Class or Sub Class or Derived Class -
 class AdvanceCalculator extends Calculator{ // AdvanceCalculator 'IS A" Calculator
 
 
 }
 
 Note : Child class also called as Sub Class or Derived Class.
 		Parent Class also known as Super Class or Base Class.
 		
 For Child Class ---> Parent Class
 For Super Class ---> Sub Class
 For Derived Class ---> Base Class
 
 
 
 
 */
// Example1 : Basic How Inheritance works and First time Constructor creation -
class MobilePhone{
	
	String name = "Galaxy Z 2";
	
	//lets's Explicitly define the default constructor to see is it getting called or not -
	public MobilePhone() {
		
		super();
		System.out.println("In Mobile Class Constructor");
	}
	
 
	//getter for 'name' field -
	public String getName() {
		
		System.out.println("From the Base Class Mobile Phone");
		return name;
	}
	
	
}

class Android extends MobilePhone{
	
	String name = "Iphone 2";
	
	public Android() {
 
		super();
		System.out.println("In Android Class Constructor");
		
	}
	
}

class Samsung extends Android {
	
	
	public Samsung() {
		
		super();
		System.out.println("In Samsun Class Constructor");

	}
}



public class Driver01_Inheritance {

	public static void main(String[] args) {
		
		System.out.println("Driver1.main()...START");
		//Creating object of Sub-Class 'Samsung' -
		Samsung sam = new Samsung(); // Default consturctor calling but we canot see 
		
//		System.out.println("Instance Variable : "+sam.name);
//		System.out.println("Based Class Method : "+sam.getName());
		
		
		System.out.println("Driver1.main()...END");

	}

}
