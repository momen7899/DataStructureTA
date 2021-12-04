package com.datastructure.stack;

import com.datastructure.Node;

public class LinkedListStack implements MyStack {

    private Node list;
    private int size;

    @Override
    public void push(Node node) {
        // push
        list = new Node(node.getValue(), list);
        size++;
    }

    @Override
    public Node pop() {
        // pop
        if (isEmpty()) return null;

        Node last = list;
        list = list.getNext();
        size--;
        return last;
    }

    @Override
    public Node peek() {
        if (isEmpty()) return null;
        return list;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return traverse(list);
    }

    private String traverse(Node first) {
        if (first == null) return "";

        return first.getValue() + "\t" + traverse(first.getNext());
    }

}
