package ObserverPatternExample;

//Main.java
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobileApp = new MobileApp("StockMobile");
        Observer webApp = new WebApp("StockWeb");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);
        stockMarket.setStock("CTSH", 6493.73);
        stockMarket.setStock("INFY", 1420.50);
        stockMarket.removeObserver(mobileApp);
        stockMarket.setStock("WIPRO", 582.30);
    }
}
