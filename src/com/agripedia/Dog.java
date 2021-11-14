package com.agripedia;

import java.util.ArrayList;
import java.util.List;

public class Dog {

    public static void main(String[] args) {
        String [] array = {"X:-1", "Y:1", "X:-4", "B:3", "X:5"};
        int temp = 0;
        int longest = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].substring(0, 1).equals(array[j].substring(0, 1))) {
                    temp = Integer.parseInt(array[j].substring(2, 4)) + Integer.parseInt(array[j].substring(2, 4));
                }

            }
        }
    }

}
