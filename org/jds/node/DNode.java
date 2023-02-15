package org.jds.node;

public class DNode<E> {
    
    protected E element;
    protected DNode<E> next, prev;

    public DNode(){
        this.element = null;
        this.next = null;
        this.prev = null;
    }

    public DNode(E element, DNode<E> next, DNode<E> prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public E getElement(){
        return element;
    }

    public DNode<E> getNext(){
        return next;
    }

    public DNode<E> getPrev(){
        return prev;
    }

    public void setElement(E element){
        this.element = element;
    }

    public void setNext(DNode<E> next){
        this.next = next;
    }

    public void setPrev(DNode<E> prev){
        this.prev = prev;
    }
}
