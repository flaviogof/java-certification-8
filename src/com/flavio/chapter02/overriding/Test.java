package com.flavio.chapter02.overriding;

public class Test {
    public static void main(String []args) {
        Circle c1 = new Circle(10, 20, 30);
        //Compiler error: incompatible types: Shape cannot be converted to Circle
        //Circle c2 = c1.copy();
        Circle c2 = (Circle) c1.copy();
    }
}
