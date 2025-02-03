package Patterns.BridgePattern;

public class Video {

    Processor processor;

    public Processor(Processor processor){
        this.processor=processor;
    }

    public abstract void play(String video);

}
