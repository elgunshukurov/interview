package com.srfirstmonthtasks;

public class SumOfDigits {
    public static void main(String[] args) {
        int a = 19234045;
        int sum = 0;
        while (a>=1){
            sum = sum +(a%10);
            a = a/10;
        }
        System.out.println(sum);
    }
}
