package com.company.jan19Collections;

//ArrayList can contain duplicates
//Hashset does not contain duplicate elements

import java.util.ArrayList;
import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(6);
        for (Integer k:arr){
            System.out.println(k);
        }

        System.out.println("Next Loop ");

        HashSet<Integer> hash = new HashSet<>();
        hash.add(7);
        hash.add(8);
        hash.add(9);
        hash.add(7);
        hash.add(9);
        hash.add(10);
        for (Integer m:hash){
            System.out.println(m);
        }





    }
}
