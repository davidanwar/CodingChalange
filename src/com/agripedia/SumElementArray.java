package com.agripedia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumElementArray {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5};
        int count = sumStream(number);
        System.out.println(count);
        int count2 = sumArray(number);
        System.out.println(count2);

    }

    private static int sumArray(int [] number) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            count = count + number[i];
        }
        return count;
    }

    private static int sumStream(int [] number) {
        int count = IntStream.of(number)
                .reduce(0, (value, index) -> value + index);
        return count;
    }
}
