package app.observer;

public class Application {

    public static void main(String[] args) {
        StockSubject subject = new StockSubject();
        StockObserver observer = new StockObserver(subject);

        subject.setApplePrice(23.0);
        subject.setGooglePrice(55);
    }
}
