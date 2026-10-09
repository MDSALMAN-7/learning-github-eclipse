package com.kodewala.constructors1;

public class Account {
	int amount;
	String name;
	
	Account(){
		System.out.println("Inside Account()");
	}
	
	Account(int _amount, String _name){
		System.out.println("Insider amount()");
		this.amount = _amount;
		this.name = _name;
	}
}
