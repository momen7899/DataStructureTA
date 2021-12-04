package com.datastructure.stack;

import com.datastructure.Node;

public class ArrayListStack implements MyStack {

    private Node[] arr = new Node[1];
    private int top = 0;

    @Override
    public void push(Node node) {
        // push
        if (top >= arr.length) {
            increaseArray();
        }
        arr[top++] = node;
    }

    private void increaseArray() {
        Node[] temp = new Node[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
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
