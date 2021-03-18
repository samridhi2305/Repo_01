package com.company.march19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaFeatures {
    public static void main(String[] args) {


//        FunctionalExample f = new ExampleClass();
//        f.myMethod(10, 20);

        FunctionalExample fe = () ->
            System.out.println("Sum = ");

        fe.myMethod();

//        FunctionalExample fe = (a, b) -> {
//            int c = a + b;
//            System.out.println("Sum = " + c);
//        };

//        fe.myMethod(10, 20);

    }
}
