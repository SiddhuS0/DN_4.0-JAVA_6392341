//test class to verify only 1 instance of class is created
public class Main {
    
    public static void main(String[] args){
        // getting the instance for 1st time
        Logger log1 = Logger.getInstance();
        log1.log("This is 1st log message");

        // 2nd time
        Logger log2 = Logger.getInstance();
        log2.log("This is 2nd log message");

        // verifying 
        if (log1==log2){
            System.out.println("log1 and log2 are Same Instance");
        }
        else{
            System.out.println("Different Instances found");
        }

    }
}
