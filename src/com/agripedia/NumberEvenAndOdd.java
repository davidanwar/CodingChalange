package com.agripedia;

public class NumberEvenAndOdd {
    public static void main(String[] args) {
        int number = 1234567895;
        int even = 0;
        int odd = 0;
        int helper = 0;
        while (number != 0) {
            helper = number % 10;
            number = number / 10;
            if (helper % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
    }
}
