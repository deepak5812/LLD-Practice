package Patterns.BridgePattern;

public class Netflix extends Video {

   public Netflix(Processor processor){
        super(processor)
   }

   @Override
   public void play(String videoFile){
    Processor.process(videoFile);
   }

}
