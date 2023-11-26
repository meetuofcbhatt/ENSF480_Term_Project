package javaclasses;

public class SeatID {
	int row;
	char column;
	
	SeatID(String id) {
		id.strip();
		row = Character.getNumericValue(id.charAt(0));
		column = id.charAt(1);
	}
	
	SeatID(int row, char column) {
		this.row = row;
		this.column = Character.toUpperCase(column);
	}
}
