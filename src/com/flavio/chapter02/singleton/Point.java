package com.flavio.chapter02.singleton;

public class Point {

    private int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    int getX() { return xPos; }

    int getY() { return yPos; }

    public String toString() {
        return "x = " + xPos + ", y = " + yPos;
    }
}
