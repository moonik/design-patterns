package app.observer;

public class StockObserver implements Observer {

    private StockSubject stockSubject;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockObserver(StockSubject stockSubject) {
        this.stockSubject = stockSubject;
        this.stockSubject.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;

        System.out.println("Some stocks changed!: ibm: " + ibmPrice + "; apple: " + applePrice + "; google: " + googlePrice);
    }
}
