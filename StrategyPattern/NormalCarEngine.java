package Patterns.StrategyPattern;

public class NormalCarEngine implements StrategyEngine{
    @Override
    public void Engine() {
        System.out.println("Normal Car Engine");
    }
}
