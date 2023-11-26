package ensf480final;

import java.util.ArrayList;

public class AircraftList {
	private static DatabaseSingleton onlyInstance;
    private ArrayList<Aircraft> aircrafts; 
    
    private AircraftList() {
    	
    }

    public static DatabaseSingleton getOnlyInstance(){
        if(onlyInstance ==null){
            onlyInstance = new DatabaseSingleton();
        }
        return onlyInstance;
    }
}