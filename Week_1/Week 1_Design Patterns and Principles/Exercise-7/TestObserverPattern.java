package ObserverPatternExample;

public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket googleStock = new StockMarket("Google");

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        googleStock.registerObserver(mobileApp);
        googleStock.registerObserver(webApp);

        // Change stock price and notify observers
        googleStock.setStockPrice(1500.00);
        googleStock.setStockPrice(1520.50);

        // Deregister one observer and change the price again
        googleStock.deregisterObserver(webApp);
        googleStock.setStockPrice(1540.75);
    }
}
