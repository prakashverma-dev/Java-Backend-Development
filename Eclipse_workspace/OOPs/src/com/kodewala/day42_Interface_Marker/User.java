package com.kodewala.day42_Interface_Marker;

public class User implements Deletable {
	
	private String userName;
	private String id;
	
	
	public User(String userName, String id) {
		super();
		this.userName = userName;
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	
	

}
