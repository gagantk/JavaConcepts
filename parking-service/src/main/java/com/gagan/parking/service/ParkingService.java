package com.gagan.parking.service;

import java.util.TreeMap;
import java.util.Map;

import com.gagan.parking.model.Customer;

public class ParkingService {
	
	/*Map<String, Customer> carParkingCompartment;
	List<Map<String, Customer>> carParkingSection;
	List<List<Map<String, Customer>>> carParkingFloor;
	List<List<List<Map<String, Customer>>>> carParkingBuilding;
	static int i=0;
	
	ParkingService() {
		carParkingCompartment = new TreeMap<>();
		carParkingSection = new ArrayList<Map<String, Customer>>();
		carParkingFloor = new ArrayList<List<Map<String, Customer>>>();
		carParkingBuilding = new ArrayList<List<List<Map<String, Customer>>>>();
	}*/
	int carSpace=1;
	int secSpace = 10;
	int secCount = 1;
	int parkingFloor = 4;
	//static int i=0;
	//int secId=0;
    int autoSpaceGenerate = 0;
	Map<Integer, Customer> carParkingCompartment;
	Map<Integer, Map<Integer, Customer>> carParkingSection;
	Map<Integer, Map<Integer, Map<Integer, Customer>>> carParkingFloor;
	Map<Integer, Map<Integer, Map<Integer, Map<Integer, Customer>>>> carParkingBuilding;
	
	ParkingService(){
		carParkingCompartment = new TreeMap<>();
		carParkingSection = new TreeMap<>();
		carParkingFloor = new TreeMap<>();
		carParkingBuilding = new TreeMap<>();
	}
	
	/*public void addCar(Customer cust) {
		carParkingCompartment.put("1111"+ i, cust);
		carParkingSection.add(carParkingCompartment.get("1111"+i));
		carParkingFloor.add(carParkingSection);
		carParkingBuilding.add(carParkingFloor);
		i++;
	}*/
	
	public void addCar(Customer cust) {
		carSpace=++autoSpaceGenerate;
		if(carSpace>secSpace) {
			secCount++;
			
			autoSpaceGenerate=0;
			
		}
		if(carSpace==11) {
			//carSpace=1;
			carSpace=++autoSpaceGenerate;}
		/*if(secCount>parkingFloor) {
		parkingFloor++;
		}*/
		carParkingCompartment.put(carSpace, cust);
		carParkingSection.put(secCount, carParkingCompartment);
		carParkingFloor.put(parkingFloor, carParkingSection);
		carParkingBuilding.put(1, carParkingFloor);
		System.out.println("secCount:" + secCount);
		System.out.println("carSpace:" + carSpace);
		
	}
	
	
	
	public Map<Integer, Customer> getCompartmentList() {
		return carParkingCompartment;
	}
	public Map<Integer, Map<Integer, Customer>> getSectionList() {
		return carParkingSection;
	}
	public Map<Integer, Map<Integer, Map<Integer, Customer>>> getFloorList() {
		return carParkingFloor;
	}

public static void main(String[] args) {
	ParkingService parking = new ParkingService();
	
	
	
	
	/*for(Customer cust:parking.getCompartmentList().values()) {
		System.out.println(cust);
	}
	System.out.println("***********************************");
	for(Map<Integer, Customer> cust:parking.getSectionList().values()) {
		System.out.println(cust.values());
	}
	System.out.println("***********************************");
	for(Map<Integer, Map<Integer, Customer>> cust: parking.getFloorList().values()) {
		System.out.println(cust);
	}
	System.out.println("===================================");
	
	
	for(Customer cust:parking.getCompartmentList().values()) {
		System.out.println(cust);
	}
	System.out.println("***********************************");
	for(Map<Integer, Customer> cust:parking.getSectionList().values()) {
		System.out.println(cust.values());
	}
	System.out.println("***********************************");
	for(Map<Integer, Map<Integer, Customer>> cust: parking.getFloorList().values()) {
		System.out.println(cust);
	}*/
	System.out.println("===================================");
	parking.addCar(new Customer("Gagan", 215454351, "08:36"));
	parking.addCar(new Customer("Susheel", 3154564, "09:28"));
	parking.addCar(new Customer("Daya", 4515454, "10:30"));
	parking.addCar(new Customer("Daya1", 451545241, "10:30"));
	parking.addCar(new Customer("Daya2", 45154512, "10:30"));
	parking.addCar(new Customer("Daya3", 4515412, "10:30"));
	parking.addCar(new Customer("Daya4", 4515124, "10:30"));
	parking.addCar(new Customer("Daya5", 45111454, "10:30"));
	parking.addCar(new Customer("Daya6", 451542154, "10:30"));
	parking.addCar(new Customer("Daya7", 45154124, "10:30"));
	parking.addCar(new Customer("Daya8", 454542154, "10:30"));
	parking.addCar(new Customer("Daya9", 451512124, "10:30"));
	
	for(Customer cust:parking.getCompartmentList().values()) {
		System.out.println(cust);
	}
	System.out.println("***********************************");
	for(Map<Integer, Customer> cust:parking.getSectionList().values()) {
		System.out.println(cust.values());
	}
	System.out.println("***********************************");
	for(Map<Integer, Map<Integer, Customer>> cust: parking.getFloorList().values()) {
		System.out.println(cust);
	}
	System.out.println("===================================");
	
}
}
