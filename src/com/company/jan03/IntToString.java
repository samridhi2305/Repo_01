package com.company.jan03;

public class IntToString {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        /*String s =Integer.toString(a);
        String s2 = Integer.toString(b);*/
        String concatination=Integer.toString(a)+Integer.toString(b);;
        System.out.println(concatination);

        int c = 501000;

        //String newC= Integer.toString(c);
        //length = newC.length();

       int leng = Integer.toString(c).length();

        double d = 10.34;
        String z=Double.toString(d);
        int len=z.length();
        System.out.println(len);

    }

}
