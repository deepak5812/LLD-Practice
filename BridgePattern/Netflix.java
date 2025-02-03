package Patterns.BridgePattern;

public class Netflix extends Video {

   public Netflix(Processor processor){
        super(processor)
   }

   @Override
   play(String videoFile){
    Processor.process(videoFile);
   }

}
