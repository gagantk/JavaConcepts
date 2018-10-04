package com.gagan.flights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FlightOperations {
	
	ArrayList<Flights> flightList;
	ArrayList<Flights> searchList = new ArrayList<Flights>();
	
	FlightOperations(){
		flightList = new ArrayList<Flights>();
	}
	
	public void addFlight(Flights flight) {
		flightList.add(flight);
	}
	
	public void removeFlightById(int flightId) {
		for(Flights flight:flightList) {
			if(flight.getFlightId() == flightId) {
				flightList.remove(flight);
			}
		}
		throw new RuntimeException("Flight doesnot exists");
	}
	
	public ArrayList<Flights> getFlightList(){
		return flightList;
	}
	
	public ArrayList<Flights> updateFlightTime(int flightId, int arrTime, int depTime) {
		for(Flights flight:flightList) {
			if(flight.getFlightId() == flightId) {
				flight.setArrTime(arrTime);
				flight.setDepTime(depTime);
				return flightList;
			}
		}
		throw new RuntimeException("Flight doesnot exists");
	}
	
	public ArrayList<Flights> updateFlightDestination(int flightId, String destination) {
		for(Flights flight:flightList) {
			if(flight.getFlightId() == flightId) {
				flight.setDestination(destination);
				return flightList;
			}
		}
		throw new RuntimeException("Flight doesnot exists");
	}
	
	public ArrayList<Flights> deleteFlightById(int flightId) {
		for(Flights flight:flightList) {
			if(flight.getFlightId() == flightId) {
				flightList.remove(flight);
				return flightList;
			}
		}
		throw new RuntimeException("Flight doesnot exists");
	}
	
	public ArrayList<Flights> filterBySrcDest(String source, String destination){
		for(Flights flight:flightList) {
			if(flight.getSource() == source && flight.getDestination() == destination) {
				searchList.add(flight);
			}
		}
		return searchList;
	}
	
	public ArrayList<Flights> sortByPrice(String source, String destination){
		for(Flights flight:flightList) {
			if(flight.getSource().equals(source) && flight.getDestination().equals(destination)) {
				searchList.add(flight);
			}
		}
		Collections.sort(searchList, new Comparator<Flights>() {
			public int compare(Flights flight1, Flights flight2){
				return flight1.getPrice() - flight2.getPrice();
			}
		});
		return searchList;
	}
	
	public ArrayList<Flights> flightListByMorning(){
		for(Flights flight:flightList) {
			if(flight.getDepTime()<1200)
				searchList.add(flight);
		}
		return searchList;
	}

}
