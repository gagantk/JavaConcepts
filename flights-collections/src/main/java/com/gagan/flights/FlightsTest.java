package com.gagan.flights;

public class FlightsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlightOperations flights = new FlightOperations();
		
		flights.addFlight(new Flights(100, "Air Asia", "Bengaluru", "Mumbai", 4572, 1545, 1720, 95));
		flights.addFlight(new Flights(200, "Go Air", "Bengaluru", "Chennai", 3644, 1647, 1800, 73));
		flights.addFlight(new Flights(300, "Air Indigo", "Mangaluru", "Bengaluru", 2575, 1200, 1300, 60));
		flights.addFlight(new Flights(400, "Spicejet", "Goa", "Hyderabad", 4105, 1325, 1520, 115));
		flights.addFlight(new Flights(500, "Jet Airways", "Mumbai", "Delhi", 3320, 1405, 1530, 85));
		flights.addFlight(new Flights(600, "Vistara", "Bengaluru", "Mumbai", 4100, 1830, 2000, 90));
		flights.addFlight(new Flights(700, "Air Asia", "Kolkata", "Hyderabad", 3240, 1420, 1600, 100));
		flights.addFlight(new Flights(800, "Jet Airways", "Bengaluru", "Mumbai", 4200, 1540, 1700, 80));
		/*flights.addFlight(new Flights(100, "Air Asia", "Bengaluru", "Mumbai", 4572, 0545, 0720));
		flights.addFlight(new Flights(100, "Air Asia", "Bengaluru", "Mumbai", 4572, 0545, 0720));
		flights.addFlight(new Flights(100, "Air Asia", "Bengaluru", "Mumbai", 4572, 0545, 0720));
		flights.addFlight(new Flights(100, "Air Asia", "Bengaluru", "Mumbai", 4572, 0545, 0720));*/
		
		for(Flights flight:flights.getFlightList()) {
			System.out.println(flight);
		}
		System.out.println("************************************************");
		System.out.println("Flight Search");
		for(Flights flight:flights.filterBySrcDest("Bengaluru", "Mumbai")) {
			System.out.println(flight);
		}
		
		System.out.println("************************************************");
		/*System.out.println("Sort By Price");
		for(Flights flight:flights.sortByPrice("Bengaluru", "Mumbai")) {
			System.out.println(flight);
		}
		System.out.println("************************************************");
		System.out.println("Flight Removed");
		for(Flights flight:flights.deleteFlightById(300)) {
			System.out.println(flight);
		}*/
		

	}

}
