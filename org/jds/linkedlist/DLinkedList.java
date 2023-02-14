package org.jds.linkedlist;

import org.jds.node.DNode;

public class DLinkedList<E> {
    
    protected DNode<E> header, trailer;
    protected int size;

    public DLinkedList(){

        header = new DNode<E>(null, null, null);
        trailer = new DNode<E>(null, null, null);
        
        header.setNext(trailer);
        trailer.setPrev(header);

        size = 0;
    }

    public void addFirst(E element){
        DNode<E> newNode = new DNode<E>(element, header.getNext(), header);
        header.setNext(newNode);
        size++;
    }

    public void addLast(E element){
        DNode<E> newNode = new DNode<E>(element, trailer, trailer.getPrev());
        trailer.setPrev(newNode);
        size++;
    }

    public E removeFirst(){
        if(size == 0)
            throw new EmptyLinkedListException("linked list is empty");
        DNode<E> removedNode = header.getNext();
        header.setNext(removedNode.getNext());
        removedNode.getNext().setPrev(header);
        size--;
        return removedNode.getElement();
    }

    public E removeLast(){
        if(size == 0)
            throw new EmptyLinkedListException("linked list is empty");
        DNode<E> removedNode = trailer.getPrev();
        trailer.setPrev(removedNode.getPrev());
        removedNode.getPrev().setNext(trailer);
        size--;
        return removedNode.getElement();
    }

    public int getSize(){
        return size;
    }

}
