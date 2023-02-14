package org.jds;

import org.jds.*;
import org.jds.linkedlist.CircleLinkedList;

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

        /* 
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
        */

        CircleLinkedList<Integer> cll = new CircleLinkedList<Integer>();
        cll.add(10);
        cll.add(20); 
        cll.add(30);
        cll.add(40);
        System.out.println(cll.toString());

    }
}