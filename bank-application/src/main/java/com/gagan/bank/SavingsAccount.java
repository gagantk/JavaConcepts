package com.gagan.bank;

public class SavingsAccount extends BankAccount {
	
	

	public SavingsAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) {
		System.out.println("Savings account withdraw method");
		accountBalance -= amount;
	}
	
	public void isSalaryAccount() {
		System.out.println("Salary Account");
	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
