package com.gagan.bank;

public class SavingsAccount extends BankAccount {
	
	public void withdraw(double amount) {
		System.out.println("Savings account withdraw method");
		accountBalance -= amount;
	}
	
	public void isSalaryAccount() {
		System.out.println("Salary Account");
	}

}
