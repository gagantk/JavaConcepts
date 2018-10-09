package com.gagan.bank;

public class SavingsAccountV2 extends SavingsAccount implements Insurance {
	
	
	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Insurance Name";
	}

	@Override
	public int getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 200000;
	}

	@Override
	public String getInsuranceDate() {
		// TODO Auto-generated method stub
		return "03-10-2018";
	}

	
	

}
