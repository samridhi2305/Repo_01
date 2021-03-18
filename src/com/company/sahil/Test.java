package com.company.sahil;

public class Test {
    int a;

    {
        System.out.println("Normal block");
    }
    Test() {
        System.out.println("Constructor");
    }
    void something() {
        System.out.println("something");
    }
    static void nothing() {
        System.out.println("Nothing");
    }
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.something();
        Test.nothing();
    }
}
class Class2 {

}
