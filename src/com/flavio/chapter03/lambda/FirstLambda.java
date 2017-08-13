package com.flavio.chapter03.lambda;

public class FirstLambda {

    public static void main(String[] args) {
        LambdaFunction lambdaFunction = () -> System.out.println("Hello World!");
        lambdaFunction.call();
    }
}
