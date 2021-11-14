package com.agripedia;



public class ReverseWords {
    public static void main(String[] args) {
        String job = "Java Spring Developer";
        StringBuilder builder = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        String[] words = job.split(" ");
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                builder.append(word.charAt(i));
            }
            reverse.append(builder);
            reverse.append(" ");
            builder = builder.delete(0, builder.length());
        }
        System.out.println(reverse);
    }
}
