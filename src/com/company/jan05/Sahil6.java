package com.company.jan05;

public class Sahil6 {
    public static void main(String[] args) {
        String a = "10";
        String b = "Mahajan";

        int d = 0;
        try {
            d = division(a, b);

        }

        catch(RuntimeException e)
        {
            System.out.println("exception");
        }
        System.out.println("Division of two numbers is "+d);
    }
    static int division(String a,String b)
    {
        int c =0;
        c = Integer.parseInt(a)/Integer.parseInt(b);
        return(c);
    }
}
