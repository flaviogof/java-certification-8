package com.flavio.chapter04.generics;

public class BoxPrinter<T> {
    private T val;
    public BoxPrinter(T arg) {
        val = arg;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }
}
