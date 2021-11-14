package com.agripedia.algo;

public class ReverseInteger {
    public static void main(String[] args) {
        int reverse = 0;
        int angka = 125;
        while (angka > 0) {
            reverse = reverse * 10 + angka % 10;
            angka = angka / 10;
        }
        System.out.println(reverse);

    }
}
