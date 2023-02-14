package org.java;

import org.java.*;
import org.java.linkedlist.SLinkedList;

public class Test{
    public static void main(String[] args) {
        /* 
        ArrayStack<Integer> myStack = new ArrayStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        */
        SLinkedList<Integer> sll = new SLinkedList<>();
        sll.addFirst(1);
        sll.addFirst(0);
        sll.addFirst(-1);
        sll.addLast(2);
        sll.addFirst(-2);
        sll.removeLast();
        sll.removeFirst();
        sll.removeFirst();
        sll.addLast(2);
        //sll.addLast(15);
        //sll.addFirst(5);
        System.out.println(sll.toString());
        System.out.println(sll.getSize());

    }
}