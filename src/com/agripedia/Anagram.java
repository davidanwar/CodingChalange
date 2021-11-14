package com.agripedia;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        boolean jadi = isAnagram("budi", "idub");
        System.out.println(jadi);
    }

    private static boolean isAnagram(String str1, String str2) {
        char[] kata1 = new char[str1.length()];
        char[] kata2 = new char[str1.length()];
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                kata1[i] = str1.charAt(i);
                kata2[i] = str2.charAt(i);
            }
        }
        Arrays.sort(kata1);
        Arrays.sort(kata2);
        if (Arrays.equals(kata1, kata2)) {
            return true;
        } else {
            return false;
        }
    }
}
