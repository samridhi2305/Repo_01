package com.company.jan05;

import java.nio.charset.IllegalCharsetNameException;
/*if we are sure of the exception then we write exact exception name in catch but
 if we are not sure about the type of exception or if it can throw more than one exception then we use the parent class
 i.e. Exception*/
public class MultipleExceptions3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String c = "50";
        String d = "Mahajan";
        int divideInt=0;
       int f=0;
       int g=0;
       int h = 0;
        try{
            System.out.println("Inside try1");
            divideInt=a/b;
            System.out.println("Inside try line 2");
            f = Integer.parseInt(c);
            g = Integer.parseInt(d);
            h = f+g;
        }
        catch(Exception e){
            System.out.println(e);
        }
      /*  try{
            f = Integer.parseInt(c);
            g = Integer.parseInt(d);
            h = f+g;

                  }
        catch(Exception e){
            System.out.println(e);
        }*/
        System.out.println("Division of numbers is "+divideInt);
        System.out.println("Addition of string value is "+h);
    }
}
