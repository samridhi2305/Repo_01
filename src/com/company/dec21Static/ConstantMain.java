package com.company.dec21Static;

public class ConstantMain {
    //only variables and methods can be declared inside class and outside method
    public static void main(String[] args) {


        Constant cons = new Constant(10);//it is a kind of declaration
        System.out.println("value of b is " +Constant.b);
        cons.sum();
        Constant cons1 = new Constant(50);
        cons1.sum();
        Constant cons2 = new Constant(110);
        cons2.sum();
    }
}