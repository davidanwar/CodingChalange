package com.agripedia;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int a = 0 ; a <= 100 ; a++){
            if (a % 3 == 0){
                if (a % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else {
                    System.out.println("Fizz");
                }
            }
            else if (a % 5 == 0) {
                System.out.println("Buzz");
        }
            else {
                System.out.println(a);
            }
    }
}
}
