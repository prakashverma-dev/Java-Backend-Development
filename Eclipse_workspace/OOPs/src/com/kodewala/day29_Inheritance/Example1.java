package com.kodewala.day29_Inheritance;

// Parent class -
class Employee{
	String name = "Ankit";
	String address = "Bangalore";
	private String empCode = "12cdd1"; // Will not be visible outside of this class.
	
	public void markAttendanceIn(String empID) {
		System.out.println("Marking Attenace : "+empID);
	}
}

//Child Class -
class Manager extends Employee{  // Manager IS-A Employee
	
	public void doSomething() {
		
		System.out.println(name);  //using parent class attributes
		System.out.println(address);
//		System.out.println(empCode); // private variable not available
		
		markAttendanceIn("2534de"); // using parent class methods
		
	}
	
}





public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager ep = new Manager();
		
		ep.doSomething();
		
		

	}

}

//Inheritance : Remove Code Duplicasy 
