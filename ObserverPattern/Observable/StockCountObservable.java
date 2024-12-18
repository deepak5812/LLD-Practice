package Patterns.ObserverPattern.Observable;

import Patterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.List;

public interface StockCountObservable {

    public void add(NotificationAlertObserver observerObj);
    public void remove(NotificationAlertObserver observerObj);
    public void notifySubscriber();
    public void setStockCount(int newStock);
    public int getStockCount();
}
