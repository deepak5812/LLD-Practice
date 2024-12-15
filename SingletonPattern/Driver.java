package Patterns.SingletonPattern;

public class Driver {

    public static void main(String[] strs){
        SingletonEager singletonEager=SingletonEager.getSingletonInstance();
        SingletonLazy singletonLazy=SingletonLazy.getSingletonLazy();
    }
}
