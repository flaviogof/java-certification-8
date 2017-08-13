package com.flavio.chapter02.overriding;

public class Circle extends Shape {

    private int xPos, yPos, radius;

    public Circle(int x, int y, int r) {
        this.xPos = x;
        this.yPos = y;
        this.radius = r;
    }

    @Override
    public boolean equals(Object arg) {
        if (arg == null) {
            return false;
        }

        if (this == arg) {
            return true;
        }

        if (arg instanceof Circle) {
            Circle that = (Circle) arg;
            if( (this.xPos == that.xPos) &&
                (this.yPos == that.yPos) &&
                (this.radius == that.radius )) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (7 * xPos) ^ (11 * yPos) ^ (53 * yPos);
    }

    @Override
    public Shape copy() {
        return new Circle(10, 10, 10);
    }
}
