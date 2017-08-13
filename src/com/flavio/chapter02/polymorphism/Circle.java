package com.flavio.chapter02.polymorphism;

public class Circle extends Shape {

    private int xPos;
    private int yPos;
    private int radius;

    public Circle (int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    public Circle (int x, int y) {
        this(x, y, 10);
    }

    public Circle () {
        this(20, 20, 10);
    }

    public Circle(int r) { radius = r; }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public void fillColor (int red, int green, int blue) {
        /* color the circle using RGB color values – actual code elided */
    }

    public void fillColor (float hue, float saturation, float brightness) {
        /* color the circle using HSB values – actual code elided */
    }

    @Override
    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    public static void main (String[] strings) {
        System.out.println(new Circle());
        System.out.println(new Circle(50, 100));
        System.out.println(new Circle(25, 50, 5));
    }
}
