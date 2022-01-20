package com.company;

public class A {

        private String name;
        private B b;

    public A(String name, B b) {
        this.name = name;
        B b1=new B();
        b1.age = this.b.age;
    }

    public String getName() {
        return name;
    }

    public B getB() {
        B b=new B();
        b.age = this.b.age;
        return b;
    }
}
