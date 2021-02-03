package com.company.jan19Collections;

import java.awt.*;

//primitive datatype and its Wrapper classes are very much compatible to each other.
public class IntegerIntCompatibility {
    public static void main(String[] args) {
        Integer i =1;
        Integer z = 2;
        Integer add = i+z;
        System.out.println(add);
        int addition = i+z;
        System.out.println(addition);
        String s = "10";
        Integer m = Integer.parseInt(s);//Autoboxing performed autaomatically.int converteed to Integer automatically.
        int o = m;
        System.out.println(m);
        int n = Integer.parseInt(s);//ParseInt return int value
        System.out.println(n);


    }
}
