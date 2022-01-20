package com.srfirstmonthtasks;

import java.util.HashMap;
import java.util.Map;

public class DigitsToWords {
    public static void main(String[] args) {
        int a = 22;
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(0,"sifir");
        map1.put(1,"bir");
        map1.put(2,"iki");
        map1.put(3,"uc");
        map1.put(4,"dord");
        map1.put(5,"bes");
        map1.put(6,"alti");
        map1.put(7,"yeddi");
        map1.put(8,"sekkiz");
        map1.put(9,"doqquz");
        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"on");
        map2.put(2,"iyirmi");
        map2.put(3,"otuz");
        map2.put(4,"qirx");
        map2.put(5,"elli");
        map2.put(6,"altmis");
        map2.put(7,"yetmis");
        map2.put(8,"seksen");
        map2.put(9,"doxsan");
        Map<Integer,String> map3 = new HashMap<>();
        map3.put(1,"yuz");
        map3.put(2,"min");

        char[] nums= String.valueOf(a).toCharArray();
        int len = nums.length;

        if (len==1){
            System.out.println(map1.get(a));
        } else if (len==2) {
            System.out.println(map2.get(a/10) + " " + map1.get(a%10));
        } else if (len==3) {
            System.out.println(map1.get(a/100) + " " + map3.get(1) + " " + map2.get((a/10)%10) + " " + map1.get(a%10));
        } else if (len==4) {
            System.out.println(map1.get(a/1000) + " " + map3.get(2) + " " + map1.get((a/100)%10) + " "
                    + map3.get(1) + " " + map2.get((a/10)%10) + " " + map1.get(a%10));
        }

    }
}
