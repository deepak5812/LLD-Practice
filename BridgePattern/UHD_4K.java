package Patterns.BridgePattern;

public class UHD_4K implements Processor {
   
    @Override
    public void process(String videoFile){
        System.out.println(videoFile);
    }

}
