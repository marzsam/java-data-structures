package org.jds.node;

public class Node<E>{
    
    private E element;
    private Node<E> next;

    public Node(){
        this.element = null;
        this.next = null;
    }

    public Node(E element, Node<E> next){
        this.element = element;
        this.next = next;
    }

    public E getElement(){
        return element;
    }

    public Node<E> getNext(){
        return next;
    }

    public void setElement(E element){
        this.element = element;
    }

    public void setNext(Node<E> next){
        this.next = next;
    }

}