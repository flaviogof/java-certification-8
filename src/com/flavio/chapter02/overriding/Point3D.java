package com.flavio.chapter02.overriding;

public class Point3D extends Point2D {
    private int zPos;

    //Compiler error: call to super must be first statement in constructor
    /*
    public Point3D (int x, int y, int z) {
        zPos = z;
        super (x, y);
    }
    */

    public Point3D (int x, int y, int z) {
        super (x, y);
        zPos = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z = " + zPos;
    }

    public static void main(String []args) {
        System.out.println(new Point3D(10, 20, 30));
    }
}
