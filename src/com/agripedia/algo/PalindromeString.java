package com.agripedia.algo;

public class PalindromeString {
    public static void main(String[] args) {
        String kata = "kaya";
        StringBuilder reverse = new StringBuilder(kata).reverse();
        String kata2 = reverse.toString();
        if (kata.equals(kata2)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
