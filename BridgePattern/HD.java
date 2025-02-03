package Patterns.BridgePattern;

public class HD implements Processor {

    @Override
    public void process(String videoFile){
        System.out.println(videoFile);
    }


}
