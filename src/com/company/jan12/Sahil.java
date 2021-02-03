package com.company.jan12;

public class Sahil {
    public static void main(String[] args) {
        String s  = "Sahil";
        int a = 10;
        try{
            //int x = a/0;
            Integer i = Integer.parseInt("Sahil");
            int x = a/0;
        }
        catch(NumberFormatException | ArithmeticException e){
            System.out.println("Exception is "+e);
        }
    }
}
