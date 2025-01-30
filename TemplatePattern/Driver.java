package Patterns.TemplatePattern;
public class Driver {

    public static void main(String[] strs){
        /*
        Template Design Pattern is a behavioural Design Pattern in which
        the template of a class or algorithm is defined and the sub-classes 
        is implement that template without changing it's structure.
        */

        Game cricketGame=new Cricket();
        cricketGame.play();

        Game footBallGame=new Football();
        footBallGame.play();
               
    }
}
