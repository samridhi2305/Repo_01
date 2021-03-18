package com.company.sahil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConditionalExecution {

    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int c = 40;
        var d = 80;
        var e = d + 10;
        var g = "80";
        var f = g + 10;
        System.out.println(e);
        System.out.println(f);
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
//        Integer y = l.stream().filter(i -> i > 8).findFirst();
//        System.out.println(y);
//        y.stream().forEach(i -> System.out.println(i));

//
//        if(a > b) {
//            System.out.println("a is greater than b");
//        } else if(b > c) {
//            System.out.println("a is smaller than b");
//            System.out.println("b is greater than c");
//        } else {
//            System.out.println("both a and b are smaller than c");
//        }
//
//        if(a < b) {
//            System.out.println("a is less than b");
//            if(b > c) {
//                System.out.println("b is greater than c");
//            }
//        }
    }
}
