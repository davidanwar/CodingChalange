package com.agripedia;

public class PoliandromApp {
    public static void main(String[] args) {
        String kata1 = "davad";
        StringBuilder builder = new StringBuilder();
        for (int i = kata1.length() - 1; i >= 0; i--) {
            builder.append(kata1.charAt(i));
        }
        String kata2 = builder.toString();
        if (kata1.equals(kata2)) {
            System.out.println("This is poliandrom");
        } else {
            System.out.println("This is not poliandrom");
        }
    }
}
