package com.agripedia.algo;

public class ReverseString {
    public static void main(String[] args) {
        String hello = "Hello";
        StringBuilder builder = new StringBuilder();
        String [] character = hello.split("");
        for (int i = hello.length() - 1; i >= 0; i--) {
            builder.append(hello.charAt(i));
        }
        System.out.println(builder);
        StringBuilder stringBuilder = new StringBuilder(hello);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
