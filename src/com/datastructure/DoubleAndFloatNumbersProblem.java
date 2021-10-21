package com.datastructure;

public class DoubleAndFloatNumbersProblem {


    public void printExamples() {
        double doubleOne = 1;
        double doubleTwo = 2;

        // right
        System.out.println(doubleOne * doubleTwo);

        doubleOne = 0.111111;
        doubleTwo = 0.3;

        // wrong
        System.out.println(doubleOne * doubleTwo);

        doubleOne = 0.1234567;
        doubleTwo = 0.7654321;

        float floatOne = (float) doubleOne;
        float floatTwo = (float) doubleTwo;

        // it should print true but it shouldn't
        System.out.println((doubleOne * doubleTwo) == (floatOne * floatTwo));
        System.out.println((floatOne * floatTwo));

    }
}
