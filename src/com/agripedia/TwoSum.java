package com.agripedia;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int []number = { 2, 7, 11, 15, 20, 30 };
        int target = 50;
        System.out.println(getSum(number, target));
    }

    private static String getSum(int []number, int target) {
        int result[] = new int[2];
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    result[0] = number[i];
                    result[1] = number[j];

                }
            }
        }
        return Arrays.toString(result);
    }
}
