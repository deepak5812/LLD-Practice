package Patterns.StrategyPattern;

public class Driver {
    public static void main(String[] args){
        /*
            The Strategy Design Pattern is a behavioral design pattern
            that allows you to define a family of algorithms, put each
            of them into separate classes, and make their objects interchangeable
            at runtime.
         */
        Car car0=new BmwCar();
        car0.Engine();
        Car car1=new BuggatiCar();
        car1.Engine();
        Car car2=new MahindraCar();
        car2.Engine();
        Car car3=new TataCar();
        car3.Engine();
    }
}
