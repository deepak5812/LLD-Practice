package Patterns.ChainResponsibilityPattern.PaymentHandlers;

public abstract class BankHandler extends PaymentHandler{

    @Override
    public abstract handlers(int amount){
        if(amount>=0 && amount<=500){
            System.out.println("Bank Payment amount of $"+amount);
        }else{
            next.handlers(amount);
        }
    }

}
