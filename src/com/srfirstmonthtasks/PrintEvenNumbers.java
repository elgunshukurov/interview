package com.srfirstmonthtasks;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int a = 7;

        for (int i = 0; i < a; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
