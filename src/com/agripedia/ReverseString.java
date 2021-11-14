package com.agripedia;

public class ReverseString {
    public static void main(String[] args) {
        String str = "david";
        System.out.println(reverse(str));
        System.out.println(reverseManually(str));

    }

    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String reverseManually(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
