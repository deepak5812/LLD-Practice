package Patterns.SingletonPattern;

public class Driver {

    public static void main(String[] strs){
        SingletonEager singletonEager=SingletonEager.getSingletonInstance();
        SingletonLazy singletonLazy=SingletonLazy.getSingletonLazy();
        SingletonSynchronized singletonSynchronized=SingletonSynchronized.getSingletonSynchronized();
        SingletonBillPugh singletonBillPugh=SingletonBillPugh.getSingletonBillPughInstance();
        SingletonDoubleCheck singletonDoubleCheck=SingletonDoubleCheck.getSingletonDoubleCheckInstance();
    }
}
