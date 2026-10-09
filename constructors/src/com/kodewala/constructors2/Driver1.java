package com.kodewala.constructors2;

public class Driver1 {
	public static void main(String[] args) {
		System.out.println("Driver main() Start");// log file
		NotificationService ns = new NotificationService();  // 
		ns.sendNotification("email"); 
		ns.sendNotification("sms");
		ns.sendNotification("");
		System.out.println("Driver main() END"); // log file
	}
}
