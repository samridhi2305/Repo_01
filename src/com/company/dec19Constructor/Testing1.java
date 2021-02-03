package com.company.dec19Constructor;
//In this class constructor is used to initialize a class/instance variable
//we can never initialize local variables using constructor .eg "k"
//task to be performed when a class is loaded/its object is created,we write that logic in constructor
public class Testing1 {
    int a;
    int b;

    Testing1(int x, int y) {
        a=x;
        b=y;
        System.out.println("Hello,you are in testing class");
    }
    void sum(){
        int k;
        int c;
        c=a+b;
        System.out.println("Value of c is "+c);
    }

}
