package Patterns.ChainResponsibilityPattern.PaymentHandlers;


public abstract class CreditCardHandler extends PaymentHandler{

    @Override
    public void handlers(int amount){
        if(amount>=501 && amount<=1000){
            System.out.println("Credit card Payment amount of $"+amount);
        }else{
            next.handlers(amount);
        }
    }

}
