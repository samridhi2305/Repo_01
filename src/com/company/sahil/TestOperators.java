package com.company.sahil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 100;
        int d = 200;
        int e = 300;
        boolean value = true;
        List<Integer> i = Arrays.asList(1, 2, 3, 4, 5);
        List<String> l = i.stream().map(e1 -> e1 + "2").collect(Collectors.toList());
        Map<Integer, String> m = new HashMap<>();
//        System.out.println(a++);
//        System.out.println(b--);
//        System.out.println(++c);
//        System.out.println(--d);
//        System.out.println(-e);
//        System.out.println(!value);
//
//        System.out.println(a+b);

        int g = a + b * c; // a + (b + c)
        System.out.println(g);

//        System.out.println(a > b); //a is greater than b
//        System.out.println(a < b);
//        System.out.println(a >= c);
//        System.out.println(a <= d);
//        System.out.println(a == b); //a is equal to b
//        System.out.println(a != b); //a is not equal to b

        System.out.println(a > b && d < e); //returns false as one expression is false, other is true
        System.out.println(a > b || d < e); //return true as at least one expression is true

        /* Ternary operator
         * variable var = expression ? value1 : value2
         */

        int var = (a > b) ? a : b; //if a is greater than b, then store a else b in var
        System.out.println(var);

        a += 4; //a = a + 4;
        System.out.println(a);


    }
}
