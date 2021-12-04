package com.datastructure.stack;

import com.datastructure.Node;

public class StackManager {

    public void linkedListStack() {
        LinkedListStack stack = new LinkedListStack();
        stackExample(stack);
    }

    public void arrayStack() {
        ArrayStack stack = new ArrayStack(15);
        stackExample(stack);
    }

    public void arrayListStack() {
        ArrayListStack stack = new ArrayListStack();
        stackExample(stack);
    }

    private void stackExample(MyStack stack) {
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
