package com.flavio.chapter04.generics;

public class PairTest {
    public static void main(String []args) {
        Pair<Integer, String> worldCup = new Pair<Integer, String>(2018, "Russia");
        System.out.println("World cup " +  worldCup.getFirst() +
                " in " + worldCup.getSecond());

        Pair<Integer, String> worldCup1 = new Pair<>(2022, "Qatar");
        System.out.println("World cup " +  worldCup1.getFirst() +
                " in " + worldCup1.getSecond());
    }
}
