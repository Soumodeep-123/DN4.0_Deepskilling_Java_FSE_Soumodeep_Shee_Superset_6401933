

public class ObserverPatternExample {
    public static void main(String args[]) {
        StockMarket tata = new StockMarket("Tata");

        Observer mobileApp = new MobileApp("Soumodeep");
        Observer webApp = new WebApp("Chrome");

        tata.registerObserver(mobileApp);
        tata.registerObserver(webApp);

        System.out.println("Price Update 1:");
        tata.setPrice(178);

        System.out.println("\nPrice Update 2:");
        tata.setPrice(181);

        tata.removeObserver(mobileApp);

        System.out.println("\nPrice Update 3:");
        tata.setPrice(185);
    }

}
