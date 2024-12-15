package Patterns.SingletonPattern;

public class SingletonLazy {

    // This Lazy approach to implement the Singleton pattern and overcome the problem of the Eager approach as class load in memory it wa created an object and take space in memory
    // So, in this approach it only take space in memory when the object is required

    private SingletonLazy(){}

    private static SingletonLazy singletonLazy;

    public static SingletonLazy getSingletonLazy(){

        if(singletonLazy==null){
            singletonLazy=new SingletonLazy();
        }
            return singletonLazy;
    }
}
