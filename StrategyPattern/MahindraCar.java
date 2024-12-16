package Patterns.StrategyPattern;

public class MahindraCar extends Car{

    public MahindraCar(){
        super(new NormalCarEngine());
    }
}
