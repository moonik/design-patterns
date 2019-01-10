package app.observer;

import java.util.HashSet;
import java.util.Set;

public class StockSubject implements Subject {

    private Set<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockSubject() {
        this.observers = new HashSet<Observer>();
    }

    public void register(Observer observer) {
        this.observers.add(observer);
    }

    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver() {
        observers.forEach(o -> o.update(ibmPrice, applePrice, googlePrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }
}
