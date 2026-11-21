package com.P03.Constructor_Defination;



//Note : Once you define a parameterized constructor for a class, the compiler will not generate any default empty constructor for you. and If I try to call default constructor, It will throw compiler time error coz compiler assumes your object requires specific data to be initialized properly.



// Example : When using atleast a single Paramertized Constructor, then if we call the default constructor without defining it will throw error -

class Person {
	
    String name;

    
    Person(String name) {
    	
      System.out.println("Person.Person()..Parameterized Constructor");  
    }
    
    //We have not defined any Default Constructor in this class, lets see is it automatically called or not when calling default one.    
}




public class Driver03_MultipleConstructors {

	public static void main(String[] args) {

		//Creating object of Person Class with Default constructor -
//		Person p = new Person(); // throws compile time error by stating "The constructor Person() is undefined".
//		System.out.println(p.name);
		
		//creating object of Person Class with Parameter -
		Person p = new Person("Praksh Verma"); // Firstly constructor method will execute then control jumps to object creeated and then rest below executes.
		System.out.println(p.name);  // Person.Person()..Parameterized Constructor
									//  null
		
	}

}


//Example2 : //Hence, If There is any Child Class that Inheritance Parent Class, so we can call the default super() method inside child class coz Parent Class need to define the default constructor to call the super() else throw error -


class Person1 {
	
    String name;
  
    
    Person1(String name) {
    	
      this.name = name;
      System.out.println("Person.Person()..Parameterized Constructor");  
    }
    
    //We have not defined any Default Constructor in this class, lets see is it automatically called or not when calling default one. 
    
}

class Employee extends Person1 {
	
    int id;
    String name;

//	public Employee(String name, int id) {
//		
////		super(); // Compiler ERROR coz trying to call default constructor of PArent Class, where already a Parameterized COnstructor define. Either Remove no constructor from parent or define a default constructor in parent class. 
//		this.name = name;
//		this.id = id;
//	}
	
	public Employee(String name, int id) {
		
		super(name); // Will Not throw Compiler ERROR coz trying to call Parameterized constructor of PArent Class, where already a Parameterized COnstructor define. If we would trying to call default constructor of PArent Class,It would throw the compile time error. 
		this.name = name;
		this.id = id;
	}


   
}