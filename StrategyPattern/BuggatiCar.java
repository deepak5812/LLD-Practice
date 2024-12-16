package Patterns.StrategyPattern;

public class BuggatiCar extends Car{


    public BuggatiCar(){
        super(new SuperFastCarEngine());
    }
}
