package org.java.stack;

public class ArrayStack<E> implements Stack<E> {

    public static final int DEFAULT_CAPACITY = 1000;
    
    protected E S[];
    
    protected int capacity;
    protected int top = -1;
    
    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")

    public ArrayStack(int capacity){
        this.capacity = capacity;    
        S = (E[]) new Object[capacity];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public void push(E element){
        if (this.size() == capacity)
            throw new FullStackException("Stack max capacity ("+ capacity +") reached");
        S[++top] = element;
    }

    public E pop() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException("The stack is empty");
        E element = S[top];
        S[top--] = null;
        return element;
    }

    public E top() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException("The stack is empty");
        return S[top];
    }

}
