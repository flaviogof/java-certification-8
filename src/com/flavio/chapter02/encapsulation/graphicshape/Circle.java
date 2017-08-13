package com.flavio.chapter02.encapsulation.graphicshape;

public class Circle extends Shape {

    private int radius;

    public void area() {
        System.out.println("area: " + 3.14 + radius * radius);
    }

    void fillColor() {
        System.out.println("Color: " + color);
    }
}
