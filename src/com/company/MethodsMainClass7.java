package com.company;

public class MethodsMainClass7 {
    public static void main(String args[]) {
        int a=2;
        int b=3;
        MethodsMathClass7 abc = new MethodsMathClass7();//relation bann gya between these two classes via object abc

        abc.addition(a,b);
        //object holds all the methods of a class whose object it is as it refers to that particular class
    }
}
