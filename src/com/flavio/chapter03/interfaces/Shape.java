package com.flavio.chapter03.interfaces;

abstract class Shape {

    abstract double area();
    private Shape parentShape;

    public void setParentShape (Shape shape) {
        parentShape = shape;
    }

    public Shape getParentShape() {
        return parentShape;
    }
}
