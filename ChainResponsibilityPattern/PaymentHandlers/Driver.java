package Patterns.ChainResponsibilityPattern.PaymentHandlers;


public class Main {

    public static void main(String args[]) {
        /*  Chain Responsibility Design Pattern is a behavioural design pattern
            that allows a request to pass through a chain of handlers (objects) until it is processed. */
        
        PaymentHandler bankHandler=new BankHandler();
        PaymentHandler creditCardHandler=new CreditCardHandler();
        PaymentHandler paypalHandler=new paypalHandler();
        bankHandler.setNext(creditCardHandler);
        creditCardHandler.setNext(paypalHandler);
        bankHandler.handlePayment(600);
		bankHandler.handlePayment(200);
		bankHandler.handlePayment(1200);
		bankHandler.handlePayment(600);
        
    }
}
