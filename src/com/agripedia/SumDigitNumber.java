package com.agripedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDigitNumber {
    public static void main(String[] args) {
        int number = 1234;
        int temp = 0;
        int count = 0;
        List<Integer> integers = new ArrayList<>();
        while (number > 0) {
            temp = number % 10;
            number = number /10;
            integers.add(temp);
        }
        for(Integer i : integers) {
            count = count + i;
        }
        System.out.println(count);
        System.out.println(sum(1234));

    }

    private static int sum(int number) {
        String numberString = String.valueOf(number);
        List<Character> arrayString = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < numberString.length(); i++) {
            arrayString.add(numberString.charAt(i));
        }
        for (char i : arrayString) {
            integers.add(Integer.parseInt(String.valueOf(i)));
        }
        int count = integers.stream()
                .reduce(0, (value, item) -> value + item);
        return count;
    }
}
