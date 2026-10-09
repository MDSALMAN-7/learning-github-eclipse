package com.kodewala.constructors7;

public class BalanceTable extends BalanceInfo{

	int balance;
	
	BalanceTable(String _name, String _account, String _bank, int _balance) {
		super(_name, _account, _bank); // initialize the default fields
		this.balance = _balance;
	}
	
}
