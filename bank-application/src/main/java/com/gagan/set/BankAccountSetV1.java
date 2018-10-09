package com.gagan.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import com.gagan.bank.BankAccount;
import com.gagan.bank.SavingsAccount;

public class BankAccountSetV1 {
	
HashSet<BankAccount> accountList;
	
	BankAccountSetV1(){
		accountList = new HashSet<BankAccount>();
	}
	
	BankAccountSetV1(int size){
		accountList = new HashSet<BankAccount>(size);
	}
	
	public void addBankAccount(BankAccount acc) {
		accountList.add(acc);
	}
	
	public HashSet<BankAccount> getBankAccountList() {
		return accountList;
	}
	
	public BankAccount getBankAccountById(int accountNo) {
		for(BankAccount acc:accountList) {
			if(acc.getAccountNo() == accountNo) {
				return acc;
			}
		}
		throw new RuntimeException("Account doesnot exists");
	}
	
	public HashSet<BankAccount> updateBankAccount(int accountNo, String accountHolderName){
		for(BankAccount acc:accountList) {
			if(acc.getAccountNo() == accountNo) {
				acc.setAccountHolderName(accountHolderName);
				return accountList;
			}
		}
		throw new RuntimeException("Account doesnot exists");
	}
	
	public HashSet<BankAccount> removeBankAccount(int accountNo){
		for(BankAccount acc:accountList) {
			if(acc.getAccountNo() == accountNo) {
				accountList.remove(acc);
				return accountList;
			}
		}
		throw new RuntimeException("Account doesnot exists");
	}
	
	/*public HashSet<BankAccount> sortByName(){
		Collections.sort(accountList, new Comparator<BankAccount>() {
			public int compare(BankAccount acc1, BankAccount acc2){
				return acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName());
			}
		});
		
		return accountList;
	}*/
	
	/*public ArrayList<BankAccount> sortByNameV2(){
		Collections.sort(accountList, (BankAccount acc1, BankAccount acc2)->acc1.getAccountHolderName.compareTo(acc2.getAccountHolderName));
	}*/



public static void main(String args[]) {
	BankAccountSetV1 list = new BankAccountSetV1();
	
	list.addBankAccount(new SavingsAccount("Gagan", 5000));
	list.addBankAccount(new SavingsAccount("Susheel", 6000));
	list.addBankAccount(new SavingsAccount("Daya", 7000));
	list.addBankAccount(new SavingsAccount("Akshatha", 8000));
	list.addBankAccount(new SavingsAccount("Sowmya", 9000));
	
	
	for(BankAccount acc:list.getBankAccountList()) {
		System.out.println(acc);
	}
	
	System.out.println("****************************");
	System.out.println(list.getBankAccountById(1));
	System.out.println("****************************");
	for(BankAccount acc:list.removeBankAccount(3)) {
		System.out.println(acc);
	}
	System.out.println("****************************");
	/*for(BankAccount acc:list.sortByName()) {
		System.out.println(acc);
	}*/
	System.out.println("****************************");
	list.updateBankAccount(1, "Gagan T K");
	for(BankAccount acc:list.getBankAccountList()) {
		System.out.println(acc);
	}
}

}
