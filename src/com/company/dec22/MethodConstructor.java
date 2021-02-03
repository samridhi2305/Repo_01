package com.company.dec22;

public class MethodConstructor {
    int a;
    int b;
    MethodConstructor(int a,int b) {
        this.a=a;
        this.b=b;

    }
    void evaluate() {
        int c;
        c=a+b;
        System.out.println("first value printed\n"+c);
    }
}
