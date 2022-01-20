package com.srfirstmonthtasks;

public class ReverseChars {
    public static void main(String[] args) {
        String s = "hELlO";
        StringBuilder n = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char m = s.charAt(i);
            if (Character.isUpperCase(m)) {
                n.append(Character.toLowerCase(m));
            } else {
                n.append(Character.toUpperCase(m));
            }
        }
        System.out.println(n);
    }
}
