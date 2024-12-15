package Patterns.SingletonPattern;

public class SingletonSynchronized {

    // This Synchronised method used in this approach to overcome the problem that if two threads come at the same time then it give only lock to only one thread

    private SingletonSynchronized(){}

    private static SingletonSynchronized singletonSynchronized;

    public synchronized static SingletonSynchronized getSingletonSynchronized(){

        if(singletonSynchronized==null){
            singletonSynchronized=new SingletonSynchronized();
        }
            return singletonSynchronized;

    }
}
