package com.agripedia;

public class LongestWord {
    public static void main(String[] args) {
        System.out.print(LongestWord("I Love You"));
    }

    public static String LongestWord(String sen) {
        String [] kata = sen.split("[^\\w]");
        String longest = "";
        for(String word : kata) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }

}
