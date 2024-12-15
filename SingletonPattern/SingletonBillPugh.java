package Patterns.SingletonPattern;

public class SingletonBillPugh {
    // It is more faster than that of Eager and Lazy takes space in memory only when it is required because nested inner class only take space in memory when it called.
    private SingletonBillPugh(){}

    public static class SingletonBillPughClass{
        private static final SingletonBillPugh singletonBillPugh=new SingletonBillPugh();
    }
    public static SingletonBillPugh getSingletonBillPughInstance(){
        return SingletonBillPughClass.singletonBillPugh;
    }
}
