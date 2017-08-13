package com.flavio.chapter02.polymorphism;

public class Square extends Shape {

    private int side;
    public Square (int s) { side = s; }

    @Override
    public double area() {
        return side * side;
    }
}
