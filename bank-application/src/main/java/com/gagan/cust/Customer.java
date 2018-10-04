package com.gagan.cust;

import com.gagan.arraylist.BankAccountList;
import com.gagan.bank.BankAccount;
import com.gagan.bank.CurrentAccountV2;
import com.gagan.bank.SavingsAccount;
import com.gagan.bank.SavingsAccountV2;

public class Customer {

	public static void main(String[] args) {
		/*BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		BankAccount acc3 = acc1;
		acc1.withdraw(5000);
		acc1.deposit(10000);
		acc2.getAccountHolderName();
		acc1.getAccountBalance();
		acc1.setAccountHolderName("Gagan");
		acc3.getAccountNo();
		
		SavingsAccount savingsAccount = new SavingsAccount();
		CurrentAccount currentAccount = new CurrentAccount();
		
		savingsAccount.deposit(6000);
		currentAccount.deposit(7000);

		System.out.println("Bank Account 1" + acc1);
		System.err.println("Bank Account 2" + acc2);
		System.out.println("Bank Account 3" + acc3);
		System.out.println("Savings Account Balance: " + savingsAccount.getAccountBalance());
		System.out.println("Current Account Balance: " + currentAccount.getAccountBalance());*/
		
		/*BankAccount acc = null;
		acc = new SavingsAccount();
		acc.withdraw(6000);
		System.out.println(acc);
		
		SavingsAccountV2 ins = new SavingsAccountV2();
		System.out.println("\nSavings Account Insurance Details:");
		System.out.println(ins.getInsuranceName());
		System.out.println(ins.getInsuranceAmount());
		System.out.println(ins.getInsuranceDate());
		
		CurrentAccountV2 insCur = new CurrentAccountV2();
		System.out.println("\nCurrent Account Insurance Details:");
		System.out.println(insCur.getInsuranceName());
		System.out.println(insCur.getInsuranceAmount());
		System.out.println(insCur.getInsuranceDate());*/
		
		BankAccountList list = new BankAccountList();
		
		list.addBankAccount(new SavingsAccount("Susheel", 6000));
		list.addBankAccount(new SavingsAccount("Daya", 7000));
		list.addBankAccount(new SavingsAccount("Gagan", 8000));
		list.addBankAccount(new SavingsAccount("Akshatha", 9000));
		list.addBankAccount(new SavingsAccount("Sowmya", 10000));
		
		for(BankAccount account:list.getBankAccountList()) {
			System.out.println(account);
		}
		
		System.out.println(list.getBankAccountById(3));
		
		System.out.println("\n");
		for(BankAccount account:list.updateBankAccount(3, "Gagan T K")) {
			System.out.println(account);
		}
		
		list.removeAccountById(3);
		
		
		
		
		
	}

}
