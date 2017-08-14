package com.flavio.chapter04.generics;

public class BoxPrinterTest {

    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(1));
        System.out.println(value1);
        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
        System.out.println(value2);
    }
}
