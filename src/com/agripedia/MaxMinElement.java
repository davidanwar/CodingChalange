package com.agripedia;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxMinElement {
    public static void main(String[] args) {
        int [] number2 = {19, 7, 15, 10, 12, 11, 16};
        int max = 0;
        int min = 100;
        for (int i = 0; i < number2.length; i++) {
            if (number2[i] > max) max = number2[i];
            if (number2[i] < min) min = number2[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("========= Stream Algorithm ============");
        OptionalInt max1 = IntStream.of(number2)
                .max();
        max1.ifPresent(data -> System.out.println(data));
        OptionalInt min1 = IntStream.of(number2)
                .min();
        min1.ifPresent(data -> System.out.println(data));
    }
}
