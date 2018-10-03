package com.gagan.bank;

public class CurrentAccountV2 extends CurrentAccount implements Insurance {
	
	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Insurance Name of Current Account";
	}

	@Override
	public int getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public String getInsuranceDate() {
		// TODO Auto-generated method stub
		return "02-10-2018";
	}

}
