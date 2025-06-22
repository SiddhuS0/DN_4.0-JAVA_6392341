// Excercise 1 : Implementing Singleton Class

// class named logger
public class Logger {
    
    //  private static instance
    private static Logger instance;
    
    // private constructor for logger
    private Logger(){
        System.out.println("Logger instance is created");
    }

    // public staic method for getting instance 
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    
    // method for logging message
    public void log(String message){
        System.out.println("[log]: "+message);
    }
}


