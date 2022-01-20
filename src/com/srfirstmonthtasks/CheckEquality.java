package com.srfirstmonthtasks;

public class CheckEquality {
    public static void main(String[] args) {

    }

    public static boolean equality(int a, int b, int c, int d) {
        if (a==b || a==c || a==d || b==c || b==d || c==d) {
            return  true;
        }
        return false;
    }
}
