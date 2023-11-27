package javaclasses;

public class Flight {

    private String flightName;
    private String destination;
    private String origin;
    private int flightID;	// should be unique
    public int date;	// departure date
    public int time;	// departure time
    public int length;	// length of the flight
    public int crewID;
    public int aircraftID;
    
    /**
     * This is the Flight constructor that creates a Flight object based on the parameters passed into the constructor
     *
     * @param flightName name of the flight, type is String
     * @param destination where the flight is going, type is String
     * @param origin where the flight takes off from, type is String
     * @param date day when the flight departs, type is int
     * @param time time of departure, type is int
     * @param flightID unique ID to identify flights, type is int
     * @param crewID identifies the crew working on that flight, type is int
     * @param aircraftID identifies the aircraft used for that flight, type is int
     */
    public Flight(String flightName, String  destination, String  origin, int date, int time, int flightID, int crewID, int aircraftID) {
        

        this.flightID = flightID;
        this.destination = destination;
        this.origin = origin;
        this.flightName =flightName;
        this.date = date;
        this.time = time;
        this.crewID= crewID;
        this.aircraftID = aircraftID;

    }

    /**
     * Gets the flightName variable of a Flight object
     * @return flightName, type is String
     */
    public String getFlightName() {
    	return flightName;
    }
    
    /**
     * Gets the destination variable of a Flight object
     * @return destination, type is String
     */
    public String getDestination() {
    	return destination;
    }
    
    /**
     * Gets the origin variable of a Flight object
     * @return origin, type is String
     */
    public String getOrigin() {
    	return origin;
    }
    
    /**
     * Gets the flightID variable of a Flight object
     * @return flightID, type is int
     */
    public int getFlightID() {
    	return flightID;
    }
    
    /**
     * Gets the date variable of a Flight object
     * @return date, type is int
     */
    public int getDate() {
    	return date;
    }
    
    /**
     * Gets the time variable of a Flight object
     * @return time, type is int
     */
    public int getTime() {
    	return time;
    }
    
    /**
     * Gets the length variable of a Flight object
     * @return length, type is int
     */
    public int length() {
    	return length;
    }
    
    /**
     * Gets the ID of the crew associated with a Flight object
     * @return crewID, type is int
     */
    public int crewID() {
    	return crewID;
    }
    
    /**
     * Gets the ID of the aircraft associated with a Flight object
     * @return aircraftID, type is int
     */
    public int aircraftID() {
    	return aircraftID;
    }
}
