package com.kodewala.constructors3;

class SuperUser extends Object
{
	
}

public class User extends SuperUser {
	String userName;
	String userId;
	String mobile;
	
	User(String _userName, String _userId, String _mobile)
	{
		this(300); // this must be first line 
		//2.calling  same class(user) constructor
		this.userId = _userId;
		this.userName = _userId;
		this.mobile = _mobile;
		
	}
	
	User(int age){
		System.out.println(age);
	}
}
