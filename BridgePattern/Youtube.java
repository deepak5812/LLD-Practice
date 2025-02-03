package Patterns.BridgePattern;

public class Youtube extends Video{

    public Youtube(Processor processor){
        super(processor)
    }

   @Override
   play(String videoFile){
    Processor.process(videoFile);
   }


}
