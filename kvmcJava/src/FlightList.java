import java.util.ArrayList;

public class FlightList {
	private static FlightList onlyInstance;
    private ArrayList<Flight> flights; 

    private FlightList() {

    }

    public static FlightList getOnlyInstance(){
        if (onlyInstance == null){
            onlyInstance = new FlightList();
        }
        return onlyInstance;
    }

    public void add(Flight f) {
    	flights.add(f);
    }
}
