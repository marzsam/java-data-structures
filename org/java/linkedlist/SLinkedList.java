package org.java.linkedlist;

import org.java.node.Node;

public class SLinkedList<E> {
    
    protected Node<E> head;
    protected int size;

    public SLinkedList(){
        head = null;
        size = 0;
    }

    public void addFirst(E element){
        Node<E> newHead = new Node<E>(element, head);
        head = newHead;
        size++;
    }

    public void addLast(E element){
        Node<E> newTail = new Node<E>(element, null);
        
        if(head == null){
            head = newTail;
        }
        else{
            Node<E> node = head;
            while(node.getNext()!=null)
                node = node.getNext();
            node.setNext(newTail);
        }

        size++;
    }

    public E removeFirst(){
        if(head == null)
            throw new EmptyLinkedListException("linked list is empty");

        E element = head.getElement();
        head = head.getNext();
        size--;
        
        return element;
    }

    public E removeLast(){
        if(head == null)
            throw new EmptyLinkedListException("linked list is empty");

        if(size == 1)
            return removeFirst();
        
        Node<E> node = head;
        while(node.getNext().getNext()!=null)
            node = node.getNext();
        E element = node.getNext().getElement();
        node.setNext(null);

        size--;
        
        return element;
    }

    public int getSize(){
        return size;
    }

    public String toString(){
        String str = "";

        if(size == 0)
            return str;
        
        Node<E> node = head;
        str += "[";
        str += node.getElement().toString();
        if(node.getNext()!=null)
                str+=", ";
        while(node.getNext()!=null){
            node = node.getNext();
            str+= node.getElement().toString();
            if(node.getNext()!=null)
                str+=", ";
        }
        str += "]";

        return str;
        
    }

}
