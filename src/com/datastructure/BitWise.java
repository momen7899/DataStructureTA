package com.datastructure;

public class BitWise {

    void printExamples(){
        System.out.println(7 | 5);

        System.out.println(7 & 5);

        System.out.println(7 ^ 5);

        System.out.println(~(byte) -455);

        int a = 7;
        int b = 8;

        System.out.println("a: "+ a + "\tb:" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: "+ a + "\tb:" + b);
    }
}
