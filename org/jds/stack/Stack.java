package org.jds.stack;

public interface Stack<E> {
    
    public void push(E e);

    public E pop() throws EmptyStackException;

    public int size();

    public boolean isEmpty();

    public E top() throws EmptyStackException;

}
