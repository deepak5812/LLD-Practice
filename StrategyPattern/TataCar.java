package Patterns.StrategyPattern;

public class TataCar extends Car{

    public TataCar(){
        super(new OffRoadCarEngine());
    }

}
