package com.flavio.chapter02.singleton;

public class Counter {

    private static int count;

    static {
        // code in this static block will be executed when
        // the JVM loads the class into memory
        count = 1;
    }

    Counter(int c) {

    }

    public Counter() {
        count++;
    }

    public void printCount() {
        System.out.println("Number of instances created so far is: " + count);
    }

    public static void main(String[] args) {
        Counter anInstance = new Counter();
        anInstance.printCount();
        Counter anotherInstance = new Counter();
        anotherInstance.printCount();
    }
}
