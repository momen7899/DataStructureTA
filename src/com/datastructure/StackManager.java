package com.datastructure;

public class StackManager {

    public void useStack() {
        MyStack stack = new MyStack();

        stack.pop();
        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));
        System.out.println(stack.pop());
        stack.push(new Node(4));
        System.out.println(stack.peek());
        stack.push(new Node(5));

        System.out.println(stack);
    }
}
