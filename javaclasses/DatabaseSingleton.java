package javaclasses;

public class DatabaseSingleton {
    private static DatabaseSingleton onlyInstance;
    private ArrayList<String>
    
    
    private DatabaseSingleton(){

    }

    public static DatabaseSingleton getOnlyInstance(){
        if(onlyInstance ==null){
            onlyInstance = new DatabaseSingleton();
        }
        return onlyInstance;
    }
}
