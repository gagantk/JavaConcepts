package com.gagan.flights;

/**
 * Hello world!
 *
 */
public class Flights 
{
    int flightId, price, depTime, arrTime, duration;
    String flightName, source, destination;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDepTime() {
		return depTime;
	}
	public void setDepTime(int depTime) {
		this.depTime = depTime;
	}
	public int getArrTime() {
		return arrTime;
	}
	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Flights(int flightId, String flightName,
			String source, String destination, int price, int depTime, int arrTime, int duration) {
		super();
		this.flightId = flightId;
		this.price = price;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.duration = duration;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "FlightsPojo [flightId=" + flightId + ", price=" + price + ", depTime=" + depTime + ", arrTime="
				+ arrTime + ", duration=" + duration + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + "]";
	}
	public Flights() {
		super();
	} 
}
