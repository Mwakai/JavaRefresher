package com.mwakai.coursera;

public class Test2 {

    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        c1.method1();
        c1.method2();
    }
}

interface MyInterface {
    void method1();
    void method2();
}

class MyClass implements MyInterface {
    public void method1() {
        System.out.println("method 1");
    }

    public void method2() {
        System.out.println("method 2");
    }
}
