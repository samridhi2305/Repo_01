package com.company.jan05;

public class Sahil71Main {
    public static void main(String[] args) {
        String a = "10";
        String b = "Mahajan";
        Sahil7 sahil7 = new Sahil7();
        int d = 0;
        try {
            d = sahil7.division(a,b);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Hello Sahil Mahajan");
        }

        System.out.println("Division of numbers is "+d);
    }
}
