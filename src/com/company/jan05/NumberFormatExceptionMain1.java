package com.company.jan05;
//Exception handling
//if try is successful catch nhi chlega
//Definition-To prevent program from breaking we have to handle code which is prone to exception which is called
// exception handling.
//It is achieved using try and catch block.
//NumberFormatException
public class NumberFormatExceptionMain1 {
    public static void main(String[] args) {
        String a="10";
        String b="Mahajan";
        System.out.println("Hello");
        int c=0;
        int d=0;
        try {
            System.out.println("inside try block");
            c =  Integer.parseInt(a);
            System.out.println("after c "+c);
            d= Integer.parseInt(b);
            System.out.println("after d "+d);
        }
       catch(NumberFormatException e) {
           System.out.println("Inside catch");
           System.out.println(e);
       }
        System.out.println("World");
       int e = c+d;
        System.out.println(e);
    }
}


