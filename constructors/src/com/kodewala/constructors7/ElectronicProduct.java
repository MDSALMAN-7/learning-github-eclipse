package com.kodewala.constructors7;

public class ElectronicProduct extends Product {

	int warranty;
	
	ElectronicProduct(String _name, int _price, String _productId,int _warranty) {
		super(_name, _price, _productId); // initialize the default fields
		this.warranty = _warranty;
	}
	
}
