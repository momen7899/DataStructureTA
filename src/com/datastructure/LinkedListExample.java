package com.datastructure;

public class LinkedListExample {

    public void printExamples() {
        Node first = methodA();
        System.out.println("Method A");
        traverse(first);

        System.out.println("\nMethod B");
        first = methodB();
        traverse(first);
    }

    private void traverse(Node first) {
        if (first == null) return;

        System.out.print(first.getValue() + "\t");
        traverse(first.getNext());
    }

    private Node methodA() {
        Node first = new Node(1);
        first.setNext(new Node(2));
        first.getNext().setNext(new Node(3));
        first.getNext().getNext().setNext(new Node(4));
        first.getNext().getNext().getNext().setNext(new Node(5));
        first.getNext().getNext().getNext().getNext().setNext(new Node(6));
        return first;
    }

    private Node methodB() {
        Node first = new Node(1);
        first = new Node(2, first);
        first = new Node(3, first);
        first = new Node(4, first);
        first = new Node(5, first);
        first = new Node(6, first);
        return first;
    }
}
