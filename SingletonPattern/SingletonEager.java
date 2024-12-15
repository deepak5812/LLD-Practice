package Patterns.SingletonPattern;

public class SingletonEager {
    // By use Eager approach we can implement Singleton

    private SingletonEager(){}
    // the disadvantage of this approach is that is always take space when the class load to the memory
    private static SingletonEager singletonEagerInstance =new SingletonEager();

    public static SingletonEager getSingletonInstance(){
        return singletonEagerInstance;
    }
}
