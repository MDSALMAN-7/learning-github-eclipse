package com.kodewala.constructors2;

public class NotificationService {
	public void sendNotification(String _type) {
		System.out.println("NotificatonService.sendNotification()");
		if(_type.equalsIgnoreCase("sms")) {
			sendSMS();
		}
		else if(_type.equalsIgnoreCase("email")) {
			sendEmail();
		}
		else {
			sendWhatsApp();
		}
	}
	
	private void sendSMS() {
		System.out.println("NotificationService.sendSMS() Start");
		//biz login
		System.out.println("NotificationService.sendSMS() END");
	}
	
	private void sendEmail() {
		System.out.println("NotificationService.sendEmail() Start");
		//biz login
		System.out.println("NotificationService.sendEmail() END");
	}
	private void sendWhatsApp() {
		System.out.println("NotificationService.sendEmail() Start");
		//biz login
		System.out.println("NotificationService.sendEmail() END");
	}
}

