package com.datastructure;

public class MyStack {

    private Node list;
    private int size;

    public void push(Node node) {
        // push
        list = new Node(node.getValue(), list);
        size++;
    }

    public Node pop() {
        // pop
        if (empty()) return null;

        Node last = list;
        list = list.getNext();
        size--;
        return last;
    }

    public Node peek() {
        if (empty()) return null;
        return list;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
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
