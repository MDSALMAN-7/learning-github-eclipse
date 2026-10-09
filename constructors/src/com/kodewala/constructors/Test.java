package com.kodewala.constructors;

public class Test {
	// Data 
	int amount; // this is the instance variable
	String account;
	String name;
	String phoneNumber;
	String branch;
	
	Test(String _account, String _name, String _phoneNumber, String _branch){
		this.account = _account;
		this.name = _name;
		this.phoneNumber = _phoneNumber;
		this.branch = _branch;
	}
}
