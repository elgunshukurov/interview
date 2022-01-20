package com.company;

import java.io.UncheckedIOException;

public class Main {

    public static void main(String[] args) throws Exception {
        B b = new B();
        b.age = 5;
        A a = new A("Elgun", b);
        a.getB().age = 7;
        b.age=9;
        System.out.println(a.getB().age);


    }


}
