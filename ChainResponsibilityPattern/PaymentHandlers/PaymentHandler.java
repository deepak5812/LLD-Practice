package Patterns.ChainResponsibilityPattern.PaymentHandlers;

import Patterns.ChainResponsibilityPattern.LogProcessor;

public abstract class PaymentHandler{

    protected PaymentHandler next;
    public void setNext(PaymentHandler next){
        this.next=next;
    }
    publi abstract handlers(int amount);

}
