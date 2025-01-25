package Patterns.ChainResponsibilityPattern.PaymentHandlers;

public class PaymentHandler extends PaymentHandler{

    @Override
    public void handlers(int amount){
        if(amount>=1001 && amount<=1500){
            System.out.println("Paypal Payment amount of $"+amount);
        }else{
            next.handlers(amount);
        }
    }

}