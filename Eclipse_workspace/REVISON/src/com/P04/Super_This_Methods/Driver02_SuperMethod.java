package com.P04.Super_This_Methods;


/*
 
Note : In Java, Remember Every Constructor of a Class has a default method in first line of code which is super() method, even if we don't mention it. It is with no parameters i.e super(); 

super() method ---> It tells call the constructor method of its super class only i.e parent class. If super class i.e parent class present call if not present call the constructor of 'Object' class.


IF class is extended then super() method makes impact as iT will call the constructir of Parent Class as First line of statement in Base Class Constructor.

Note : If current class is not extented ie It is the only class, then super() method will call the constructor of 'Object' Class. 

super(<pass_a_value>); -->  Call the Parent Parameterized Constructor with passing its value i.e Parent Class constuctor having Args with passing args value as given here.

super();  --> Call the Parent Default Constructor which doest have args.

Note : If we need to pass values to super() constuctor in order to call the parent class Parameterized Constructor which have agrs. Then It is mandatory to use super() method statement with args inside the class constructor.

Note : Object Class doesnt have any paramterized Constructor, only It has default construcor. As In Java, the root java.lang.Object class only defines a single no-argument constructor (public Object()) and does not have any parameterized constructors.
 
 */

// Example1 -
class A{
	
	//Constructor of this class -
	A() {
		
		//super(); // even we dont mention it here.
		System.out.println("A.A() Constructor...");
	}
}



class B extends A{
	
	//Constructor of this class -
	B() {
		// super(); // even we dont mention it here.
		System.out.println("B.B() Constructor...");
	}
}


public class Driver02_SuperMethod {
 
	public static void main(String[] args) {
		
		//Creating object of Class B -
		B obj = new B();

	}

}

/*
 Output -
 
 A.A() Constructor...
 B.B() Constructor...

 */



//Example2 -

class A1{
	
	//Constructor of this class -
	A1() {
		
		super(); // ==> Object(); Call Parent class consturctor i.e Object() constructor with no args, then go below.
		System.out.println("A1.A1() Constructor...");
	}
	
	//Parameterized Constructor for this class -
	A1(int n) {
		
		super(); // ==> Object(); Call Parent class consturctor i.e Object() constructor with no args, then go below.
		System.out.println("A1.A1() Parameterized Constructor...");
	}
}



class B1 extends A1{
	
	//Constructor of this class -
	B1() {
		
		super(); // ==> A1(); Call Parent class constructor i.e A1 Constructor with no args, then go below.
		System.out.println("B1.B1() Constructor...");
	}
	
	//Parameterized Constructor for this class -
	B1(int n){
		
		super(); // ==> A1(); Call Parent class constructor i.e A1 Constructor with no args, then go below.
		System.out.println("B1.B1() Parameterized Constructor ...");
	}
}



class Driver1 {
 
	public static void main(String[] args) {
		
		//Creating object of B1 with no passing values -
		B1 obj = new B1();  // A1.A1() Constructor...
							// B1.B1() Constructor...
		
		// Creating object of B1 with passing a integer values -
		B1 obj1 = new B1(5); // A1.A1() Constructor...
							 // B1.B1() Parameterized Constructor...
		
	}

}




//Example3 -

class A2{
	
	//Constructor of this class -
	A2() {
		
		super(); // Object() ==> Calling the Parent Default Constructor i.e Object(); then go below.
		System.out.println("A2.A2() Constructor...");
	}
	
	//Parameterized Constructor for this class -
	A2(int n) {
		
//		super(n); XX // Object(n) ==> Object Class doesnot have paramterized constructor, only have default Object constructor.
		System.out.println("A2.A2() Parameterized Constructor...");
	}
}



class B2 extends A2{
	
	//Constructor of this class -
	B2() {
		
		super(); // A2() ==> Calling the Parent Default Constructor i.e A2(); then go below.
		System.out.println("B2.B2() Constructor...");
	}
	
	//Parameterized Constructor for this class -
	B2(int n){
		
		super(n); // A2(n) ==> Calling the Parent Parameterized Constructor i.e A2(n) with passing its value as 'n'; then go below.
		System.out.println("B2.B2() Parameterized Constructor ...");
	}
}



class Driver2 {
	
	public static void main(String[] args) {
		
		
		// Creating object of B2 with passing a integer values -
		B2 obj1 = new B2(5); // A2.A2() Parameterized Constructor...
							 //	B2.B2() Parameterized Constructor ...
		
		
	}
	
}

/*
Output -

A2.A2() Parameterized Constructor...
B2.B2() Parameterized Constructor ...

*/


//Example4 -
class A3{
	
	A3(){
		System.out.println("A.A() Default Constructor");
	}
	
	A3(int n){
		super();
		System.out.println("A3.A3() Parameterized Constructor");
	}
}


class B3 extends A3{
	
	B3(){
		super(5);
		System.out.println("B3.B3() Default Constructor...");
	}
	
	B3(int n){
		System.out.println("B3.B3() Parameterized Constructor...");
	}
}


class Driver3 {

	public static void main(String[] args) {

		//Creating object of B3 with no args constructor-
		B3 obj = new B3();
		
		//What will be the output as per above code, see carefully -
		
	//		A3.A3() Parameterized Constructor
	//		B3.B3() Default Constructor...
		
	}

}


//Example5 : Parent Class Constructor attributes Initialization (Constructor Chaining) -


//You use super() or super(arguments) inside a child class constructor to call the parent class constructor and reuse its initialization logic.
//• Implicit call. If you do not write super(), the Java compiler automatically inserts a no-argument super() as the very first line of your child constructor.
//• Explicit call. As noted by developers on Stack Overflow, if the parent class only defines parameterized constructors (and lacks a no-argument constructor), you must explicitly call super(args) to avoid a compile-time error.


class Person {
	
    String name;
    
    // Parameterized Contructor(There is no Default constructor) -
    Person(String name) {
    	
      this.name = name;
      System.out.println("Person.Person()..Parameterized Parent Constructor");  
    }
    
}

class Employee extends Person {
	
    int id;

    Employee(String name, int id) {
    	
        super(name); // Must be the very first statement of Constructor
        this.id = id;
        
        System.out.println("Employee.Employee()..Parameterized Child Constructor");  
    }
    
    
    
}


class TEST {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Praksh Verma", 242424);
		
		System.out.println(emp.name);
		System.out.println(emp.id);
		
		//Output just after just object creation -
		
		/*
		 
		 Person.Person()..Parameterized Parent Constructor
		 Employee.Employee()..Parameterized Child Constructor
		 Praksh Verma
		 242424
		 
		 */
		

	}

}
	