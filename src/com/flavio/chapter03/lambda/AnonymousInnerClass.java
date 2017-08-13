package com.flavio.chapter03.lambda;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Function function = new Function() {
            @Override
            public void call() {
                System.out.println("Hello World!");
            }
        };
        function.call();
    }
}
