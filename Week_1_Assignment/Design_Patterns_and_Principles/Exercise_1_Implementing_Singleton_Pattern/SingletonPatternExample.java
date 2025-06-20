//package Design_Pattern;

class Logger{
    private static volatile Logger instance;

    private Logger(){
        System.out.println("Logger initialized");
    }

    public static Logger getInstance(){
        if(instance == null){
            synchronized(Logger.class){
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

}

public class SingletonPatternExample {
    public static void main(String args[]){
        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();
        if(obj1 == obj2) {
            System.out.println("Both are same instance");
        } else{
            System.out.println("Different instances");
        } 
    }
    
}
