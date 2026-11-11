package com.kodewala.day27_Prerequisite;

public class User {
	
	String userName;
	String userId;
	String mobileNo;
	
	
	public User(String userName, String userId, String mobileNo) {
		super(); // NOte : First line of Constructor must be either super() or this(). By-default we get super() with no arguments, even though if we not writting.
				// It will call 'Object' Super class.
		this.userName = userName;
		this.userId = userId;
		this.mobileNo = mobileNo;
	}
	
	

}
