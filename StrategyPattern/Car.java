package Patterns.StrategyPattern;

public class Car {

    StrategyEngine strategyEngine;
    public Car(StrategyEngine strategyEngine){
        this.strategyEngine=strategyEngine;
    }

    public void Engine(){
        strategyEngine.Engine();
    }

}
