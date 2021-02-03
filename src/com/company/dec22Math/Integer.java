package com.company.dec22Math;

public class Integer extends Mathematics {
    Integer(int a,int b){
        super(a,b);
    }
    public void addition(){
        super.addition();
     int c;
     c=a+b;
        System.out.println("addition of int a and int b "+c);
    }
    public void subtraction(){
        int d;
        d=b-a;
        System.out.println("subtraction of a and b is "+d);
    }
    public void multiply(){
        int e;
        e=a*b;
        System.out.println("multiplication of a and b is "+e);
    }
public void division(){
        int f;
        f=b/a;
    System.out.println("division of a and b is "+f);
}
}
