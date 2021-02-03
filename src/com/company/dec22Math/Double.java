package com.company.dec22Math;

public class Double extends Mathematics {
    Double(double y,double z){
        super(y,z);
    }
    public void addition(){
        double c;
        c=y+z;
        System.out.println("addition  "+c);
    }
    public void subtraction(){
        double d;
        d=z-y;
        System.out.println("subtraction  "+d);
    }
    public void multiply(){
        double e;
        e=y*z;
        System.out.println("multiplication  "+e);
    }
    public void division(){
        double f;
        f=z/y;
        System.out.println("division  "+f);
    }
}
