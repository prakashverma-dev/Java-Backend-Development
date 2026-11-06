package com.kodewala.constructor.day14;

public class Driver2 {

	public static void main(String[] args) {

		// Calling the NotificationService Method -
		

		System.out.println("Driver2.main() START"); /// log file
		
		NotificationService ns = new NotificationService();
		
		ns.sendNotification("sms");
		ns.sendNotification("email");
		ns.sendNotification("other");
		
		System.out.println("Driver2.main() END"); /// log file
	}

}
