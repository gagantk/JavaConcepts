package com.gagan.parking.model;

public class Customer {

	String customerName;
	int phoneNo;
	String parkingTime;

	public String getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(String parkingTime) {
		this.parkingTime = parkingTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Customer(String customerName, int phoneNo, String parkingTime) {
		super();
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.parkingTime = parkingTime;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", phoneNo=" + phoneNo + ", parkingTime=" + parkingTime + "]";
	}

}
