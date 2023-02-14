package org.jds.queue;

public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(String msg){
        super(msg);
    }
}
