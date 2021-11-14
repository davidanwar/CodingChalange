package com.agripedia;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String s = "Java Spring (*^$$%@)(_)@";
        String s2 = "Java Spring (*^$$%@)(_)@";
        StringBuilder stringBuilder = new StringBuilder();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String s2R = s2.replaceAll("\\s", "");
        System.out.println(s);
        System.out.println(s2R);
    }
}
