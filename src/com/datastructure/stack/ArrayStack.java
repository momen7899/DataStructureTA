package com.datastructure.stack;

import com.datastructure.Node;

public class ArrayStack implements MyStack {

    private Node[] arr;
    private int top = 0;

    public ArrayStack(int size) {
        this.arr = new Node[size];
    }

    @Override
    public void push(Node node) {
        // push
        if (top >= arr.length) {
            System.out.println("Stack is full");
            return;
        }
        arr[top++] = node;
    }

    @Override
    public Node pop() {
        // pop
        if (isEmpty()) return null;
        return arr[--top];
    }

    @Override
    public Node peek() {
        if (isEmpty()) return null;
        return arr[top - 1];
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size(); i++) {
            s += arr[i].getValue() + " , ";
        }
        return s;
    }

}
