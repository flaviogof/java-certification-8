package com.flavio.chapter02.polymorphism;

public class HappyBirthday {

    public static void wish (String name) {
        System.out.println("Happy Birthday " + name + "!");
    }

    public static void wish() {
        wish("to you");
    }

    public static void main (String[] strings) {
        wish();
        wish("dear James Gosling");
    }
}
