package com.company.dec19Constructor;
//this keyword is used to refer instance variable
//this.a is class variable and a is a local variable
public class ThisAddition {
    int a;
    int b;
    int z;// if not initialized then its default value is zero
    ThisAddition(int a,int b) {
        this.a=a;
        this.b=b;
    }
    void add() {
        int c;
        c=a+b;
        System.out.println(c);
        System.out.println(z);
    }
}
