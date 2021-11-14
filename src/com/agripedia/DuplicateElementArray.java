package com.agripedia;

import java.util.Arrays;

public class DuplicateElementArray {
    public static void main(String[] args) {
        String[] array = {"Java", "C++", "Ruby", "Rust", "C#", "Java"};
//        Arrays.stream(array).filter(data -> data.equals(data))
//                .forEach(data -> System.out.println(data));
        String duplicate = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) duplicate = array[i];
            }
        }
        System.out.println(duplicate);
    }
}
