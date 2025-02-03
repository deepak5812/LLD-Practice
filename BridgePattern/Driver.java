package Patterns.BridgePattern;

public class Driver {

    public static void main(String[] args){

        /*
            The Bridge Design Pattern is a structural design pattern that decouples
            an abstraction from its implementation, allowing both to evolve independently.
            It achieves this by using composition instead of inheritance.
        */

        Video v1=Netflix(new HD());
            v1.play("abc1.mp4");
        Video v2=Youtube(new UHD_4K());
            v2.play("abc2.mp4");
       


    }

}
