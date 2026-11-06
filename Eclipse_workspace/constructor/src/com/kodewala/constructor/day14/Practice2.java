package com.kodewala.constructor.day14;


//Developing Various Notification Service : To practice the Debughging f5, f6, f7

class NotificationService {

	public void sendNotification(String _type) {
		
	
		System.out.println("NotificationService.sendNotification()");
		
		// .equalsIgnoreCase(<pass_string>)   ==> to compare two strings.
		
		
		if(_type.equalsIgnoreCase("sms")) {
			
			sendSMS();
			
		}else if(_type.equalsIgnoreCase("email")) {
			
			SendEmail();
			
		}else{
			
			sendWhatsApp();		
			
		}
			
	
			
	}

	
	
	private void sendSMS() {
		
		System.out.println("NotificationService.sendSMS() START");
		
		//bizz logic
		
		System.out.println("NotificationService.SendEmail() END");
		
	}
	
	private void SendEmail() {
		System.out.println("NotificationService.SendEmail() START");
		
		//bizz logic
		
		System.out.println("NotificationService.SendEmail() END");
		
	}
	
	private void sendWhatsApp() {
		System.out.println("NotificationService.sendWhatsApp() START");
		
		//bizz logic
		
		System.out.println("NotificationService.SendEmail() END");
	}

}
