package com.company.dec21Static;
//static variable ka object nahi banta

public class Constant {
    //only variable or method declaration allowed inside class and outside method
    int a;
    static final int b = 20;

     Constant(int a){
        this.a=a;

     }
     void sum() {
         int c;
         c=a+b;
         System.out.println(c);
     }

}