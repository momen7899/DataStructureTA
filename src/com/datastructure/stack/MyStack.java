package com.datastructure.stack;

import com.datastructure.Node;

public interface MyStack {

    void push(Node node);

    Node pop();

    Node peek();

    int size();

    boolean isEmpty();

    String toString();
}
