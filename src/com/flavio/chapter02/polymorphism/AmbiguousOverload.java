package com.flavio.chapter02.polymorphism;

public class AmbiguousOverload {

    public static void aMethod (long val1, int val2) {
        System.out.println("long,int");
    }

    public static void aMethod (int val1, long val2) {
        System.out.println("int,long");
    }

    public static void main (String[] args) {
        //compiler error: reference to aMethod is ambiguous
        //aMethod(9, 10);
    }
}
