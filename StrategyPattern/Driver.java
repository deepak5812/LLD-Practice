package Patterns.StrategyPattern;

public class Driver {
    public static void main(String[] args){
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
