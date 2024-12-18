package Patterns.ObserverPattern.Observable;

import Patterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockCountObservableImpl implements StockCountObservable{
    List<NotificationAlertObserver> observerList=new ArrayList<>();
    int stockCount=0;
    @Override
    public void add(NotificationAlertObserver observerObj) {
        observerList.add(observerObj);
    }

    @Override
    public void remove(NotificationAlertObserver observerObj) {
        observerList.remove(observerObj);
    }

    @Override
    public void notifySubscriber() {

        for(NotificationAlertObserver obj : observerList){
            obj.update();
        }

    }

    @Override
    public void setStockCount(int newStock) {
        stockCount=stockCount+newStock;
        if(stockCount!=0){
            notifySubscriber();
        }

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
