package com.company.dec19Constructor;
//polymorphism=one name many forms
//it is used to add two different type of values
//parameters se identify ho rha h konsa method call karna hai
//either change type of variables or number of variables
//same name of method can be used for different operation of polymorphism(Main definition )
//Another name of polymorphism is method overloading.one method diff diff kaam kr rha h
public class Polymorphism2 {
    public static void main(String args[]) {
        addition(10,20);
        int add =  addition(2,3,5);
        System.out.println(add);
        addition(2.5,3.5);
        addition();
    }
    static void addition(int a,int b){

        int c;
        c=a+b;
        System.out.println("Value of c is "+c);
    }

    static int addition(int a,int b,int c){
    int k;
    k=a+b+c;
    return k;
    }

    static void addition(double a,double b) {
        double z;
        z=a+b;
        System.out.println("value of z is "+z);

    }
    static void addition() {
        System.out.println("Hello");

    }
}
