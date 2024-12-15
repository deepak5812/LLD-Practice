package Patterns.SingletonPattern;

public class SingletonDoubleCheck {
    //
    public static volatile  SingletonDoubleCheck singletonDoubleCheck;

    private SingletonDoubleCheck(){

    }

    public static SingletonDoubleCheck getSingletonDoubleCheckInstance(){

        if(singletonDoubleCheck==null){
            synchronized (SingletonDoubleCheck.class){
                if(singletonDoubleCheck==null){
                    singletonDoubleCheck=new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }

}
