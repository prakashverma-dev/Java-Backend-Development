package com.kodewala.day42_Custom_MarkerInterface;


//This is Class Where we check Implemented Custome marker Interface 'Deletable' working or not -
public class User implements Deletable {
	
	private String userName;
	private String id;
	
	
	public User(String userName, String id) {
		super();
		this.userName = userName;
		this.id = id;
	}

	// getter and setter for userName only -
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	
	

}
