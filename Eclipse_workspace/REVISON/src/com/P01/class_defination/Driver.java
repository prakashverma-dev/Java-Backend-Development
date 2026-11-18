package com.P01.class_defination;



/*

1. How to create a Class In Java :-

 Steps to follow (In same order) -
 
 Access modifiers : public, protected, default, private
 'class' keyword : 'c' must be small if we write Class then it will treat different as Java is case-sensitive language.
 class Name : Class name Must be start with cap letter. 
 class body : class body start with { amd ends with }.
 
 Ex: -
 
 public class Account{
 
 }
 
 
 2. Access Modifiers :- It can use before any class defination, variable, methods, fields etc.
 
 It is four type -
 
 a) default : class Account{ }  --> if no access modifier declared then it is default access modifier.
 
 If anything declared with default, then anyone can use it who belong to same package. REMEMBER, same package members can use default one.
 
   b) 
 
 
 3. package : It is package is collection of similar classes, interfaces and sub-package.
 
 Ex : java.net
 		java.io
 		
 We can create our own package ie. custom defined package and we can use it anywhere depending upon the 

 
 
 
 
 4. Types of Variables by Scope in Java  : -
 
 Based on where a variable is declared and how it is stored in memory, Java defines Variables based on scope in three categories -
 
 a) Local Variables : A variable defined within a block, method, or constructor is referred to as a local variable. 

The Local variable is created at the time of declaration and destroyed when the function completes its execution.
The scope of local variables exists only within the block in which they are declared. Means local variable can not accesible outside of its scope.

Note : Before using local variables, It must be initialize with a value within its scope. As It doesnt hold any default values of datatypes.It only applcable for Instance variables and static Variables.
 
 
 b) Instance variable :
 
 
 d) static Variable :












*/
//public class P01_ClassDefination {
//	
//	
//
//}


class Employee {
	
   // Instance variable (unique to each Employee object)
   String employeeName; 

   // Static variable (shared across all Employee objects)
   static String companyName = "TechCorp"; 

   public void calculateBonus() {
       // Local variable (exists only inside this method)
       double bonus = 500.0; 
       System.out.println(employeeName + " gets a bonus of " + bonus);
   }
}
public class Driver {

	public static void main(String[] args) {

	}

}
