package com.flavio.chapter02.encapsulation.appcanvas;

import com.flavio.chapter02.encapsulation.graphicshape.Circle;

public class Canvas {

    void getArea() {
        Circle circle = new Circle();
        // call to public method area(), outside package
        circle.area();
    }
}
