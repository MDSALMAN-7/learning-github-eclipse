package com.learning.string3;

public class Driver2 {
	public static void main(String[] args) {
		String s1 = "This "+"is from"+" kodewala Academy Banglore"; // at compiling time compiler will do this 
																	// String s1 = "This is from kodewala academy Banglore"; 
		System.out.println(s1);
		
		String s2 = "learning"; // SCP
		String s3 = " Java";// SCP
		
		String s4 = s2+s3;  // Heap --> New StringBuilder();
		// What is purpose of intern() --> interview question
		
		String s5 = "learning Java"; //scp
		
		System.out.println(s5 = s4);
		System.out.println(s5 == s4.intern()); // false
		
		
	}
}
