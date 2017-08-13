package com.flavio.chapter03.abstractclasses;

public class Rectangle extends Shape {

    private int length, height;

    @Override
    public double area() {
        return length * height;
    }
}
