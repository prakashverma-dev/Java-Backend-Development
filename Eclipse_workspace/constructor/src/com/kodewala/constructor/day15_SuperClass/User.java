package com.kodewala.constructor.day15_SuperClass;




/*
 
 # SuperClass : - We have top level and default Super Class is 'Object'

In real-world, can child exist without parent?  NO




Without parent child canot exist in java.
Before creation of object, system firstly creating parent object. Here we have default parent class as 'Object'.


Object   --> create object for Object Class : Object obj = new Object();
  |
  |
SuperUser   --> trying to create object of SuperUser : SuperUser = s = new SuperUser();
  |
  |
 User   --> trying to create an object of user class : User u = new User();



So When we create object for for any Class, Basically system creates first object for all its Parent class.




# constructor chaining : We do constuctor chaing with help of super() and this() -



super()  --> call Parent Class Constructor with no argument/ this will call SuperClass.
super(200) --> call Parent Class Constructor with argument/ this will call SuperClass.
 


this()  --> it will call same class constructor.

//Note : Constructor call i.e this() or super() would in first line only as per java.
/// Note  : While defining Constructor, The first line of constructor is either super() or this() .




# Summary of Constructor :

Why we need Constructor --> To initialize the class/state variables

What are the ways to call Constructor after creation -

 i. new keyword : to call constructor with passing argumnts
 ii. this()  : to call same class constructor
 iii. super()  : to call other class constructor


*/




// SuperClass is created -
class SuperUser extends Object{
	
	
}


public class User extends SuperUser {
	
	
	
	String userName;
	String userId;
	String mobile;
	
	
	
//	"Constructor with arguments" -
	User(String _userName, String _userId, String _mobile){
		
		this(); // calling same class constructor i.e User() constructor get called.
//		this(24); // We can call only one super constructor in the constructor defining eitehr this() or super().
		
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
			
	}
	
	User(){
	
		
		System.out.println("Constructor with no argument");
	}
	
	User(int age){
		
		
		System.out.println("Constructor with one argument");
	}

}
