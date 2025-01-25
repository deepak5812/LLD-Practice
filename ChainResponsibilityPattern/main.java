package Patterns.ChainResponsibilityPattern;

import Patterns.ChainResponsibilityPattern.LogProcessor;

public class Main {

    public static void main(String args[]) {
        /*  Chain Responsibility Design Pattern is a behavioural design pattern
            that allows a request to pass through a chain of handlers (objects) until it is processed. */
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this ");
        logObject.log(LogProcessor.INFO, "just for info ");

    }
}
