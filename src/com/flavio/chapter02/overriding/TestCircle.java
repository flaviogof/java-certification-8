package com.flavio.chapter02.overriding;

import java.util.HashSet;
import java.util.Set;

public class TestCircle {
    public static void main(String []args) {
        Set<Circle> circleList = new HashSet<Circle>();
        circleList.add(new Circle(10, 20, 5));
        //if you’re using an object in containers like HashSet or HashMap, make sure you override the hashCode()
        //and equals() methods correctly
        System.out.println(circleList.contains(new Circle(10, 20, 5)));
    }
}
