package Patterns.TemplatePattern;

public class Cricket extends Game{

    @Override
    public void gameStarted(){
        System.out.println("Cricket Game is Started");
    }

    @Override
    public void gameBreak(){
        System.out.println("Cricket Game is at  break");
    }

    @Override
    public void gameEnded(){
        System.out.println("Cricket Game is Ended");
    }
}