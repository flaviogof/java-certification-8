package com.flavio.chapter02.polymorphism;

public class OverloadingError {
    public static void aMethod(byte val) {  System.out.println("byte"); }
    public static void aMethod(short val) {  System.out.println("short"); }

    public static void main(String[] strings) {
            //compiler error: no suitable method found for aMethod(int)
            //aMethod(9);
    }
}
