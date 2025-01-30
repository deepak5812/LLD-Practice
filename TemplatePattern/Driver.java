package Patterns.TemplatePattern;
public class Driver {

    public static void main(String[] strs){

        Game cricketGame=new Cricket();
        cricketGame.play();

        Game footBallGame=new Football();
        footBallGame.play();
               
    }
}
