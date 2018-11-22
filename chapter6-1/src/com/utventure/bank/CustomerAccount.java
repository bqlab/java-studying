package com.utventure.bank;

public class CustomerAccount extends MinusAccount{
	double mileage;
	
	public CustomerAccount(int id, int balance, int minus, double mileage) {
		super(id, balance, minus);
		this.mileage = mileage;
	}
	
	public void deposit(int amount) {
		balance = (int) (balance + (amount+(amount*mileage)));
	}
}