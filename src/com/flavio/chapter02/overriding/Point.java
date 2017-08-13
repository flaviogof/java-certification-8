package com.flavio.chapter02.overriding;

public class Point {

    private int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public String toString() {
        return "x = " + xPos + ", y = " + yPos;
    }

    //Compile error: attempting to assign weaker access privileges; was public
    /*
    protected String toString() {
        return "x = " + xPos + ", y = " + yPos;
    }
    */

    //Compile error: return type Object is not compatible with String
    /*
    public Object toString() {
        return "x = " + xPos + ", y = " + yPos;
    }
    */

    //the compiler doesn’t complain. But this is a new method named ToString and it has nothing to do with the toString method in Object
    public String ToString() {
        return "x = " + xPos + ", y = " + yPos;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (other instanceof Point) {
            Point anotherPoint = (Point) other;
            if( (xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos) ) {
                return true;
            }
        }

        return false;

    }

    public static void main (String[] args) {
        System.out.println(new Point(10,20));

        Object p1 = new Point(10, 20);
        Object p2 = new Point(50, 100);
        Object p3 = new Point(10, 20);

        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));
    }
}
