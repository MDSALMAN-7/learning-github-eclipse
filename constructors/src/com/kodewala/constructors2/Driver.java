package com.kodewala.constructors2;

class Invoice extends Object{ // if not write extends  by default it will write by java
	
	static int gst = 18;
	
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName)
	{
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
		
	}
	
}


public class Driver {
	public static void main(String[] args) {
		Invoice inv = new Invoice(179999,"Iphone 18","Nesto PG","C5432345","Kamdev");
		Invoice inv1 = new Invoice(79999,"Iphone 17","Nesto PG","C5432345","salman");
		
		System.out.println("First Invoice: "+inv.customerName+ " "+inv.itemName);
	}
}
