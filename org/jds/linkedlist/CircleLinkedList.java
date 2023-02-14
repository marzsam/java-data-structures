package org.jds.linkedlist;

import org.jds.node.Node;

public class CircleLinkedList<E> {
    
    protected Node<E> cursor;
    protected int size;

    public CircleLinkedList(){
        cursor = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public Node<E> getCursor(){
        return cursor;
    }

    public void advance(){
        if(cursor==null)
            throw new EmptyLinkedListException("the circulary linked list is empty");
        cursor = cursor.getNext();
    }

    public void add(E element){
        if(size == 0){
            cursor = new Node<E>(element, null);
            cursor.setNext(cursor);
        }
        else{
            Node<E> newNode = new Node<E>(element, cursor.getNext());
            cursor.setNext(newNode);    
        }
        size++;
    }

    public E remove(){
        if(size == 0)
            throw new EmptyLinkedListException("the circulary linked list is empty");
        
        Node<E> removedNode = cursor.getNext();

        if(size == 1){
            cursor = null;
        }
        else{
            cursor.setNext(removedNode.getNext());
        }
        
        size--;

        return removedNode.getElement();

    }

    public String toString(){
        if(size == 0)
            return "[]";
        
        Node<E> node = cursor;
        String str = "["+node.getElement().toString();
        while(node.getNext()!=cursor){
            node = node.getNext();
            str+=", "+node.getElement().toString();
        }
        str+="]";

        return str;
    }

}
