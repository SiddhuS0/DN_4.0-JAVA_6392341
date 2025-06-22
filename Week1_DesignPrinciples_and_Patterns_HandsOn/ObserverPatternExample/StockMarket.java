package ObserverPatternExample;

//StockMarket.java
import java.util.*;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;
    public void setStock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        notifyObservers();  //notifing when stock is updated
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, stockPrice);
        }
    }
}
