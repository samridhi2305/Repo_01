package com.company.jan05;

public class Sahil5 {
    public static void main(String[] args) {
        String a = "10";
        String b = "Mahajan";

       int d = division(a,b);
        System.out.println("Division of two numbers is "+d);

    }
    static int division(String a,String b)
    {
        int c = 0;
       try{
            c = Integer.parseInt(a)/Integer.parseInt(b);
       }
       catch(NumberFormatException e){
           System.out.println("exception "+e);
       }
        return(c);
    }
}
