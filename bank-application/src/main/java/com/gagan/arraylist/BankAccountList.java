package com.gagan.arraylist;

import com.gagan.bank.BankAccount;

public class BankAccountList {
	
	int index=-1;
	BankAccount accountList[];
	
	public BankAccountList(int size) {
		accountList = new BankAccount[size];
	}
	
	public BankAccountList() {
		accountList = new BankAccount[100];
	}
	
	public void addBankAccount(BankAccount acc) {
		accountList[++index] = acc;
	}
	
	public BankAccount[] getBankAccountList() {
		return accountList;
	}
	
	public BankAccount getBankAccountById(int accountNo) {
		for(int internalIndex = 0; internalIndex < accountList.length; internalIndex++) {
			if(accountList[internalIndex].getAccountNo() == accountNo) {
				return accountList[internalIndex];
			}
		}
		throw new RuntimeException("Account doesnot exists");
		
	}
	
	public BankAccount[] removeAccountById(int accountNo) {
		for(int internalIndex = 0; internalIndex <= index; internalIndex++) {
			if(accountList[internalIndex].getAccountNo() == accountNo) {
				for(int insideInternalLoop = internalIndex; insideInternalLoop < accountList.length - 1; insideInternalLoop++) {
					accountList[insideInternalLoop] = accountList[insideInternalLoop + 1];
				}
				index--;
			}
		}
		return accountList;
	}
	
	public BankAccount[] updateBankAccount(int accountNo, String accountHolderName) {
		for(int internalIndex = 0; internalIndex < accountList.length; internalIndex++) {
			if(accountList[internalIndex].getAccountNo() == accountNo) {
				accountList[internalIndex].setAccountHolderName(accountHolderName);
				return accountList;
			}
		}
		throw new RuntimeException("Account doesnot exists");
	}

}
