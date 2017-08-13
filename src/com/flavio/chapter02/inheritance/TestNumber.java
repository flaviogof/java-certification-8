package com.flavio.chapter02.inheritance;

public class TestNumber {

    public static double sum (Number[] nums) {
        double sum = 0.0;
        for (Number number : nums) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main (String[] params) {
        Number[] numbers = new Number[4];
        numbers[0] = new Byte((byte) 10);
        numbers[1] = new Integer( 10);
        numbers[2] = new Float(10.0f);
        numbers[3] = new Double(10.0f);

        System.out.println("The sum of numbers is: " + sum(numbers));

    }
}
