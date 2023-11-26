package javaclasses;

public class Seat {
	SeatID seatID;
	boolean status = false; // false = empty, true for reserved
	String type;
	int price;
	
	// when creating a Seat, 
	public Seat(int row, char column, String type) {
		seatID = new SeatID(row, column);
		this.type = type;
		// the price of a seat is related to its type
		if (type == "business") {
			this.price = 200;
		} else if (type == "comfort") {
			this.price = 140;
		} else {
			this.price = 100;
		}
	}
	
	// can change this method
	public String getStatus() {
		if (status == true) {
			return "reserved";
		} else {
			return "full";
		}
	}
	
	// reserves the seat
	public void reserve() {
		this.status = true;
	}
	
	// un-reserves the seat, used if a user cancels their flight
	public void empty() {
		this.status = false;
	}
}
