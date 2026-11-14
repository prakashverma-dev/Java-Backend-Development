package com.kodewala.day27_Prerequisite;

public class User {
	
	String userName;
	String userId;
	String mobileNo;
	
	
	//Writing Static Block - execute when this class will be loaded --> class will be loaded when we try to create objects.
	static {
		System.out.println("I am in the static Init Block 1..");
	}
	
	static {
		System.out.println("I am in the static Init Block 2..");
	}
	
	public User(String userName, String userId, String mobileNo) {
		
		super(); // NOte : First line of Constructor must be either super() or this(). By-default we get super() with no arguments, even though if we not writting.
				// It will call 'Object' Super class.
		
		System.out.println("User.User(String userName, String userId, String mobileNo)... Constructor");
		this.userName = userName;
		this.userId = userId;
		this.mobileNo = mobileNo;
	}
	
	static {
		System.out.println("I am in the static Init Block 3..");
	}
	
	

}
