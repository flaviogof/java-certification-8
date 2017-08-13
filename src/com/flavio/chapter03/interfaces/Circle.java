package com.flavio.chapter03.interfaces;

public class Circle extends CircularShape {

    private int xPos, yPos, radius;

    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    @Override
    public void roll(float degree) {
        System.out.printf("rolling circle by %f degrees", degree);
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] s) {
        Circle circle = new Circle(10,10,20);
        circle.roll(45);
    }
}
