package com.company.sahil;

public class TestModifiers {
    public int a;
    private int b;
    protected int c;
    int d;
    public void something() {
        TestModifiers t = new TestModifiers();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        System.out.println(t.d);
    }
}
