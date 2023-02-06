package org.java;

import org.java.stack.*;

public class Test{
    public static void main(String[] args) {
        ArrayStack<Integer> myStack = new ArrayStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
    }
}