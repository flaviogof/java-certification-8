package com.flavio.chapter04.generics;

public class PairOfT<T> {
    T object1;
    T object2;
    PairOfT(T one, T two) {
        object1 = one;
        object2 = two;
    }
    public T getFirst() {
        return object1;
    }
    public T getSecond() {
        return object2;
    }
}
