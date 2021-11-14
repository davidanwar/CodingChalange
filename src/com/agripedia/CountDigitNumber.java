package com.agripedia;

public class CountDigitNumber {
    public static void main(String[] args) {
        int number = 123456789;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}
