package com.kodewala.constructor.day12;





/* 
  
 
  
  
#1) Class and Object In java Overview : -

 
 
Class : class is nothing, It's a blueprint of same template. This is existing.
Object : When we create the object from class, that is the real entity.
          we need object to represent real entity in the system.
          Objects store in HEAP memory in system.

SBI --> 100k Accounts

There are suppose 100K accounts in SBI online, and when some user enters to i.e login then the object get created for them with different details of them. and wheneever any user logout or wait for 5 minuts we destroy the object and again he has login to create the object from existing class in SBI system.

class AccountHolder{

    Data(amount, account, name, email, phoneNumber etc) + Logic(work/task)
}

class : AccountHolder --> it is a class which represent the template for AccountHolder data.

Object : When a user logins, that's when object get created and represent the real entity with his data(name, accountNo, name etc.)

Note : class is just a blueprint and object is real entity in the system.






 
 
#2) Constructor : It will help us to initialize the state for Object. State here is values for instance variables.
 Constructor means construct/set the state for object.
 
A constructor in Java is a special method that is used to initialize objects.

The constructor is called when an object of a class is created.

Every class has their default constructor if we dont create explicitily. The default constructor look like skeliton only with no any attributes/parameters : AccountHolder() { }

It can be used to set initial values for object attributes.


To Create Constructor Method : Keep the same name as Class NAme and 'public' access modifier, then followed by parameters where pass local variables -


Rules to Create Constructor Method :-

Constructor Name must be same as Class Name.
Constructor method does not have any return type. 
We can define Constructor any where in the class, there is no order But best practice to define in the beginning of the class as It shows initialization of class variables to object.



Syntax for Creating Constructor : 

ConstructorName(){


}  // Optional Access Modifier and Parameters but ConstuctorName must match with ClassName.


# There are two Type of Constructor In Java : -

a) Default Constructor :

b) Parameterized Constructor :


*/

// a) Default Constructor : If we create class and dont create constructor Class Automatically create default constructor like - Algebra(){  }

class Algebra{
	
	
	int add(int a, int b) {
		
		return a + b;
	}
	
	// Let's call this method in Main Method or Driver Class -
	
	//Let's see Default Constructor get called or not by printing something -
	
	//	Algebra() {
	//		
	//		System.out.println("Default Constructor 'Algebra' get called...");
	//		
	//	}
	
}




// b) Parameterized Constructor : Here we create class with its Attributes i.e Instance Variable that object get each copy when object get created and we can specify different value to these instance variable while creating object with help of 'Constructor Parameterized' -

// Purpose of Parameterized Constructor is to Initialize the Instance Variables for Object when they created by its class -

class Algebra1{
	
	// Instance variable we created -
	int a;
	int b;
	
	
	int add() {
		
		return a + b;
	}
	
    int sub() {
    	return a - b;
    }
    
	// Parameterized Constructor Created  -
	Algebra1(int x, int y) {
	
	System.out.println("Parameterized Constructor of 'Algebra1' class get called...");
	
	 a = x; // Setting x value into respective instance variable, when object created and it get accessed.
	 b = y; // Setting y value into respective instance variable, when object created and it get accessed.
	 
	 //Here x and y is local variables and a, b are Instance Variables.
	
	
}
	
}

/*

# 'this' keyword use in Constructor : When Constructor Parameters(local variables) has same name as Instance variables, We use use 'this; to update the class variable i.e Intance variable correctly inside constructor method; where 'this' refers to that object when constructor get called.


While Creating Constuctor with parameters(local variables), we can assign these value to respetive intance variable with two ways -
i) if we used different local variable names : direclty assign i.e a = x; here x is local variable and a is respective intance variable.

b) if we want to use same variable name for local and intance variable, then it get conflict to assign as local variable belong to class, so we canot modify it : hence we use 'this' keyword which refers to current object 



Note : The this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.

Note : You primarily use this inside a constructor method or a normal method for shadowing resolution i.e when a local parameters of method name is exactly the same as an instance variable or class variables.


*/


class Algebra2{
	
	// Instance variable we created -
	int a;
	int b;
	
	
	int add() {
		
		return a + b;
	}
	
    int sub() {
    	return a - b;
    }
    
	// Parameterized Constructor with same parameters name as Intance Name(here constructor variables belongs to local variables) -
	Algebra2(int a, int b) {
	
	  System.out.println("Parameterized Constructor of 'Algebra1' class get called with same variable names...");
	
	 this.a = a; // Here first 'a' refers to Instance variable not local variable and this refers to object when created with this constructor.
	 this.b = b; // Here first 'b' refers to Instance variable not local variable.
	 
	 // Here 'this' keyword refers to 'the object' when this constructor get called.
	 
	 //Here a and b is local variables and a, b are Instance Variables, To difference this we used 'this' keyword which refers to current object when this constructor get called.
	
	
	}



}
	
	
	
	