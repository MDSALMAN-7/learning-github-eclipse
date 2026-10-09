package com.kodewala.constructors1;

public class ProductDetails {
	String productName;
	int price;
	String desc;
	int quantity;
	
	
	
	ProductDetails(String _productName, int _price, String _desc, int _quantity){
		this.productName = _productName;
		this.price = _price;
		this.desc = _desc;
		this.quantity = _quantity;
	}
	
	ProductDetails(String _productName, String _desc){
		this.productName = _productName;
		this.desc = _desc;
	}
	
	ProductDetails(){
			
	}
	
	
}
