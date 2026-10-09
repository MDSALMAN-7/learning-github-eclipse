package com.kodewala.constructors;

public class AccountHolder {
	// Data 
	int amount; // this is the instance variable
	String account;
	String name;
	String phoneNumber;
	
	// Constructor does not have return type even not void
	// Constructor automatically call object creating time
	// if you don't write a constructor java automatically provides a default constructor
	AccountHolder(int _amount, String _account,  String _name, String _phoneNumber) // this is parameterized function 
	{
		this.amount = _amount;
		this.account= _account;
		this.name = _name;
		this.phoneNumber = _phoneNumber;
	}
}
