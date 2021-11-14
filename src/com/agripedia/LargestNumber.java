package com.agripedia;

import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 30;
        int d = 100;
        int e = 75;
        int temp = 0;
        int largest = 0;
        List<Integer> number = List.of(a, b, c, d, e);
        for (int i = 0; i < number.size(); i++) {
            for (int j = i + 1; j < number.size(); j++) {
                if (number.get(i) > number.get(j)) {
                    temp = number.get(i);
                }
            }
            if (temp > largest) largest = temp;
        }
        System.out.println(largest);
    }


}
