package com.company.dec22Math;

public class Mathematics {
    int a;
    int b;
    double y;
    double z;
    Mathematics(int a, int b){
        this.a=a;
        this.b=b;
    }
    Mathematics(double y, double z){
        this.y=y;
        this.z=z;
    }
    public void printNumbers(){
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
    }
public void addition(){
    System.out.println("Addition of two numbers");
}
public void subtraction(){}
public void multiply(){}
public void divide(){}

}
