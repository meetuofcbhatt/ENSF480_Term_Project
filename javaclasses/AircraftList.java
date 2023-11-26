package javaclasses;

import java.util.ArrayList;

public class AircraftList {
	private static AircraftList onlyInstance;
    private ArrayList<Aircraft> aircrafts; 
    
    private AircraftList() {
    	
    }

    public static AircraftList getOnlyInstance(){
        if (onlyInstance == null){
            onlyInstance = new AircraftList();
        }
        return onlyInstance;
    }
    
    public void add(Aircraft a) {
    	aircrafts.add(a);
    }
}
