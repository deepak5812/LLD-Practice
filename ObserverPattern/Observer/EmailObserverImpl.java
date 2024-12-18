package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Observable.StockCountObservable;

public class EmailObserverImpl implements NotificationAlertObserver{

    String email;
    StockCountObservable observable;
    public EmailObserverImpl(String email,StockCountObservable observable){
        this.email=email;
        this.observable=observable;
    }

    @Override
    public void update() {
        sendEmailAlerts(email,"Stock is Available Hurry up !!");
    }
    public void sendEmailAlerts(String email,String msg) {
        System.out.println("email sent to -> " +email+" "+msg);
    }
}
