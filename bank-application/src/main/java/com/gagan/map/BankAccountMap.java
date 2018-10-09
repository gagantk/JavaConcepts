package com.gagan.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.gagan.bank.BankAccount;

public class BankAccountMap {
	
	Map<Integer, BankAccount> bankAccountMap;
	
	public BankAccountMap() {
		bankAccountMap = new TreeMap<>();
	}
	
	public void addBankAccountForEmployee(int empId, BankAccount acc) {
		bankAccountMap.put(empId, acc);
	}
	
	public Set<Integer> getAllEmployeeId() {
		return bankAccountMap.keySet();
	}
	
	public Collection<BankAccount> getAllBankAccounts() {
		return bankAccountMap.values();
	}
	
	public Set<Map.Entry<Integer, BankAccount>> getEmployeeBankDetails() {
		return bankAccountMap.entrySet();
	}
	
	public static void main(String[] args) {
		
		BankAccountMap map = new BankAccountMap();
		map.addBankAccountForEmployee(155679, new BankAccount("Gagan", 5000));
		map.addBankAccountForEmployee(155629, new BankAccount("Susheel", 6000));
		map.addBankAccountForEmployee(155181, new BankAccount("Daya", 7000));
		map.addBankAccountForEmployee(155136, new BankAccount("Akshatha", 8000));
		map.addBankAccountForEmployee(155571, new BankAccount("Sowmya", 9000));
		
		for(int index: map.getAllEmployeeId()) {
			System.out.println(index);
		}
	}

}
