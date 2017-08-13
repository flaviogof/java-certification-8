package com.flavio.chapter03.finalkeyword;

public class Circle extends Shape {

    @Override
    public Shape getParentShape() {
        return super.getParentShape();
    }

    //Compile error: cannot override the final method from
    /*
    @Override
    public void setParentShape(Shape shape) {
        super.setParentShape(shape);
    }
    */
}
