//package practise.Design_Pattern.Behavioral  Patterns.observer_pattern;

public class MobileApp implements Observer{
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    public void update(String stockName,int price){
        System.err.println("MobileApp - " + user + " - " + stockName + " is now priced at " + price);
    }
}
