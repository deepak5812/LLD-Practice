package Patterns.ObserverPattern;

import Patterns.ObserverPattern.Observable.IphoneStockCountObservableImpl;
import Patterns.ObserverPattern.Observable.StockCountObservable;
import Patterns.ObserverPattern.Observer.EmailObserverImpl;
import Patterns.ObserverPattern.Observer.NotificationAlertObserver;
import Patterns.ObserverPattern.Observer.PhoneObserverImpl;

public class Driver {

    public static void main(String[] args){
        /*
        The Observer Design Pattern is a behavioral design pattern
        that establishes a one-to-many relationship between objects.
        When one object (the Subject) changes its state, all its dependent objects
        (the Observers) are notified and updated automatically.

         */
        StockCountObservable observable=new IphoneStockCountObservableImpl();
        NotificationAlertObserver observer1=new EmailObserverImpl("deepakmathur5812@gmail.com",observable);
        NotificationAlertObserver observer2=new EmailObserverImpl("Leonormathur5812@gmail.com",observable);
        NotificationAlertObserver observer3=new PhoneObserverImpl("Deepak Mathur",observable);
        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);
        observable.setStockCount(1);


    }
}
