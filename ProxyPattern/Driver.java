package Patterns.ProxyPattern;

public class Driver {

    public static void main(String[] args){
       /*
       Proxy is a structural design pattern that lets you provide 
       a substitute or placeholder for another object.
        */
        ATM atm=new ATM();
        atm.withdraw();

    }

}
