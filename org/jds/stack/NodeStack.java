package org.jds.stack;

import org.jds.node.Node;

public class NodeStack<E> implements Stack<E> {
    
    protected Node<E> top;
    protected int size;

    public NodeStack(){
        top = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(E element){
        Node<E> newNode = new Node<E>(element, top);
        top = newNode;
        size++;
    }

    public E pop(){
        if(size==0)
            throw new EmptyStackException("stack is empty");
        E element = top.getElement();
        top = top.getNext();
        size--;
        return element;
    }

    public E top(){
        if(size==0)
            throw new EmptyStackException("stack is empty");
        return top.getElement();
    }

    public String toString(){
        String str = "";
        if(size==0)
            return str;
        Node<E> tNode = top;
        str = " "+tNode.getElement().toString();
        while(tNode.getNext()!=null){
            tNode = tNode.getNext();
            str += " "+tNode.getElement().toString();
        }
        return str;

    }

}
