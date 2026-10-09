package com.kodewala.constructors5;

public class Signup {
	public void doSignup(String _name,String _type,String _country) {
		User user1 = new User(_name,_type,_country);
		
		System.out.println(user1.name);
//		System.out.println(user1);
	}
}