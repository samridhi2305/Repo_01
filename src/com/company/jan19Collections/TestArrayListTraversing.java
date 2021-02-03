package com.company.jan19Collections;

import java.util.ArrayList;

public class TestArrayListTraversing {
    public static void main(String[] args) {
        ArrayList<String> arr  = new ArrayList<>();
        arr.add("Sahil");
        arr.add("Samridhi");
        arr.add("Manu bhaiya");
        arr.add("Abc");
        arr.add("Def");

        String e = arr.get(3);
        System.out.println(e);
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        arr.remove(3);

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }





    }
}
