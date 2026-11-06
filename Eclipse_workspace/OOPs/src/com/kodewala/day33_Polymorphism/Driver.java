package com.kodewala.day33_Polymorphism;


/*
 * # REVISION : -
 * 
 * 
1. Encapsulation -> Hiding info/ Data (Data> Private and Public Setter and Getter)
 
2. Inheritance -> Code written in parent classes can be reused.

3. Abstraction -> Hiding the implementation(Core Logic) and expose on required
functionalities


4. Polymorphism : - 

		- It will allow us to perform same functionality in different way.

		- Your method will behave differently means gives different different output based on actual object i.e situation.
		
		- Same method will behave differently based on actual object.
		
		- method overriding is example of runtime polymorphism.


 # During Polymorphism, In Auto Upcasting : When we perform the up casting by referreing the parent class for creating object for child class.
 
 It go through two steps, while creating the object for child class -
 
 step1 : at a time of compilation, it will check the method present in the parent class or not.
 step2 : after then, at a time of execution(while running), it will call the method from actual or child class.
 
 
 Note : During Polymorphism, In method call, The first preference would be given to the object we creating from child class, if the method is not present then it will go into parent class and will call from there. Suppose, the parent class doesot have method then it will go to Object class.(where it will not)
 
 
 
 * */

// Marking the attendance - Runtime Polymorphism Example -

class Employee{
	
	public void markInAttendance() {
		
		System.out.println("Employee.markInAttendance()... Employee Marking IN");
	}
	
}


class HRManager extends Employee{// HRManger IS-A type of Employee.
	
	@Override
	public void markInAttendance() {
		
		System.out.println("HRManager.markInAttendance()... HRManger Marking IN");
	}
	
	@Override
	public int hashCode() {
		return 23345;
	}
	
}







public class Driver {

	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		e1.markInAttendance(); // Employee Marking IN
		
		
		Employee e2 = new HRManager();
		e2.markInAttendance(); // HRManger Marking IN // Same method will behave differently based on the actual object.
		
		// 1. at the time of compilation, it will check the method's exist in 'Employee' class
		// 2. at the time of execution(while running), it will call the method from actual object i.e HRManager.

		
		System.out.println(e2.hashCode()); // hashCode() method returns a 32-bit signed integer representing the value of the object.

	}

}


