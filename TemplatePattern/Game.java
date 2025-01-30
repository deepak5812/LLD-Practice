package Patterns.TemplatePattern;

public abstract  class Game{

    public abstract gameStarted();
    public abstract gameEnded();
    public abstract gameBreak();
    public final void play(){

        gameStarted();

        gameBreak();

        gameEnded();
    }
}