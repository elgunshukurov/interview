package com.srfirstmonthtasks;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "sos";
        boolean palindrome = true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                palindrome = false; break;
            }
        }
        if (palindrome) {
            System.out.println(s + " is palindrome");
        } else {
            System.out.println(s + " is not palindrome");
        }
    }
}
