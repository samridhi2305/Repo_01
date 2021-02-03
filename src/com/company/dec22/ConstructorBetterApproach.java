package com.company.dec22;

public class ConstructorBetterApproach {
    int a;
    ConstructorBetterApproach(int a){
        this.a=a;
    }
    void multiple(int value){
        int c;
        c=value*a;
        System.out.println(c);
    }
}
