
package Patterns.TemplatePattern;

public class Football extends Game{

    @Override
    public void gameStarted(){
        System.out.println("Football Game is Started");
    }

    @Override
    public void gameBreak(){
        System.out.println("Football Game is at  break");
    }

    @Override
    public void gameEnded(){
        System.out.println("Football Game is Ended");
    }
}