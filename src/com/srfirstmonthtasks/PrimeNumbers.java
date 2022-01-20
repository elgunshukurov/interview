package com.srfirstmonthtasks;

public class PrimeNumbers {
    public static void main(String[] args) {
        int a = 22;
        for (int i = 2; i < a; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.println(i);
            }
        }
    }
}
