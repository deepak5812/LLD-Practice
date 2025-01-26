package Patterns.ProxyPattern;

public interface ATM implements Account{

    @Override
    public void withdraw(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();
    }

    @Override
    public void getAccountNumber(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.getAccountNumber();

    }

}
