import java.util.*;

public class StockMarket implements stock {
    private String stockName;
    private int stockPrice;
    private List<Observer> observers;

    public StockMarket(String stockName){
        this.stockName = stockName;
        observers = new ArrayList<>();
    }

    public void setPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notifyObserver();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(stockName, stockPrice);
        }
    }


}
