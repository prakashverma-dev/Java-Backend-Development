package com.kodewala.day18.loops;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Creating 4 user object-
		User user1 = new User("Kodewala", "23839490");
		User user2= new User("Rahul", "455455333");
		User user3 = new User("Rahul", "343943939");
		User user4 = new User("Shravya", "97643554");
		
		//Now Want to store user objects in array -
		
		User[] users = new User[5];  // user Object will have type as 'User' 
		
		users[0] = user1; 
		users[1] = user2; 
		users[2] = user3; 
		users[3] = user4;
		
		// to access first user name and mobile number using array stored object -
		System.out.println(users[0].name);
		System.out.println(users[0].mobile);
		
		
		// To access first user name and mobile number using direct object user1  -
		System.out.println(user1.name);
		System.out.println(user1.mobile);
		
		System.out.println(users);
		
		
		
	}

}












