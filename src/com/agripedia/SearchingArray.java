package com.agripedia;

public class SearchingArray {
    public static void main(String[] args) {
        int [] numbers = {12,45,12,65,12,96,23,50};
        int searchingNumber = 50;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (searchingNumber == numbers[i]) {
                System.out.println("Number " + searchingNumber + " telah ditemukan pada index ke : " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Angka tidak ditemukaa");
        }
    }
}
