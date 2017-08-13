package com.flavio.chapter02.overriding;

public class Point2D {

    private int xPos, yPos;

    public Point2D(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public String toString() {
        return "x = " + xPos + ", y = " + yPos;
    }
    public static void main(String []args) {
        System.out.println(new Point2D(10, 20));
    }
}
