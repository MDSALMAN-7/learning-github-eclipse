package com.kodewala.constructors1;

public class Ecommerce {
	public static void main(String[] args) {
		ProductDetails p = new ProductDetails();
		System.out.println();
		
		ProductDetails p1 = new ProductDetails("Kettle",768,"For using multipurse like bowling egg, meggi etc.",1);
		System.out.println(p1.productName);
		
		ProductDetails p2 = new ProductDetails("Kettle","For using multipurse like bowling egg, meggi etc.");
		System.out.println(p2.productName +" and "+p2.desc);
		
	}
}
