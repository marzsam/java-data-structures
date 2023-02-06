package org.java.queue;

public interface Queue<E> {
    
    public void enqueue(E e);

    public E dequeue() throws EmptyQueueException;

    public int size();

    public boolean isEmpty();

    public E front() throws EmptyQueueException;

}
