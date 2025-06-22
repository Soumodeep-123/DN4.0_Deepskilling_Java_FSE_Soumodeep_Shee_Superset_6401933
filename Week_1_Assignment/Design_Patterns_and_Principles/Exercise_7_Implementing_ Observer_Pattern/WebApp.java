//package practise.Design_Pattern.Behavioral  Patterns.observer_pattern;

public class WebApp implements Observer{
    private String browser;

    public WebApp(String browser) {
        this.browser = browser;
    }

    public void update(String stockName,int price){
        System.err.println("WebApp - " + browser + " - " + stockName + " is now priced  " + price);
    }
}

