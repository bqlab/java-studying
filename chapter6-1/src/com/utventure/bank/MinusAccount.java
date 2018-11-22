package com.utventure.bank;

public class MinusAccount extends Account {
	int minus;

	public MinusAccount(int id, int minus) {
		super(id);
		this.minus = minus;
	}
	
	public MinusAccount(int id, int balance, int minus) {
		super(id, balance);
		this.minus = minus;
	}

	public int withdraw(int amount) {
		if (balance - (amount + minus) < 0) {
			System.out.println("잔액이 부족합니다.");
			return amount;
		}
		balance -= amount;
		return amount;
	}
}