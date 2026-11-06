package com.kodewala.constructor.day15_SuperClass;



// When we are define the constructor java internally always call super() class constructor with no args by default, like for default superCLass it calls Object class constructor internally.

//hence, When we extends child to parent class, then Inteernally while creating of object for child class parent class consturctor get called.

//Note : When we are not writting anything while defining constructor, compiler consider super wth no args i.e super().


// super() : super() always will call super Class constructor even we calling or not, compiler add super() with args .

// Note : when we do chaining and consturctor have args it must explicitly call with args to all costructor created within class.


//SuperClass name 'Admin' is created -
class Admin extends Object{
	
	Admin(){
		
		super(); // if we write or not constructor always calls superclass constructor here super class is Object, so constructor of object class will be called here.
		System.out.println("Admin Constructor with no args get called");
	}
	
//	Admin(int a){
//		
//	}
	
	
	
	
}


public class User2 extends Admin {
	

	String userName;
	String userId;
	String mobile;
	
//	"Constructor with arguments" -
	User2(String _userName, String _userId, String _mobile){
		
//		super()
//		super(20); // first line of constructor is either super or this. If you are not writting super() here still java compiler will invoke the super() with no args only, internally.  // calling super clas constructor without args.
		
		
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
			
	}
	
	User2(){
	
//		super(20); 
		System.out.println("User Constructor with no argument called");
	}
	


}
