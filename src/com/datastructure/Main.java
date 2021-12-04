package com.datastructure;

import com.datastructure.stack.StackManager;

public class Main {

    public static void main(String[] args) {
//        new BitWise().printExamples();

//        new DoubleAndFloatNumbersProblem().printExamples();

//        new LinkedListExample().printExamples();

        StackManager stackManager = new StackManager();

        stackManager.linkedListStack();
        stackManager.arrayStack();
        stackManager.arrayListStack();

//        new Sudoku().solve();
    }
}
