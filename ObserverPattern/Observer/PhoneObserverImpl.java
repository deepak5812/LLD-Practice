package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Observable.StockCountObservable;

public class PhoneObserverImpl implements NotificationAlertObserver{
    public StockCountObservable observable;
    String userName;

    public PhoneObserverImpl(String userName,StockCountObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMobileNofitication(userName,"Stock is Available hurry up !!");
    }
    public void sendMobileNofitication(String userName,String msg){
        System.out.println("Notificaiton sent to : -> "+userName+" "+msg);
    }
}
