package javaclasses;

import java.util.ArrayList;

public class Aircraft {
	int aircraftID;
	String model;
	ArrayList<Seat> seats = new ArrayList<Seat>(); // may want to change this to something that isn't an ArrayList
	
	public Aircraft(int aircraftID, String model) {
		this.aircraftID = aircraftID;
		this.model = model;
		createSeats();
	}
	
	// creates an array of seats
	// we're assuming that each aircraft has the same number and distribution of seats, regardless of the model
	private void createSeats() {
		int numberOfBusinessRows = 1;
		int businessSeatsPerRow = 4;
		
		int numberOfComfortRows = 2;
		int comfortSeatsPerRow = 4;
		
		int numberOfOrdinaryRows = 5;
		int ordinarySeatsPerRow = 4;
		
		int currentRow = 0;
		int i;
		
		for (i = 0; i < numberOfBusinessRows; i++) {
			currentRow++;
			for (char j = 'A'; j < ('A' + businessSeatsPerRow); j++) {
				seats.add(new Seat(currentRow, j, "business"));
				//System.out.println(currentRow + String.valueOf(j));
			}
		}

		for (i = 0; i < numberOfComfortRows; i++) {
			currentRow++;
			for (char j = 'A'; j < ('A' + comfortSeatsPerRow); j++) {
				seats.add(new Seat(currentRow, j, "comfort"));
				//System.out.println(currentRow + String.valueOf(j));
			}
		}
		
		for (i = 0; i < numberOfOrdinaryRows; i++) {
			currentRow++;
			for (char j = 'A'; j < ('A' + ordinarySeatsPerRow); j++) {
				seats.add(new Seat(currentRow, j, "ordinary"));
				//System.out.println(currentRow + String.valueOf(j));
			}
		}
	}
	
	// delete, used for testing
//	public static void main(String[] args) {
//		Aircraft a = new Aircraft(1, "boeing");
//
//	}
}
