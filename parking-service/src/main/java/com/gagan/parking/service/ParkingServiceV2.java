package com.gagan.parking.service;

import java.util.HashMap;
import java.util.Map;

import com.gagan.parking.model.Customer;

public class ParkingServiceV2 {
public static Map<Integer, Customer> parkingMap = new HashMap<>();
	
	int carCount = 110;
	public int parkByCar(Customer customer) {
		if(carCount%100==49)
		{
			carCount+=61;
		}
		parkingMap.put(carCount++, customer);
		return carCount;
	}
	
	public static String stripId(int carCount)
	{
		int temp=carCount;
		int sectionCount=(temp%100)/10;
		int floorCount=temp/100;
		int parkingId=(carCount%10)%10;
		return "Floor No. "+floorCount+"Section No"+sectionCount+"Compartment"+parkingId;
		
	}

	public static void main(String[] args) {
		ParkingServiceV2 parking = new ParkingServiceV2();
		Customer customer = new Customer("Daya", 1234567890, "12:30");
		parking.parkByCar(customer);
		Customer customer1 = new Customer("Susheel", 1234567891, "06:30");
		parking.parkByCar(customer1);
		Customer customer2 = new Customer("Gagan", 1234567891, "04:30");
		parking.parkByCar(customer2);
		Customer customer3 = new Customer("Daya1", 1234567890, "12:30");
		parking.parkByCar(customer3);
		Customer customer4 = new Customer("Daya2", 1234567890, "12:30");
		parking.parkByCar(customer4);
		Customer customer5 = new Customer("Daya4", 1234567890, "12:30");
		parking.parkByCar(customer5);
		Customer customer6 = new Customer("Daya3", 1234567890, "12:30");
		parking.parkByCar(customer6);		
		Customer customer7 = new Customer("Daya5", 1234567890, "12:30");
		parking.parkByCar(customer7);
		Customer customer8 = new Customer("Daya6", 1234567890, "12:30");
		parking.parkByCar(customer8);
		Customer customer9 = new Customer("Daya7", 1234567890, "12:30");
		parking.parkByCar(customer9);
		Customer customer10 = new Customer("Daya8", 1234567890, "12:30");
		parking.parkByCar(customer10);
		Customer customer11 = new Customer("Daya9", 1234567890, "12:30");
		parking.parkByCar(customer11);
		Customer customer12 = new Customer("Daya10", 1234567890, "12:30");
		parking.parkByCar(customer12);
		Customer customer13 = new Customer("Daya11", 1234567890, "12:30");
		parking.parkByCar(customer13);

		for (Map.Entry<Integer, Customer> entry : parkingMap.entrySet()) {
			Integer key = entry.getKey();
			System.out.println(key);
			System.out.println(stripId(key));
			System.out.println(entry.getValue().getCustomerName());
			System.out.println(entry.getValue().getPhoneNo());
			System.out.println(entry.getValue().getParkingTime());
		}
		
		parkingMap.remove(110);
		for (Map.Entry<Integer, Customer> entry : parkingMap.entrySet()) {
			Integer key = entry.getKey();
			System.out.println(key);
			System.out.println(stripId(key));
			System.out.println(entry.getValue().getCustomerName());
			System.out.println(entry.getValue().getPhoneNo());
			System.out.println(entry.getValue().getParkingTime());
			
		}
		
	}
}

