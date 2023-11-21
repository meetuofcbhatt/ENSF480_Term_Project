package javaclasses;

public class Flight {

    private int flightID;
    public String  destination;
    public String  origin;
    public String  flightName;
    public int date;
    public int crewID;
    public int aircraftID;
    public String aircraft;


       public Flight(int flightID, String  destination, String  origin, String  flightName, int date, int crewID, int aircraftID, String aircraft) {

        /**
         * This is the Task constructor that creates a task object based on the parameters passed into the constructor

         *
         * @param ID id of the task, type is integer
         * @param description what the task is, type is string
         * @param duration time taken for the task, type is int
         * @param maxWin the maximum hourly window the task needs to be scheduled in, type is int
         *
         */

        this.flightID = flightID;
        this.destination = destination;
        this.origin = origin;
        this.flightName =flightName;
        this.date = date;
        this.crewID= crewID;
        this.aircraftID = aircraftID;
        this.aircraft =aircraft;

    }

    public int getFlightID(){

        /**
         * Gets the TaskID that is associated with the task it was called from
         * @return taskID, type is int
         */
        return flightID;
    }
    public String getDestination(){
        /**
         * Gets the duration that is associated with the task it was called from
         * @return duration, type is int
         */
        return destination;
    }

    public String getOrigin(){

        /**
         * Gets the Max windoe that is associated with the task it was called from
         * @return maxWin, type is int
         */
        return origin;
    }
    public String getFlightName(){


        /**
         * Gets the description that is associated with the task it was called from
         * @return description, type is String
         */
        return flightName;
    }

    public int getDate(){


        /**
         * Gets the description that is associated with the task it was called from
         * @return description, type is String
         */
        return date;
    }


    public int getCrewID(){


        /**
         * Gets the description that is associated with the task it was called from
         * @return description, type is String
         */
        return crewID;
    }
    


    public int getAircraftID(){


        /**
         * Gets the description that is associated with the task it was called from
         * @return description, type is String
         */
        return aircraftID;
    }


    public String getAircraft(){


        /**
         * Gets the description that is associated with the task it was called from
         * @return description, type is String
         */
        return aircraft;
    }
}
