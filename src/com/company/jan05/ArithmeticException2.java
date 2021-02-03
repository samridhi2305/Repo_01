package com.company.jan05;

public class ArithmeticException2 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("value of a "+a);
        int b=0;
        System.out.println("value of b is "+b);
        int c=0;
       try {
           System.out.println("Inside try line 1");
            c = a / b;
           System.out.println("Inside try line 2");

       }
       //error that try throws is stored in variable e of type exception
       //if we write wrong exception name then it will not be able to catch it and will show error as program breaks
       catch(RuntimeException e)
       {
           System.out.println("Exception in this class is "+e);
       }
        System.out.println(c);
    }

}
