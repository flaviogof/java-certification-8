package com.flavio.chapter03.lambda;

public class PigLatin {
    public static void main(String[] args) {
        final String world = "hello";
        SuffixFunction suffixFunction = () -> System.out.println(world + "ay");
        //Compile error: error: local variables referenced from a lambda expression must be final
        //or effectively final
        //world = "e";
        suffixFunction.call();
    }
}
