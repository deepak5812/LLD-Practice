package Patterns.StrategyPattern;

public class BmwCar extends Car{


    public BmwCar() {
        super(new SuperFastCarEngine());
    }
}
